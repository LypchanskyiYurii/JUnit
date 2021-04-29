package ua.com.yurii.lessons.test1;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @org.junit.jupiter.api.Test
    void testGetDogName() {
        Dog dog = new Dog("Bob", 2);
        assertEquals("Bob", dog.getName());
    }

    @org.junit.jupiter.api.Test
    void testSetDogName() {
        Dog dog = new Dog("Tom", 4);
        dog.setName("Gessy");
        assertEquals("Tom", dog.getName());
    }

    @org.junit.jupiter.api.Test
    void testSetDogNameIfEmpty() {
        Dog dog = new Dog("", 4);
        dog.setName("Gessy");
        assertEquals("Gessy", dog.getName());
    }

    @org.junit.jupiter.api.Test
    void testGetDogAge() {
        Dog dog = new Dog("Rey", 15);
        assertEquals(15, dog.getAge());
    }

    @org.junit.jupiter.api.Test
    void testSetDogAge() {
        Dog dog = new Dog("Rey", 10);
        dog.setAge(-15);
        assertEquals(10, dog.getAge());
    }
}