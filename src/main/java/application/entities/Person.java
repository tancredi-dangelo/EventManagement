package application.entities;

import application.enums.PersonSex;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@Table
public class Person {

    // attributes = columns
    private @Id @GeneratedValue(strategy = GenerationType.UUID) @OneToMany UUID id;
    private String name;
    private String surname;
    private String email;
    private Date birthdate;
    private PersonSex sex;
    private List<Event> participationsList;

    // default constructor
    public Person() {
    }

    // constructor
    public Person(String name, String surname, String email, Date birthdate, PersonSex sex, List<Event> participationsList) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.birthdate = birthdate;
        this.sex = sex;
        this.participationsList = participationsList;
    }

    // getters

    public UUID getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getEmail() {
        return email;
    }
    public Date getBirthdate() {
        return birthdate;
    }
    public PersonSex getSex() {
        return sex;
    }
    public List<Event> getParticipationsList() {
        return participationsList;
    }


    // setters

    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }
    public void setSex(PersonSex sex) {
        this.sex = sex;
    }
    public void setParticipationsList(List<Event> participationsList) {
        this.participationsList = participationsList;
    }

}
