package com.restapiplayers.service;


import com.restapiplayers.model.Player;
import com.restapiplayers.model.Team;
import com.restapiplayers.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class PlayerService {

    @Autowired
    PlayerRepository playerRepository;

    public ArrayList<Player> getPlayers(){
        return (ArrayList<Player>) playerRepository.findAll();
    }

    public Player savePlayer(Player player){
        return playerRepository.save(player);
    }

    public Optional<Player> findById(Long id){
        return playerRepository.findById(id);
    }

    public ArrayList<Player> getPlayerByPosition(String position) {
        return playerRepository.findByPosition(position);
    }

    public boolean deletePlayerById(Long id) {
        try{
            playerRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }

}
