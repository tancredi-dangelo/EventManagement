package application.entities;

import application.enums.TypeOfEvent;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "events")

public class Event {

    // attributes = columns
    private @Id @GeneratedValue(strategy = GenerationType.UUID) @OneToOne UUID id;
    private String title;
    private LocalDate date;
    private String location;
    private String description;
    private @Enumerated(EnumType.STRING) TypeOfEvent typeOfEvent;
    private int maxNumParticipants;

    // constructor
    public Event(){
    }

    // constructor
    public Event(UUID id, String title, LocalDate date, String location, String description, TypeOfEvent typeOfEvent, int maxNumParticipants) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.location = location;
        this.description = description;
        this.typeOfEvent = typeOfEvent;
        this.maxNumParticipants = maxNumParticipants;
    }

    // getters

    public UUID getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public LocalDate getDate() {
        return date;
    }
    public String getLocation() {return location;}
    public String getDescription() {
        return description;
    }
    public TypeOfEvent getTypeOfEvent() {
        return typeOfEvent;
    }
    public int getMaxNumParticipants() {
        return maxNumParticipants;
    }


    // setters

    public void setId(UUID id) {
        this.id = id;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public void setLocation(String location) { this.location = location; }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setTypeOfEvent(TypeOfEvent typeOfEvent) {
        this.typeOfEvent = typeOfEvent;
    }
    public void setMaxNumParticipants(int maxNumParticipants) {
        this.maxNumParticipants = maxNumParticipants;
    }

}
