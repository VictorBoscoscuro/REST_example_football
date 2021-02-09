package com.restapiplayers.controller;

import com.restapiplayers.model.Player;
import com.restapiplayers.model.Team;
import com.restapiplayers.service.PlayerService;
import com.restapiplayers.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/player")
public class PlayerController {

    @Autowired
    PlayerService playerService;

    @GetMapping()
    public ArrayList<Player> getPlayer(){
        return playerService.getPlayers();
    }

    @PostMapping()
    public Player savePlayer(@RequestBody Player player){       //Si mando el id -> "update", sino "insert"
        return playerService.savePlayer(player);
    }

    @GetMapping( path = "/{id}")
    public Optional<Player> getPlayerById(@PathVariable("id") Long id) {
        return this.playerService.findById(id);
    }

    @GetMapping("/query")
    public ArrayList<Player> getTeamByPosition(@RequestParam("position") String position){
        return this.playerService.getPlayerByPosition(position);
    }

    @DeleteMapping( path = "/{id}")
    public String deleteById(@PathVariable("id") Long id){
        boolean ok = this.playerService.deletePlayerById(id);
        if (ok){
            return "The player with the id " + id + ", was deleted. ";
        }else{
            return "The plauer with the id" + id + ", could not be removed";
        }
    }
}
