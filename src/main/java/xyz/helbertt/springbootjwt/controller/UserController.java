package xyz.helbertt.springbootjwt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.helbertt.springbootjwt.data.UserData;
import xyz.helbertt.springbootjwt.service.UserDetailsServiceImpl;

import java.util.List;

@RestController
public class UserController {

    private final UserDetailsServiceImpl userDetailsService;

    public UserController(UserDetailsServiceImpl userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    @RequestMapping("all-users")
    public List<UserData> listAllUsers(){
        return userDetailsService.listUsers();
    }

}
