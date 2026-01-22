package se.iths.johanna.springboot22jan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import se.iths.johanna.springboot22jan.model.User;

import java.util.List;

@Controller
public class UserController {

    private User user;

    @GetMapping("/user")
    public String userInfo(Model model) {
        List<User> users = List.of(
                new User("jossiy", "123lös", "josefine.b@test.se"),
                new User("Johanna", "456", "Johanna.V@test.se"));
        model.addAttribute("users", users);
        return "user";
    }
}
