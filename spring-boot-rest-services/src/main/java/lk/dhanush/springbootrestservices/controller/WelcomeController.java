package lk.dhanush.springbootrestservices.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
public class WelcomeController {


    @GetMapping("/")
    public String home(){
        return "<h1>Welcome Page</h1>";
    }

    @GetMapping("/user")
    public String userHome(){
        return "<h1>Welcome User Page</h1>";
    }




}
