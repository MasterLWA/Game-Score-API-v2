package com.example.GameScores.Services;
import com.example.GameScores.Model.game;
import com.example.GameScores.Model.user;
import com.example.GameScores.Repository.RestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service //This is a service class
public class RestService {
    @Autowired
    private RestRepository restRepository;
    public user addUser(user User){
        return restRepository.save(User);
    }
}
