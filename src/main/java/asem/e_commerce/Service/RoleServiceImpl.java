package asem.e_commerce.Service;

import asem.e_commerce.Entity.Role;
import asem.e_commerce.Repository.RoleRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoleServiceImpl implements RoleService{
    private final RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public Role addRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public void deleteRole(int id) {
         roleRepository.deleteById(id);
    }
}
