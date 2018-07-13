package models;

public class Player {

    private int id;
    private String name;
    private int age;
    private String poisition;
    private Manager manager;

    public Player(){}

    public Player(String name, int age, String poisition, Manager manager) {
        this.name = name;
        this.age = age;
        this.poisition = poisition;
        this.manager = manager;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPoisition() {
        return poisition;
    }

    public void setPoisition(String poisition) {
        this.poisition = poisition;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }














}
