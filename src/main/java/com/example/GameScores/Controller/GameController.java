package com.example.GameScores.Controller;
import com.example.GameScores.Services.RestService;
import com.example.GameScores.Model.game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GameController {

    @Autowired
    private RestService restService;

    @RequestMapping("/addGame")
    public game createGame(@RequestBody game Game){ //Create a game - POST
        return restService.addGame(Game);
    }

    @GetMapping("/getGame/id")
    public void getGameByID(){ //Get a game by Id - GET

    }

}
