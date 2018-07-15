package models;

import javax.persistence.*;

@Entity
@Table(name = "players")
public class Player {

    private int id;
    private String name;
    private int age;
    private String position;
    private Team team;

    public Player(){}

    public Player(String name, int age, String position, Team team) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.team = team;
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


    @Column(name = "age")
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Column(name = "position")
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }



    @ManyToOne
    @JoinColumn(name = "team_id", nullable = false)
    public Team getTeam(){
        return  team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
