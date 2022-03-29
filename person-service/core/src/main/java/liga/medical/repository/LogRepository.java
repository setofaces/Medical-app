package liga.medical.repository;

import liga.medical.model.LogEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LogRepository {

    int add(LogEntity logEntity);
}
