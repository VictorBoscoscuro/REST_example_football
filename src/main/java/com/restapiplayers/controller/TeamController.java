package com.restapiplayers.controller;

import com.restapiplayers.model.Team;
import com.restapiplayers.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/team")
public class TeamController {

    @Autowired
    TeamService teamService;

    @GetMapping()
    public ArrayList<Team> getTeams(){
        return teamService.getTeams();
    }

    @PostMapping()
    public Team saveTeam(@RequestBody Team team){       //Si mando el id -> "update", sino "insert"
        return teamService.saveTeam(team);
    }

    @GetMapping( path = "/{id}")
    public Optional<Team> getTeamById(@PathVariable("id") Long id) {
        return this.teamService.findById(id);
    }

    @GetMapping("/query")
    public ArrayList<Team> getTeamByCountry(@RequestParam("country") String country){
        return this.teamService.getTeamByCountry(country);
    }

    @DeleteMapping( path = "/{id}")
    public String deleteById(@PathVariable("id") Long id){
        boolean ok = this.teamService.deleteTeamById(id);
        if (ok){
            return "The team with the id " + id + ", was deleted. ";
        }else{
            return "The team with the id" + id + ", could not be removed";
        }
    }
}
