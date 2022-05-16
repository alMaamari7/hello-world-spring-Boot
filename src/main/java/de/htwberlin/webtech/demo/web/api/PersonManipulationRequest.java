package de.htwberlin.webtech.demo.web.api;

public class PersonManipulationRequest {


    private String firstname;
    private String lastname;
    private String contactDetails;
    private boolean offeredSomething;
    private boolean searchedSomething;


    public PersonManipulationRequest(String firstname, String lastname, String contactDetails) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.contactDetails = contactDetails;
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

    public String getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(String contactDetails) {
        this.contactDetails = contactDetails;
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
}
