package liga.medical.repository;

import liga.medical.model.Address;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface AddressRepository  {

    @Select("SELECT * FROM address WHERE id=#{id}")
    Address findById(Long id);

    @Select("SELECT * FROM address")
    List<Address> findAll();

    @Delete("DELETE FROM address WHERE id=#{id}")
    void deleteById(Long id);

    @Insert("INSERT INTO address values " +
            "(#{contactId}, #{countryId}, #{city}, #{index}, #{street}, #{building}, #{flat}) ")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    void add(Address address);

    @Update("UPDATE address SET contact_id = #{contactId}, country_id = #{countryId}," +
            " city = #{city}, index = #{index}, street = #{street}," +
            " building = #{building}, flat = #{flat}" +
            " where id = #{id}")
    void updateById(Address address);
}
