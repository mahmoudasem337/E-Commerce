package asem.e_commerce.Service;

import asem.e_commerce.Entity.Role;
import asem.e_commerce.Entity.User;

import java.util.List;
import java.util.Optional;

public interface RoleService {
    public Role addRole(Role role);
    public void deleteRole(int id);
}
