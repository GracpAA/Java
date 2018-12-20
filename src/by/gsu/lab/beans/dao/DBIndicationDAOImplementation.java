package by.gsu.lab.beans.dao;

import by.gsu.lab.beans.Indication;
import by.gsu.lab.beans.connection.ConnectionDB;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBIndicationDAOImplementation implements DBIndicationDAO{

    private String url = "jdbc:mysql://localhost:3306/project?autoReconnect=true&useSSL=false";
    private String user = "root";
    private String password = "root";

    @Override
    public List<Indication> getIndications() {
        String query = "SELECT * FROM project.indication";
        List<Indication> indications = new ArrayList<Indication>();
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                Indication indication = new Indication();
                indication.setId(resultSet.getInt(1));
                indication.setName(resultSet.getString(2));
                indication.setValue(resultSet.getInt(3));
                indication.setDay(resultSet.getString(4));
                indications.add(indication);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return indications;
    }

    @Override
    public boolean createIndication(Indication indication) {
        try {
            Connection connection = DriverManager.getConnection(url,user,password);
            Statement statement = connection.createStatement();
            String sql = String.format("insert into indication " + " (name, value, day)" + " values ('%s', '%d', '%s')", indication.getName(), indication.getValue(), indication.getDay());
            statement.executeUpdate(sql);
            System.out.println("Insert complited");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public void deleteIndication(int id) {
        try {
            Connection connection = DriverManager.getConnection(url,user,password);
            Statement statement = connection.createStatement();
            String sql = String.format("delete from indication where id='%d'", id);
            statement.executeUpdate(sql);
            System.out.println("Delete complited");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
