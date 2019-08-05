package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EndangeredAnimalTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void createNewEndangeredAnimalInstanceSuccessful_true(){
        EndangeredAnimal testEndangeredAnimal = new EndangeredAnimal("rhino", 1, "healthy", "adult", "Near the River", "Dwight");
        assertEquals(true, testEndangeredAnimal instanceof EndangeredAnimal);
    }

    @Test
    public void EndangeredAnimal_instantiatesWithEndangeredAnimalName_String(){
        EndangeredAnimal testEndangeredAnimal = new EndangeredAnimal("rhino", 1, "healthy", "adult", "Near the River", "Dwight");
        assertEquals("rhino", testEndangeredAnimal.getName());
    }

    @Test
    public void EndangeredAnimal_instantiatesWithEndangeredAnimalId_Int(){
        EndangeredAnimal testEndangeredAnimal = new EndangeredAnimal("rhino", 1, "healthy", "adult", "Near the River", "Dwight");
        assertEquals(1, testEndangeredAnimal.getId());
    }

    @Test
    public void EndangeredAnimal_instantiatesWithEndangeredAnimalHealth_String(){
        EndangeredAnimal testEndangeredAnimal = new EndangeredAnimal("rhino", 1, "healthy", "adult", "Near the River", "Dwight");
        assertEquals("healthy", testEndangeredAnimal.getHealth());
    }

    @Test
    public void EndangeredAnimal_instantiatesWithEndangeredAnimalAge_String(){
        EndangeredAnimal testEndangeredAnimal = new EndangeredAnimal("rhino", 1, "healthy", "adult", "Near the River", "Dwight");
        assertEquals("adult", testEndangeredAnimal.getAge());
    }

    @Test
    public void EndangeredAnimal_instantiatesWithEndangeredAnimalLocation_String(){
        EndangeredAnimal testEndangeredAnimal = new EndangeredAnimal("rhino", 1, "healthy", "adult", "Near the River", "Dwight");
        assertEquals("Near the River", testEndangeredAnimal.getLocation());
    }

    @Test
    public void EndangeredAnimal_instantiatesWithEndangeredAnimalRanger_String(){
        EndangeredAnimal testEndangeredAnimal = new EndangeredAnimal("rhino", 1, "healthy", "adult", "Near the River", "Dwight");
        assertEquals("Dwight", testEndangeredAnimal.getRanger());
    }
}