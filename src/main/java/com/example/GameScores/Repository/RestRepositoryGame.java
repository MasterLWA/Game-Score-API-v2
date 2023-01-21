package com.example.GameScores.Repository;
import com.example.GameScores.Model.game;
import org.springframework.data.repository.CrudRepository;

public interface RestRepositoryGame extends CrudRepository<game, Integer> {

}

