package lab.ieti.microservice.users.service.implementation;

import lab.ieti.microservice.users.data.User;
import lab.ieti.microservice.users.service.UserService;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class UserServiceHashMap implements UserService {

    private final HashMap<String, User> users = new HashMap<>();

    @Override
    public User create(User user) {
        return this.users.put(user.getId(), user);
    }

    @Override
    public User findById(String id) {
        if (this.users.containsKey(id)) {
            return this.users.get(id);
        }
        return null;
    }

    @Override
    public List<User> all() {
        return new ArrayList<>(this.users.values());
    }

    @Override
    public boolean deleteById(String id) {
        if (this.users.containsKey(id)) {
            this.users.remove(id);
            return true;
        }
        return false;
    }

    @Override
    public User update(User user, String id) {
        if (this.users.containsKey(id)) {
            this.users.put(id, user);
            return user;
        }
        return null;
    }
}
