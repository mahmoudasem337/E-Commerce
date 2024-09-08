package asem.e_commerce.Controller;

import asem.e_commerce.Entity.Role;
import asem.e_commerce.Entity.User;
import asem.e_commerce.Service.RoleServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RoleController {
    private final RoleServiceImpl roleService;

    public RoleController(RoleServiceImpl roleService) {
        this.roleService = roleService;
    }
    @PostMapping("/secure/role")
    public Role addRole(@RequestBody Role role){
        return roleService.addRole(role);
    }

    @DeleteMapping("/secure/role/{id}")
    public void deleteRole(@PathVariable int id){
        roleService.deleteRole(id);
    }
}
