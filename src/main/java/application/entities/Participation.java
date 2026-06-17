package application.entities;

import application.enums.ParticipationState;
import application.enums.TypeOfEvent;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table

public class Participation {

    // attributes = columns
    private @Id @GeneratedValue(strategy = GenerationType.UUID) UUID id;
    private @OneToOne Person person;
    private @ManyToOne Event event;
    private @Enumerated(EnumType.STRING) ParticipationState state;

    // default constructor
    public Participation() {}

    // constructor
    public Participation(Person person, Event event, ParticipationState state) {
        this.person = person;
        this.event = event;
        this.state = state;
    }

    // getters

    public UUID getId() {
        return id;
    }
    public Person getPerson() {
        return person;
    }
    public Event getEvent() {
        return event;
    }
    public ParticipationState getState() {
        return state;
    }

    // setters

    public void setId(UUID id) {
        this.id = id;
    }
    public void setPerson(Person person) {
        this.person = person;
    }
    public void setEvent(Event event) {
        this.event = event;
    }
    public void setState(ParticipationState state) {
        this.state = state;
    }

}
