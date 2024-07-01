package Citas.SQL.DataAccess.INTERFACES;

public interface CRUD<T>{
    void insert(T t) throws Exception;
    void delete(T t) throws Exception;
    void update(T t) throws Exception;
}
