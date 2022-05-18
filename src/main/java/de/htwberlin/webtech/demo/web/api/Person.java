package de.htwberlin.webtech.demo.web.api;

public class Person {

    private long id;
    private String firstname;
    private String lastname;
    private boolean offeredSomething;
    private boolean searchedSomething;
    private String contactDetails;


    public Person(long id, String firstname, String lastname, boolean offeredSomething, boolean searchedSomething, String contactDetails) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.offeredSomething = offeredSomething;
        this.searchedSomething = searchedSomething;
        this.contactDetails = contactDetails;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
