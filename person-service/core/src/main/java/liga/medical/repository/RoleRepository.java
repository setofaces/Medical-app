package liga.medical.repository;

import liga.medical.model.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Set;

@Mapper
public interface RoleRepository {

    Role findById(Long id);

    Role findByName(String name);

    List<Role> findAll();

    void add(@Param("r1") Role r1);

    void addAll(Set<Role> roles);
}
