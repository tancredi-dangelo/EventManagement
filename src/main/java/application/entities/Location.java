package application.entities;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table
public class Location {

    // attributes = columns
    private @Id @GeneratedValue @OneToMany UUID id;
    private String name;
    private String city;

    // default constructor
    public Location() {}

    // constructor
    public Location(String name, String city) {
        this.name = name;
        this.city = city;
    }

    // getters

    public UUID getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getCity() {
        return city;
    }

    // setters

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
