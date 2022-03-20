package liga.medical.repository;

import liga.medical.model.Contact;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface ContactRepository  {
    @Select("SELECT * FROM contact WHERE id=#{id}")
    Contact findById(Long id);

    @Select("SELECT * FROM contact")
    List<Contact> findAll();

    @Delete("DELETE FROM contact WHERE id=#{id}")
    void deleteById(Long id);

    @Insert("INSERT INTO contact VALUES (#{phoneNumber}, #{email}, #{profileLink}")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    void add(Contact contact);

    @Update("UPDATE contact SET phone_number = #{phoneNumber}, email = #{email}," +
            " profile_link = #{profileLink}" +
            " where id = #{id}")
    void updateById(Contact contact);
}
