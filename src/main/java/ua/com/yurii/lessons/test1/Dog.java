package ua.com.yurii.lessons.test1;

import java.io.IOException;

public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        if (age <= 0) {
            try {
                throw new IOException();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (this.name.isEmpty()) {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age == this.age) {
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
