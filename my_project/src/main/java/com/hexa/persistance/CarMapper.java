package com.hexa.persistance;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.skife.jdbi.v2.tweak.ResultSetMapper;
import org.skife.jdbi.v2.StatementContext;

public class CarMapper implements ResultSetMapper<Cars>{
     public final Cars map(final int idx, final ResultSet rs, final  StatementContext ctx) throws SQLException {
    
    return new Cars(rs.getInt("ID"), rs.getString("NAME"),rs.getInt("PRICE"));

  }

}