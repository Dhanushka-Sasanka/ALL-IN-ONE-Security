package lk.dhanush.springbootrestservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomeController {

    @GetMapping("/")
    public String home(){
        return "<h1>Welcome Page</h1>";
    }

    @GetMapping("/user")
    public String userHome(){
        return "<h1>Welcome User Page</h1>";
    }

    @GetMapping("/admin")
    public String adminHome(){
        return "<h1>Welcome Admin page</h1>";
    }


}
