package com.example.GameScores.Repository;
import com.example.GameScores.Model.game;
import com.example.GameScores.Model.user;
import org.springframework.data.repository.CrudRepository;

public interface RestRepositoryGame extends CrudRepository<game, Integer> {
    
}

