package Citas.SQL.DataAccess.Filtros;

import Citas.Persona.Direccion;
import Citas.SQL.DAO;
import Citas.SQL.DataAccess.INTERFACES.Filter;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public enum FilterDireccion implements Filter {
    ALL {
        @Override
        public List<Direccion> get(String val) throws SQLException {
            List<Direccion> direcciones = new ArrayList<>();


            return direcciones;
        }
    },
    ByID {
        @Override
        public List<Direccion> get(String val) throws SQLException {
            List<Direccion> direcciones = new ArrayList<>();


            return direcciones;
        }
    },
    ByPais {
        @Override
        public List<Direccion> get(String val) throws SQLException {
            return getb(val.toString(), "Pais");
        }
    },
    ByCiudad {
        @Override
        public List<Direccion> get(String val) throws SQLException {
            return getb(val.toString(), "Ciudad");
        }
    },
    ByMunicipio {
        @Override
        public List<Direccion> get(String val) throws SQLException {
            return getb(val.toString(), "Municipio");
        }
    },
    ByCalle {
        @Override
        public List<Direccion> get(String val) throws SQLException {
            return getb(val.toString(), "Calle");
        }
    };

    public abstract List<Direccion> get(String val) throws SQLException;

    public List<Direccion> getb(String val, String filter) throws SQLException{
        List<Direccion> direcciones = new ArrayList<>();

        return direcciones;
    }

    public void iterateRS(List<Direccion> list, ResultSet rs) throws SQLException {
        while(rs.next()) {

        }
    }
}
