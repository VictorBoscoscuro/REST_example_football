package com.restapiplayers.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Team {

    @Id
    @GeneratedValue(generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private Long id_team;

    @Column(nullable = false, length = 255, name = "team_name")
    private String team_name;

    @Column(nullable = false, length = 120, name = "country")
    private String country;

    public Long getId_team() {
        return id_team;
    }

    public void setId_team(Long id_team) {
        this.id_team = id_team;
    }

    public String getTeam_name() {
        return team_name;
    }

    public void setTeam_name(String team_name) {
        this.team_name = team_name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
