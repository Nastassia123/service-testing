package sqlconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class SQLConnect {

    public Connection SQLConnection() throws SQLException {

        final String url = "jdbc:mysql://127.0.0.1:3306/certificates?autoReconnect=true&useSSL=false";
        Properties prop = new Properties();
        prop.put("user", "root");
        prop.put("password", "7845366");
        prop.put("autoReconnect", "true");
        prop.put("characterEncoding", "UTF-8");
        prop.put("useUnicode", "true");
        Connection cn = null;
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        try {
            cn = DriverManager.getConnection(url, prop);
        } catch (SQLException e) {
            System.out.println("Can not connect to the database");
        }
        return cn;
    }
}
