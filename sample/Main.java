package sample;


import RepositorySpecification.TagSpecification;
import SQLRepository.CertificateRepositoryImpl;
import Entities.Certificate;
import sqlconnection.SQLConnect;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {

    public static void main(String[] args) throws SQLException, ParseException  {
        SQLConnect sqlConnect = new SQLConnect();
        sqlConnect.SQLConnection();
          SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = format.parse("2017-01-17");
        String dateString = format.format(date);
        CertificateRepositoryImpl certificateSQLRepository = new CertificateRepositoryImpl();
        Certificate certificate = new Certificate(16,  "Kate",  dateString ,dateString,23.2);
        System.out.println(certificateSQLRepository.add(certificate));
        certificateSQLRepository.update(certificate);
        certificateSQLRepository.remove(certificate);
        certificateSQLRepository.getObjects(new TagSpecification());
    }
}
