package database.client;

import utils.PropertyUtils;

import java.sql.*;


public class CustomersDBClient extends DBClient {
    private static Connection connection = null;
    private static final ThreadLocal<Connection> customersConnection = new ThreadLocal<>();

    public synchronized static void connectToCustomersDatabase() {
        String dbServer = String.format("az%sdbservershareddatabases.database.windows.net");
        dbServer = String.format("tstcustman.database.windows.net");
        String dbName = String.format("tstcustman");
        connection = connectToDB(SQL_USER, SQL_PASSWORD, dbServer, dbName);
    }

    public static void closeConnection() {
        closeConnection(connection);
    }

    protected static Connection customersConnection() {
        try {
            if (customersConnection.get() == null) customersConnection.set(connection);
            if (customersConnection.get().isClosed()) {
                if (connection.isClosed()) connectToCustomersDatabase();
                customersConnection.set(connection);
            }
        } catch (SQLException ex) {
        	ex.printStackTrace();
        }
        return customersConnection.get();
    }
}
