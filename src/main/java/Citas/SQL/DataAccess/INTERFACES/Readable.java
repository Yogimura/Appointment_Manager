package Citas.SQL.DataAccess.INTERFACES;

import java.util.List;

public interface Readable<T, F extends Filter>{
    List<T> read(F f, String val) throws Exception;
}
