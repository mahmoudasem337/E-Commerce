package asem.e_commerce.Repository;

import asem.e_commerce.Entity.Role;
import asem.e_commerce.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role,Integer> {
}
