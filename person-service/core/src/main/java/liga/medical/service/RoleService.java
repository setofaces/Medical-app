package liga.medical.service;

import liga.medical.model.Role;

import java.util.List;
import java.util.Set;

public interface RoleService {

    List<Role> findAllRoles();

    Role findRoleById(Long id);

    Role findRoleByName(String role);

    void saveRole(Role role);

    void saveRoles(Set<Role> roles);
}
