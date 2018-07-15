package models;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "teams")
public class Team {

    private int id;
    private String name;
    private List<Player> players;
    private Manager manager;
    private int leaguePosition;
    private String competitions;

    public Team(){}

    public Team(String name,Manager manager, int leaguePosition, String competitions) {
        this.name = name;
        this.manager = manager;
        this.leaguePosition = leaguePosition;

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToOne(mappedBy = "player", fetch = FetchType.LAZY)
    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "manager_id", nullable = false)
    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    @Column(name = "league_position")
    public int getLeaguePosition() {
        return leaguePosition;
    }

    public void setLeaguePosition(int leaguePosition) {
        this.leaguePosition = leaguePosition;
    }


    @Column(name = "competition")
    public String getCompetitions() {
        return competitions;
    }

    public void setCompetitions(String competitions) {
        this.competitions = competitions;
    }


















}
