package dao;

import models.EndangeredAnimal;
import java.util.List;

public interface EndangeredAnimalDao {

    // LIST
    List<EndangeredAnimal> getAll();

    // CREATE
    void add(EndangeredAnimal task);

    // READ
    EndangeredAnimal findById(int id);

    // UPDATE
    // void update(int id, String content);

    // DELETE
    // void deleteById(int id);
    // void clearAllTasks();
}