package Citas;

import Citas.SQL.DAO;

public class Main {
    public static void main(String[] args) {
        DAO dao = new DAO();
        dao.init();
    }
}