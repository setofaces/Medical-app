package liga.medical.repository;

import liga.medical.model.Illness;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface IllnessRepository  {
    @Select("SELECT * FROM illness WHERE id=#{id}")
    Illness findById(Long id);

    @Select("SELECT * FROM illness")
    List<Illness> findAll();

    @Delete("DELETE FROM illness WHERE id=#{id}")
    void deleteById(Long id);

    @Insert("INSERT INTO illness VALUES (#{medicalCardId}, #{typeId}, #{heaviness}," +
            "#{appearanceDttm}, #{recoveryDt}")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    void add(Illness illness);

    @Update("UPDATE illness SET medical_card_id = #{medicalCardId}, type_id =  #{typeId}, " +
            "heaviness = #{heaviness}," +
            "appearance_dttm = #{appearanceDttm},recovery_dt = #{recoveryDt}" +
            " where id = #{id}")
    void updateById(Illness illness);
}
