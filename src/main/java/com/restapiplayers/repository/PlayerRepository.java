package com.restapiplayers.repository;

import com.restapiplayers.model.Player;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface PlayerRepository extends CrudRepository<Player,Long> {

    public abstract ArrayList<Player> findByPosition(String position);

}
