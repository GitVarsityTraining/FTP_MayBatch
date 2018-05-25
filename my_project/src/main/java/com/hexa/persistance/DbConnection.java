package com.hexa.persistance;

import org.skife.jdbi.v2.DBI;
//import org.skife.jdbi.v2.logging.PrintStreamLog;;

/**
 */
public class DbConnection {
    /**
     * Connecting to MYSQL DB.
     * @return database Connection.
     */
     DBI dbi;
  public final DBI getConnect() {
    try {
      Class.forName("com.mysql.jdbc.Driver");
      String dbc = "localhost:3306";
      dbi = new DBI("jdbc:mysql://localhost:3306/testdb?useSSL=false",
      "root", "Password123");
      
     // return dbi;
    } catch (ClassNotFoundException e) {
      System.out.println(e);
    }
    return dbi;
  }
}
