package com.hexa.cli;
import java.util.List;
import java.util.Map;
import org.skife.jdbi.v2.DBI;
import org.skife.jdbi.v2.Handle;
import org.skife.jdbi.v2.Query;
import org.skife.jdbi.v2.*;
import com.hexa.persistance.*;
public class MainDemo {

      private static CarDao dao() {
    DbConnection db = new DbConnection();
    return db.getConnect().onDemand(CarDao.class);
  }

    public static void main(String ar[]){

        List<Cars> c = dao().list();
        for (Cars cc:c)
        {
            System.out.println(cc.getId());
            System.out.println(cc.getName());
            System.out.println(cc.getPrice());
        }

    }
}