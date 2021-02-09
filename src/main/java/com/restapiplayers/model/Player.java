package com.restapiplayers.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Player {
    @Id
    @GeneratedValue(generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private Long id_player;

    @Column(name = "player_name", nullable = false, length = 200)
    private String player_name;

    @Column(name = "position", nullable = false, length = 3)
    private String position;

    public Long getId_player() {
        return id_player;
    }

    public void setId_player(Long id_player) {
        this.id_player = id_player;
    }

    public String getPlayer_name() {
        return player_name;
    }

    public void setPlayer_name(String player_name) {
        this.player_name = player_name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
