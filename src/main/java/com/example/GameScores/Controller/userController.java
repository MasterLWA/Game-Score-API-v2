package com.example.GameScores.Controller;
import com.example.GameScores.Services.RestService;
import com.example.GameScores.Model.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class userController {

    @Autowired
    private RestService restService;

    @RequestMapping("/addUser")
    public user createUser(@RequestBody user User){ //Create a user - POST
        return restService.addUser(User);
    }

    @GetMapping("/getUser/id")
    public void getUserByID(){ //Get a user by Id - GET

    }

}
