package asem.e_commerce.Controller;

import asem.e_commerce.Entity.User;
import asem.e_commerce.Service.UserServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class UserController {
   private final UserServiceImpl userService;

    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }
    //Done
    @GetMapping("/users")
    public List<User> getUsers(){
        return userService.getUsers();
    }
    //Done
    @GetMapping("/user/{id}")
    public Optional<User> getUser(@PathVariable int id){
        return userService.getUser(id);
    }
    //Done
    @PostMapping("/secure/user")
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }
     //Done
    @DeleteMapping("/secure/user/{id}")
    public User deleteUser(@PathVariable int id){
        return userService.deleteUser(id);
    }

}
