package asem.e_commerce.Service;

import asem.e_commerce.Entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    public User addUser(User user);
    public List<User> getUsers();
    public Optional<User> getUser(int id);
    public User deleteUser(int id);
}
