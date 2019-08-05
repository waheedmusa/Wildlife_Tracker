package models;

public class EndangeredAnimal {

    private String name;
    private int id;
    private String health;
    private String age;
    private String location;
    private String ranger;

    public EndangeredAnimal(String name, int id, String health, String age, String location, String ranger){

        this.name = name;
        this.id = id;
        this.health = health;
        this.age = age;
        this.location = location;
        this.ranger = ranger;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getHealth() {
        return health;
    }

    public String getAge() {
        return age;
    }

    public String getLocation() {
        return location;
    }

    public String getRanger() {
        return ranger;
    }
}
