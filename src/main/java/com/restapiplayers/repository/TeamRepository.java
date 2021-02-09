package com.restapiplayers.repository;

import com.restapiplayers.model.Team;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface TeamRepository extends CrudRepository<Team,Long> {

    public abstract ArrayList<Team> findByCountry(String country);

}
