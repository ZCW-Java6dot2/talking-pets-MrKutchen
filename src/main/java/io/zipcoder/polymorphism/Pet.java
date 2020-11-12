package io.zipcoder.polymorphism;

import java.lang.reflect.Field;

public class Pet {
    private String name;

    public String speak() {
        return "noise";
    }

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
