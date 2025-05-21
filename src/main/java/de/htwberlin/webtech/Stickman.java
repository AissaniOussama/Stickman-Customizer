package de.htwberlin.webtech;

public class Stickman {

    private String name;
    private String hat;

    public Stickman(String name, String hat) {
        this.name = name;
        this.hat = hat;

    }

    public String getName() {
        return name;
    }

    public String getHat() {
        return hat;
    }

    public void setName(String Name) {
        this.name = name;
    }

    public void setHat(String Hat) {
        this.hat = Hat;
    }

}
