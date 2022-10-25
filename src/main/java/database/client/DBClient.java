package database.client;

import utils.PropertyUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBClient {
    protected static final String SQL_USER = PropertyUtils.getSqlUser();
    protected static final String SQL_PASSWORD = PropertyUtils.getSqlPassword();
    private static final String SQL_DRIVER_CLASS = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

    protected synchronized static Connection connectToDB(String user, String pass, String serverDB, String databaseName) {
        Connection connection = null;
        String dbURL = String.format("jdbc:sqlserver://%s;databaseName=%s;", serverDB, databaseName);
        
        try {
            	connection = DriverManager.getConnection(String.format("%suser=%s;password=%s;loginTimeout=30;encrypt=true;trustServerCertificate=true;", dbURL, user, pass));
                
        } catch (SQLException ex) {
            throw new RuntimeException(ex.getMessage());
        }
        return connection;
    }


    protected static void closeConnection(Connection connection) {
        try {
            connection.close();
        } catch (SQLException ex) {
            throw new RuntimeException(ex.getMessage());
        }
    }
}
