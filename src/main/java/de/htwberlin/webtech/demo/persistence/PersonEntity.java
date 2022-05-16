package de.htwberlin.webtech.demo.persistence;

import javax.persistence.*;

@Entity(name= "persons")
public class PersonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="first_name", nullable = false)
    private String firstname;

    @Column(name="last_name", nullable = false)
    private String lastname;

    private boolean offeredSomething;
    private boolean searchedSomething;

    @Column(name="contact_details", nullable = false)
    private String contactDetails;


    public PersonEntity(Long id, String firstname, String lastname, boolean offeredSomething, boolean searchedSomething, String contactDetails) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.offeredSomething = offeredSomething;
        this.searchedSomething = searchedSomething;
        this.contactDetails = contactDetails;
    }

    public PersonEntity(String firstname, String lastname, String contactDetails, boolean offeredSomething, boolean searchedSomething) {
    }


    public Long getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public boolean isOfferedSomething() {
        return offeredSomething;
    }

    public void setOfferedSomething(boolean offeredSomething) {
        this.offeredSomething = offeredSomething;
    }

    public boolean isSearchedSomething() {
        return searchedSomething;
    }

    public void setSearchedSomething(boolean searchedSomething) {
        this.searchedSomething = searchedSomething;
    }

    public String getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(String contactDetails) {
        this.contactDetails = contactDetails;
    }
}
