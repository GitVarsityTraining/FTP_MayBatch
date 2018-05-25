package com.hexa.persistance;
import java.util.*;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;

public interface CarDao  {
      @SqlQuery("SELECT * FROM CARS")
  @Mapper(CarMapper.class)
  List<Cars> list();
}

