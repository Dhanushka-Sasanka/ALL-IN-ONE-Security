package lk.dhanush.springbootrestservices.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping("/api/admin")
public class AdminController {


    @GetMapping(value = "/")
    public String adminHome(){

//            return new ResponseEntity( HttpStatus.ACCEPTED);
        return "<h1>Welcome Admin Page</h1>";
    }
}
