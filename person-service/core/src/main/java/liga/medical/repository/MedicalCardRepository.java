package liga.medical.repository;

import liga.medical.model.Illness;
import liga.medical.model.MedicalCard;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface MedicalCardRepository  {
    @Select("SELECT * FROM medical_card WHERE id=#{id}")
    Illness findById(Long id);

    @Select("SELECT * FROM medical_card")
    List<MedicalCard> findAll();

    @Delete("DELETE FROM medical_card WHERE id=#{id}")
    void deleteById(Long id);

    @Insert("INSERT INTO medical_card VALUES (#{clientStatus}, #{medStatus}, " +
            "#{registryDt}, #{comment}")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    void add(MedicalCard medicalCard);

    @Update("UPDATE medical_card SET client_status = #{clientStatus}, med_status = #{medStatus}, " +
            "registry_dt = #{registryDt}, coment = #{comment}" +
            " where id = #{id}")
    void updateById(MedicalCard medicalCard);
}
