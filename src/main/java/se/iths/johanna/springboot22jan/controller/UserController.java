package se.iths.johanna.springboot22jan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import se.iths.johanna.springboot22jan.model.User;
import se.iths.johanna.springboot22jan.service.UserService;

@Controller
public class UserController {
    private final UserService userService;

    private User user;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user")
    public String userInfo(Model model) {
        model.addAttribute("users", userService.getUserList());
        return "user";
    }
}
