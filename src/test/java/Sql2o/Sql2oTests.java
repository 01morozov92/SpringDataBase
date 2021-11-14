package Sql2o;

import org.sql2o.Connection;
import org.sql2o.Sql2o;
import org.testng.annotations.Test;

public class Sql2oTests extends DataBaseMethods{

    String sql = "SELECT actor_id FROM sakila.actor WHERE last_name='CHASE'";

    @Test
    public void test(){
        System.out.println(select(sql));
    }
}
