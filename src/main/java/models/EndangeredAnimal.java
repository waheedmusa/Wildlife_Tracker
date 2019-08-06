package models;

import java.sql.Connection;
import java.util.List;

public class EndangeredAnimal {

    private int id;
    private String name;
    private String health;
    private String age;
    private String location;
    private String ranger;

    public EndangeredAnimal(String name, String health, String age, String location, String ranger) {

        this.id = id;
        this.name = name;
        this.health = health;
        this.age = age;
        this.location = location;
        this.ranger = ranger;
    }

    public String getName() {
        return name;
    }

    public String getHealth() {
        return health;
    }

    public String getAge() {
        return age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public String getRanger() {
        return ranger;
    }


}