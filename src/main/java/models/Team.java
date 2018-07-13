package models;

import java.util.List;

public class Team {

    private int id;
    private String name;
    private List<Player> players;
    private Manager manager;
    private int leaguePosition;
    private int points;
    private List<Competition> competitions;

    public Team(){}

    public Team(String name, List<Player> players, Manager manager, int leaguePosition, int points, List<Competition> competitions) {
        this.name = name;
        this.players = players;
        this.manager = manager;
        this.leaguePosition = leaguePosition;
        this.points = points;
        this.competitions = competitions;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public int getLeaguePosition() {
        return leaguePosition;
    }

    public void setLeaguePosition(int leaguePosition) {
        this.leaguePosition = leaguePosition;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public List<Competition> getCompetitions() {
        return competitions;
    }

    public void setCompetitions(List<Competition> competitions) {
        this.competitions = competitions;
    }


















}
