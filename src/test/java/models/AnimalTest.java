package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void createNewAnimalInstanceSuccessful_true(){
        Animal testAnimal = new Animal("lion", 1, "Near the River", "Dwight");
        assertEquals(true, testAnimal instanceof Animal);
    }

    @Test
    public void Animal_instantiatesWithAnimalName_String(){
        Animal testAnimal = new Animal("lion", 1, "Near the River", "Dwight");
        assertEquals("lion", testAnimal.getName());
    }

    @Test
    public void Animal_instantiatesWithAnimalId_Int(){
        Animal testAnimal = new Animal("lion", 1, "Near the River", "Dwight");
        assertEquals(1, testAnimal.getId());
    }

    @Test
    public void Animal_instantiatesWithAnimalLocation_String(){
        Animal testAnimal = new Animal("lion", 1, "Near the River", "Dwight");
        assertEquals("Near the River", testAnimal.getLocation());
    }

    @Test
    public void Animal_instantiatesWithAnimalRanger_String(){
        Animal testAnimal = new Animal("lion", 1, "Near the River", "Dwight");
        assertEquals("Dwight", testAnimal.getRanger());
    }
}