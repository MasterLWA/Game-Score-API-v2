package com.example.GameScores.Services;
import com.example.GameScores.Model.game;
import com.example.GameScores.Model.user;
import com.example.GameScores.Repository.RestRepository;
import com.example.GameScores.Repository.RestRepositoryGame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service //This is a service class
public class RestService {
    @Autowired
    private RestRepository restRepository;

    @Autowired
    private RestRepositoryGame restRepositoryGame;

    //add new user
    public user addUser(user User) {
        return restRepository.save(User);
    }
    
    //add new game
    public game addGame(game Game) {
        return restRepositoryGame.save(Game);
    }
    
    //get all user records from database
    public Iterable<user> findAll() {
        return restRepository.findAll();
    }
    
    //find user's record by id 
    public user findUserById(Integer id) {
        return restRepository.findById(id).get();
    }
    
    //Delete user by id
    public void deleteUserById(user User) {
        restRepository.delete(User);
    }
}


