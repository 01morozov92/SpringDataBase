package Sql2o;

import org.sql2o.Sql2o;

public class MyDao {

    public static Sql2o sql2o;

    static{
        sql2o = new Sql2o("jdbc:mysql://localhost:3306/sakila", "root", "123ion123");
    }
}
