package de.htwberlin.webtech;

import jakarta.persistence.*;


/*
This Class defines the customizable Stickman as Objects. aka their necessary Attributes and Methods.
 */
@Entity
public class Stickman {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String hat;
    private String top;
    private String bot;
    private String owner;

    public Stickman() {}

    public Stickman(String name, String hat, String top, String bot) {
        this.name = name;
        this.hat = hat;
        this.top = top;
        this.bot = bot;
    }


    public String getName() { return name; }
    public String getHat() { return hat; }
    public String getTop() { return top; }
    public String getBot() { return bot; }
    public String getOwner() { return owner; }
    public Long getId() { return id; }
    public void setName(String name) { this.name = name; }
    public void setHat(String hat) { this.hat = hat; }
    public void setTop(String top) { this.top = top; }
    public void setBot(String bot) { this.bot = bot; }
    public void setId(Long id) { this.id = id; }
    public void setOwner(String owner) {
        this.owner = owner;
    }

    //JSON format
    @Override
    public String toString() {
        return "Stickman{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hat='" + hat + '\'' +
                ", top='" + top + '\'' +
                ", bot='" + bot + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }

}
