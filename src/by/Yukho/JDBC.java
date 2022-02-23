package by.Yukho;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBC {
    public static void main(String[] args) {
        try {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        String url = "jdbc:mysql://localhost:3306/hoidb";
        Properties prop = new Properties();
        prop.put("user", "root");
        prop.put("password", "3962");
        prop.put("autoReconnect", "true");
        prop.put("characterEncoding", "UTF-8");
        prop.put("useUnicode", "true");
        prop.put("useSSl", "true");
        prop.put("useJDBCCompliantTimezoneShift", "true");
        prop.put("useLegacyDatetimeCode", "false");
        prop.put("serverTimezone", "true");
        prop.put("serverSslCert", "classpath:server.crt");
        try (Connection connection = DriverManager.getConnection(url, prop);
             Statement statement = connection.createStatement()) {
          String sql = "SELECT * FROM battalions";
          ResultSet resultSet = statement.executeQuery(sql);
          List<Division> divisions = new ArrayList<>();
          while (resultSet.next()) {
              String battalionType = resultSet.getString(1);
              float speed = resultSet.getFloat(2);
              float organization = resultSet.getFloat(2);
              float recoveryRate = resultSet.getFloat(2);
              float softAttack = resultSet.getFloat(2);
              float defence = resultSet.getFloat(2);
              float breakthrough = resultSet.getFloat(2);
              divisions.add(new Division(battalionType, speed, organization, recoveryRate, softAttack, defence, breakthrough));
          }
          System.out.println(divisions);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
