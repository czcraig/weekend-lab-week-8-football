package models;

import java.util.List;

public class Competition {

    private int id;
    private String name;
    private List<Team> teams;

    public Competition(String name) {
        this.name = name;
        this.teams = teams;
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

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }
}
