import java.util.Map;
import java.util.HashMap;

import dao.EndangeredAnimalDao;
import dao.Sql2oAnimalDao;
import dao.Sql2oEndangeredAnimalDao;
import models.Animal;
import models.EndangeredAnimal;
import org.sql2o.Sql2o;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");

        String connectionString = "jdbc:h2:~/wildlife_tracker.db;INIT=RUNSCRIPT from 'classpath:db/create.sql'";
        Sql2o sql2o = new Sql2o(connectionString, "", "");
        Sql2oAnimalDao animalDao = new Sql2oAnimalDao(sql2o);
        Sql2oEndangeredAnimalDao endangeredAnimalDao = new Sql2oEndangeredAnimalDao(sql2o);

        get("/", (request, response) -> {
           Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

        get("/sighting_form", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "sighting-form.hbs");
        }, new HandlebarsTemplateEngine());

        post("/animal_list", (req, res) -> { //URL to make new task on POST route
            Map<String, Object> model = new HashMap<>();
            String name = req.queryParams("name");
            String health = req.queryParams("health");
            String age = req.queryParams("age");
            String location = req.queryParams("location");
            String ranger = req.queryParams("ranger");
            Animal newAnimal = new Animal(name, location, ranger);
            EndangeredAnimal newEndangeredAnimal = new EndangeredAnimal(name, health, age, location, ranger);
            animalDao.add(newAnimal);
            endangeredAnimalDao.add(newEndangeredAnimal);
            res.redirect("/animal-list.hbs");
            return null;
        }, new HandlebarsTemplateEngine());

        //get: show an individual task that is nested in a category
        get("/animal_list", (req, res) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "animal-list.hbs");
        }, new HandlebarsTemplateEngine());

        get("/sighting_success", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            String name = request.queryParams("name");
            String health = request.queryParams("health");
            String age = request.queryParams("age");
            model.put("name", name);
            model.put("health", health);
            model.put("age", age);
            return new ModelAndView(model, "sighting-success.hbs");
        }, new HandlebarsTemplateEngine());

    }
}