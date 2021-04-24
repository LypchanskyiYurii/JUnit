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
    void getAge() {
    }

    @org.junit.jupiter.api.Test
    void setAge() {
    }
}