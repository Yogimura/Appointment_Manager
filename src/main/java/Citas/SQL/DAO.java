package Citas.SQL;

import Citas.Persona.Direccion;
import Citas.Persona.Paciente;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {

    SessionFactory sessionFactory = null;

    public void init() {
        Configuration config = new Configuration();
        getConfiguration(config);
        addDireccionDao(config);
        try {
            sessionFactory = config.buildSessionFactory();
        } catch (HibernateException HE) {
            System.out.println("tudo mal");
            throw HE;
        }
    }

    private void addDireccionDao(Configuration config) {
        config.addPackage("Citas.Persona")
                .addAnnotatedClass(Direccion.class)
                .addAnnotatedClass(Paciente.class);
    }

    private void getConfiguration(Configuration config) {
        config.setProperty("connection.pool_size", "10");
        config.setProperty("hibernate.current_session_context_class", "thread");
        config.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/Citas_medicas");
        config.setProperty("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
        config.setProperty("hibernate.connection.username", "vlad");
        config.setProperty("hibernate.connection.password", "12345");
        config.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
        config.setProperty("hibernate.hbm2ddl.auto", "create");
    }


}
