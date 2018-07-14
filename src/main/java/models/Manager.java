package models;

import javax.persistence.*;

@Entity
@Table(name = "managers")
public class Manager {

    private int id;
    private String name;
    private int age;
    private Team team;

    public Manager(){}

    public Manager(String name, int age) {

        this.name = name;
        this.age = age;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
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

    @Column(name = "name")
    public String getName() {

        return name;
    }

    @Column(name = "age")
    public int getAge() {
        return age;
    }

    @OneToOne(mappedBy = "manager", fetch = FetchType.LAZY)
    public Team getTeam() {
        return team;
    }


}
