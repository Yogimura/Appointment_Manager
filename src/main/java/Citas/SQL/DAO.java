package Citas.SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {
    private Connection connection = null;
    private final String connectionURL = "jdbc:mysql://localhost:3306/Citas_medicas";
    private final String user = "Vladi";
    private final String password = "12345";

    public Connection getConnection() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(connectionURL, user, password);
            } catch (SQLException ex) {
                System.err.println("Exception: " + ex.getMessage());
            }
        }
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}
