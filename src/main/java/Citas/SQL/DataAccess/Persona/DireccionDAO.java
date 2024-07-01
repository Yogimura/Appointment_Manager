package Citas.SQL.DataAccess.Persona;

import Citas.Persona.Direccion;
import Citas.SQL.DataAccess.Filtros.FilterDireccion;
import Citas.SQL.DataAccess.INTERFACES.CRUD;
import Citas.SQL.DAO;
import Citas.SQL.DataAccess.INTERFACES.Readable;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class DireccionDAO extends DAO implements CRUD<Direccion>, Readable<Direccion, FilterDireccion> {
    private final String insert = "INSERT INTO Direccion (Pais, Ciudad, Municipio, Calle) Values (?, ?, ?, ?)";
    private final String delete = "DELETE FROM Direccion WHERE Id_direccion = ?";
    private final String update = "UPDATE Direccion WHERE Id_direccion = ? set Pais = ?, Ciudad = ?, Municipio = ?, Calle = ?";

    @Override
    public void insert(Direccion direccion) throws SQLException {
        try (PreparedStatement statement = getConnection().prepareStatement(insert)) {
            statement.setString(1, direccion.getPais());
            statement.setString(2, direccion.getCiudad());
            statement.setString(3, direccion.getMunicipio());
            statement.setString(4, direccion.getCalle());
            statement.executeUpdate();
        }
    }

    @Override
    public void delete(Direccion direccion) throws SQLException {
        try (PreparedStatement statement = getConnection().prepareStatement(delete)) {
            statement.setInt(1, direccion.getId());
            statement.executeUpdate();
        }
    }

    @Override
    public void update(Direccion direccion) throws SQLException {
        try (PreparedStatement statement = getConnection().prepareStatement(update)) {
            statement.setInt(1, direccion.getId());
            statement.setString(2, direccion.getPais());
            statement.setString(3, direccion.getCiudad());
            statement.setString(4, direccion.getMunicipio());
            statement.setString(5, direccion.getCalle());
            statement.executeUpdate();
        }
    }

    @Override
    public List<Direccion> read(FilterDireccion filterDireccion, String val) throws SQLException {
        return filterDireccion.get(val);
    }
}
