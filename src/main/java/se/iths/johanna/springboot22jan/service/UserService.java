package se.iths.johanna.springboot22jan.service;

import org.springframework.stereotype.Service;
import se.iths.johanna.springboot22jan.model.User;

import java.util.List;

@Service
public class UserService {
    public List<User> getUserList() {
        return List.of(
                new User("jossiy", "123lös", "josefine.b@test.se"),
                new User("Johanna", "456", "Johanna.V@test.se"));
    }
}
