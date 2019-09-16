package CertificateRepository;

import Entities.Certificate;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CertificateMapper {


    public List<Certificate> readCertificatesToList(ResultSet rs) throws SQLException {
        List<Certificate> certificateList = new ArrayList<>();
        while (rs.next()) {
            long id = rs.getLong("id_certificate");
            String name = rs.getString("Name");
            String dateOfCreation = rs.getString("date_of_creation");
            String dateOfModification = rs.getString("date_of_modification");
            double price = rs.getDouble("price");
            certificateList.add(new Certificate(id, name, dateOfCreation, dateOfModification, price) {
            });
        }
        return certificateList;
    }


}