package lk.dhanush.springbootrestservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/student")
public class RestAPIController {


    @GetMapping("/")
    public String studentHome(){
        return "<h1>Welcome Student Page</h1>";
    }




}
