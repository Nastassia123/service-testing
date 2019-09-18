package SQLRepository;

import Entities.Certificate;
import RepositoryInterfaces.CertificateRepository;
import RepositorySpecification.CertificateSpecification;
import RepositorySpecification.Specification;
import sqlconnection.SQLConnect;
import CertificateRepository.CertificateMapper;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class CertificateRepositoryImpl implements CertificateRepository {

    private static final String QUERY_FOR_ADD_REQUEST = "INSERT INTO certificate VALUES(?, ?, ?, ?, ?)";
    private static final String QUERY_FOR_UPDATE_REQUEST = "UPDATE certificate set name = ? WHERE id_certificate = ?";
    private static final String QUERY_FOR_REMOVE_REQUEST = "DELETE from certificate WHERE name= ?";

    @Override
    public int add(Certificate certificate) throws SQLException {

        String generatedColumns[] = {"BATCHID"};

        PreparedStatement statement = new SQLConnect().SQLConnection().prepareStatement(QUERY_FOR_ADD_REQUEST, generatedColumns);
        statement.setLong(1, certificate.getId());
        statement.setString(2, certificate.getName());
        statement.setDate(3, Date.valueOf(certificate.getDateOfCreation()));
        statement.setDate(4, Date.valueOf(certificate.getDateOfModification()));
        statement.setDouble(5, certificate.getPrice());
        statement.execute();
        ResultSet generatedKeys = statement.getGeneratedKeys();
        int z = 0;
        if (generatedKeys.next())
            z = generatedKeys.findColumn("id");
        return z;
    }

    @Override
    public int update(Certificate certificate) throws SQLException {

        PreparedStatement statement = new SQLConnect().SQLConnection().prepareStatement(QUERY_FOR_UPDATE_REQUEST);
        statement.setString(1, "Nastassia2");
        statement.setInt(2, 2);
        int i = statement.executeUpdate();
        return i;
    }

    @Override
    public int remove(Certificate certificate) throws SQLException {

        PreparedStatement statement = new SQLConnect().SQLConnection().prepareStatement(QUERY_FOR_REMOVE_REQUEST);
        statement.setString(1, certificate.getName());
        int i = statement.executeUpdate();
        return i;
    }


    @Override
    public List<Certificate> getObjects(Specification specification) throws SQLException {
        return null;
    }


    public  List<Certificate>  getObjects(CertificateSpecification certficateSpecification) throws SQLException {

        List<Certificate> certificateList = new ArrayList<>();

        PreparedStatement statement = new SQLConnect().SQLConnection().prepareStatement(certficateSpecification.returnQueueOfEntity());
        ResultSet rs = statement.executeQuery();
        return(new CertificateMapper().readCertificatesToList(rs));

    }
}