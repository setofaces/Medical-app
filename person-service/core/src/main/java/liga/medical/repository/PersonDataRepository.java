package liga.medical.repository;

import liga.medical.model.Illness;
import liga.medical.model.PersonData;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface PersonDataRepository  {
    @Select("SELECT * FROM person_data WHERE id=#{id}")
    Illness findById(Long id);

    @Select("SELECT * FROM person_data")
    List<PersonData> findAll();

    @Delete("DELETE FROM person_data WHERE id=#{id}")
    void deleteById(Long id);

    @Insert("INSERT INTO person_data VALUES (#{lastName}, #{firstName}, " +
            "#{birthDt}, #{age}, #{sex},#{contactId}, #{medicalCardId}, #{parentId}")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    void add(PersonData personData);

    @Update("UPDATE person_data SET last_name = #{lastName}, first_name = #{firstName}, " +
            "birth_dt = #{birthDt}, age = #{age},sex = #{sex},contact_id = #{contactId}," +
            "medical_card_id = #{medicalCardId}, parent_id = #{parentId}" +
            " where id = #{id}")
    void updateById(PersonData personData);
}
