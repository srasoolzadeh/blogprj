package my.project.blogprj.modules.users.controller;

import my.project.blogprj.modules.users.model.User;
import my.project.blogprj.modules.users.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by rasoolzadeh
 */
@RestController
@RequestMapping("/users")
public class UserControl {
    private UserService userService;

    @Autowired
    public UserControl(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = {"/",""}, method = RequestMethod.GET)
    public List<User> getUsers(){
        return userService.findAllUsers();
    }

    @RequestMapping(value = {"/",""}, method = RequestMethod.POST)
    public User registerUser(@RequestBody User user){
        return userService.registerUser(user);
    }
}
