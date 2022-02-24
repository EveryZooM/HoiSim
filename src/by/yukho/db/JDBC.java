package by.yukho.db;

import by.yukho.entity.Division;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBC {
    public static void main(String[] args) {

        try {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try (Connection connection = ConnectionCreator.createConnection();
             Statement statement = connection.createStatement()) {
            String sql = "SELECT * FROM battalions";
            ResultSet resultSet = statement.executeQuery(sql);
            List<Division> divisions = new ArrayList<>();
            while (resultSet.next()) {
                String battalionType = resultSet.getString(1);
                float speed = resultSet.getFloat(2);
                float organization = resultSet.getFloat(3);
                float recoveryRate = resultSet.getFloat(4);
                float softAttack = resultSet.getFloat(5);
                float defence = resultSet.getFloat(6);
                float breakthrough = resultSet.getFloat(7);
                divisions.add(new Division(battalionType, speed, organization, recoveryRate, softAttack, defence, breakthrough));
            }
            System.out.println(divisions);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
