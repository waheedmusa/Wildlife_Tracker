package models;

import java.sql.Connection;
import java.util.List;

public class Animal {

    private int id;
    private String name;
    private String location;
    private String ranger;

    public Animal(String name, String location, String ranger){
        this.id = id;
        this.name = name;
        this.location = location;
        this.ranger = ranger;
    }



    public String getName() {
        return name;
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

    @Override
    public boolean equals(Object otherAnimal) {
        if (!(otherAnimal instanceof Animal)) {
            return false;
        } else {
            Animal newAnimal = (Animal) otherAnimal;
            return this.getName().equals(newAnimal.getName()) &&
                    this.getLocation() == newAnimal.getLocation()&&
                    this.getRanger() == newAnimal.getRanger();
        }
    }


}
