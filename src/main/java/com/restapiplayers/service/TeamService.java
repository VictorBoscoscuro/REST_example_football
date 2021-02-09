package com.restapiplayers.service;

import com.restapiplayers.model.Team;
import com.restapiplayers.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class TeamService {

    @Autowired
    TeamRepository teamRepository;

    public ArrayList<Team> getTeams(){
        return (ArrayList<Team>) teamRepository.findAll();
    }

    public Team saveTeam(Team team) {
        return teamRepository.save(team);
    }
    public Optional<Team> findById(Long id){
        return teamRepository.findById(id);
    }

    public ArrayList<Team> getTeamByCountry(String country) {
        return teamRepository.findByCountry(country);
    }

    public boolean deleteTeamById(Long id) {
        try{
            teamRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }
}
