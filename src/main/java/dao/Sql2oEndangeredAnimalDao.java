package dao;

import models.EndangeredAnimal;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import org.sql2o.Sql2oException;

import java.util.List;

public class Sql2oEndangeredAnimalDao implements EndangeredAnimalDao {

    private final Sql2o sql2o;

    public Sql2oEndangeredAnimalDao(Sql2o sql2o){
        this.sql2o = sql2o; //making the sql2o object available everywhere so we can call methods in it
    }

    @Override
    public List<EndangeredAnimal> getAll() {
        try(Connection con = sql2o.open()){
            return con.createQuery("SELECT * FROM endangered") //raw sql
                    .executeAndFetch(EndangeredAnimal.class); //fetch a list
        }
    }

    @Override
    public void add(EndangeredAnimal endangeredAnimal) {

        String sql = "INSERT INTO tasks (name, health, age, location, ranger) VALUES (:name, :health, :age, :location, :ranger)"; //raw sql
        try(Connection con = sql2o.open()){ //try to open a connection
            int id = (int) con.createQuery(sql, true) //make a new variable
                    .bind(endangeredAnimal) //map my argument onto the query so we can use information from it
                    .executeUpdate() //run it all
                    .getKey(); //int id is now the row number (row “key”) of db
            endangeredAnimal.setId(id); //update object to set id now from database
        } catch (Sql2oException ex) {
            System.out.println(ex); //oops we have an error!
        }


    }

    @Override
    public EndangeredAnimal findById(int id) {
        return null;
    }
}
