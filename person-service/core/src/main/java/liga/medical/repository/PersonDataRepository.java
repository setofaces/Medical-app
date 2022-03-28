package liga.medical.repository;

import liga.medical.model.PersonData;
import liga.medical.model.Role;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
import java.util.Set;

@Mapper
public interface PersonDataRepository  {
    @Select("SELECT * FROM person_data WHERE id=#{id}")
    PersonData findById(Long id);

    @Select("SELECT * FROM person_data")
    List<PersonData> findAll();

    @Delete("DELETE FROM person_data WHERE id=#{id}")
    void deleteById(Long id);

    void add(PersonData personData);

    @Update("UPDATE person_data SET last_name = #{lastName}, first_name = #{firstName}, " +
            "birth_dt = #{birthDt}, age = #{age},sex = #{sex},contact_id = #{contactId}," +
            "medical_card_id = #{medicalCardId}, parent_id = #{parentId}" +
            " where id = #{id}")
    void updateById(PersonData personData);

    void addRoles(@Param("id") Long id, @Param("roles") Set<Role> roles);

    PersonData findByEmail(@Param("email") String email);
}
