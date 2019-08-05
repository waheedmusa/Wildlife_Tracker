package models;

public class Animal {

    private String name;
    private int id;
    private String location;
    private String ranger;

    public Animal(String name, int id, String location, String ranger){
        this.name = name;
        this.id = id;
        this.location = location;
        this.ranger = ranger;

    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public String getRanger() {
        return ranger;
    }
}
