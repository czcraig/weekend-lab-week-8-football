package models;

public class Manager {

    private int id;
    private String name;
    private int age;
    private Team team;

    public Manager(){}

    public Manager(String name, int age, Team team) {

        this.name = name;
        this.age = age;
        this.team = team;
    }

    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public String getName() {

        return name;
    }

    public int getAge() {
        return age;
    }

    public Team getTeam() {
        return team;
    }


}
