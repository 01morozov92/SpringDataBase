package Sql2o;

import org.sql2o.Connection;

import java.util.List;
import java.util.Map;

public class DataBaseMethods {

    public static List<Long> selectList(String sql) {

        try (Connection con = MyDao.sql2o.open()) {
            return con.createQuery(sql).executeScalarList(Long.class);
        }
    }

    public static List<Map<String, Object>> selectMap(String sql) {

        try (Connection con = MyDao.sql2o.open()) {
            return con.createQuery(sql).executeAndFetchTable().asList();
        }

    }

    public static Integer select(String sql){

        try(Connection con = MyDao.sql2o.open()) {
            return con.createQuery(sql).executeScalar(Integer.class);
        }
    }
}
