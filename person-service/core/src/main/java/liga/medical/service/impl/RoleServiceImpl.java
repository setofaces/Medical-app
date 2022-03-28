package liga.medical.service.impl;

import liga.medical.model.Role;
import liga.medical.repository.RoleRepository;
import liga.medical.service.RoleService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public List<Role> findAllRoles() {
        return roleRepository.findAll();
    }

    @Override
    public Role findRoleById(Long id) {
        return roleRepository.findById(id);
    }

    @Override
    public Role findRoleByName(String role) {
        return roleRepository.findByName(role);
    }

    @Override
    public void saveRole(Role role) {
        roleRepository.add(role);
    }

    @Override
    public void saveRoles(Set<Role> roles) {
        roleRepository.addAll(roles);
    }
}
