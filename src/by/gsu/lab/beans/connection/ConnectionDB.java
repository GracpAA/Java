package by.gsu.lab.beans.connection;

import java.sql.*;


public class ConnectionDB {

    private static boolean isInit = false;
    private static ConnectionDB connectionDB = null;
    private Connection connection = null;

    private ConnectionDB(){

    }

    public static void setParameterInDB(String driverClass, String dbURL, String dbUser, String dbPass){
        if (!isInit){
            connectionDB = new ConnectionDB(driverClass, dbURL, dbUser, dbPass);
            isInit = true;
        }
    }

    public static Connection getConnection(){
        return connectionDB.connection;
    }

    private ConnectionDB(String driverClass, String dbURL, String dbUser, String dbPass){
        if (isInit){
            return;
        }
        try {
            Class.forName(driverClass);
            try {
                connection = (Connection) DriverManager.getConnection(dbURL, dbUser, dbPass);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void closeConnections(Connection ... connections)
            throws SQLException{
        for (Connection connection : connections) {
            if (connection != null){
                connection.close();
            }
        }
    }

    public static void closeStatements(Statement ... stats)
            throws SQLException{
        for (Statement stat : stats) {
            if (stat != null)
            {
                stat.close();
            }
        }
    }

    public static void closeResultSets(ResultSet... results) throws SQLException{
        for (ResultSet res : results) {
            if (res != null)
            {
                res.close();
            }
        }
    }

    public void destroyConnectionToDB(){
        if (isInit) {
            try {
                closeConnections(connection);
                connectionDB = null;
            } catch (SQLException e) {
                System.err.println("Error when destroy connection!");
            }
        }
    }
}

