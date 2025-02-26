package L_M_S.Service;

import L_M_S.Entity.User;
import java.util.List;

public interface UserService {
    List<User> findAll();
    User save(User user);
}
