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


    public user addUser(user User) {
        return restRepository.save(User);
    }

    public game addGame(game Game) {
        return restRepositoryGame.save(Game);
    }

    public Iterable<user> findAll() {
        return restRepository.findAll();
    }

    public user findUserById(Integer id) {
        return restRepository.findById(id).get();
    }

    public void deleteUserById(user User) {
        restRepository.delete(User);
    }
}


