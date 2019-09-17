package SQLRepository;

import Entities.Certificate;
import RepositoryInterfaces.CertificateRepository;
import RepositorySpecification.CertificateSpecification;
import RepositorySpecification.SelectAllCertificate;
import RepositorySpecification.Specification;
import RepositorySpecification.TagSpecification;
import sqlconnection.SQLConnect;
import CertificateRepository.CertificateMapper;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class CertificateRepositoryImpl implements CertificateRepository {

    static final String queryForAddRequest = "INSERT INTO certificate VALUES(?, ?, ?, ?, ?)";
    static final String queryForUpdateRequest = "UPDATE certificate set name = ? WHERE id_certificate = ?";
    static final String queryForRemoveRequest = "DELETE from certificate WHERE name= ?";

    @Override
    public int add(Certificate certificate) throws SQLException {

        String generatedColumns[] = {"BATCHID"};

        PreparedStatement statement = new SQLConnect().SQLConnection().prepareStatement(queryForAddRequest, generatedColumns);
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

        PreparedStatement statement = new SQLConnect().SQLConnection().prepareStatement(queryForUpdateRequest);
        statement.setString(1, "Nastassia2");
        statement.setInt(2, 2);
        int i = statement.executeUpdate();
        return i;
    }

    @Override
    public int remove(Certificate certificate) throws SQLException {

        PreparedStatement statement = new SQLConnect().SQLConnection().prepareStatement(queryForRemoveRequest);
        statement.setString(1, certificate.getName());
        int i = statement.executeUpdate();
        return i;
    }


    @Override
    public List<Certificate> getObjects(Specification specification) throws SQLException {
        return null;
    }


    public List<Certificate> getObjects(CertificateSpecification certficateSpecification) throws SQLException {

        List<Certificate> certificateList = new ArrayList<>();

        PreparedStatement statement = new SQLConnect().SQLConnection().prepareStatement(certficateSpecification.returnQueueOfEntity());
        ResultSet rs = statement.executeQuery();
        return  (new CertificateMapper().readCertificatesToList(rs));
    }
}