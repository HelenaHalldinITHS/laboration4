package org.example;

public class Member {
    private int id;
    private String firstName;
    private String lastName;
    private boolean active;

    public Member(){}

    public Member(String firstName, String lastName, boolean active) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.active = active;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
