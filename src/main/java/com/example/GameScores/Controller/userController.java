package com.example.GameScores.Controller;
import com.example.GameScores.Services.RestService;
import com.example.GameScores.Model.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class userController {

    @Autowired
    private RestService restService;

    @RequestMapping("/addUser")
    public user createUser(@RequestBody user User){ //Create a user - POST
        return restService.addUser(User);
    }

    @GetMapping("/getAll")
    public Iterable<user> getAllUsers(){ //Get all users - GET
        return restService.findAll();
    }

    @GetMapping("/get/{id}")
    public user getUserByID(@PathVariable Integer id){ //Get a user by Id - GET
         return restService.findUserById(id);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> removeById(@PathVariable Integer id){ //Delete a user by Id - DELETE
        user User2 = restService.findUserById(id);
        restService.deleteUserById(User2);
        return new ResponseEntity<String >("deleted", HttpStatus.OK);
    }




}
