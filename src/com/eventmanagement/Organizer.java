package com.eventmanagement;

public class Organizer extends Person {

    private int organizerId;

    public Organizer(int organizerId, String name, String email) {
        super(name, email);
        this.organizerId = organizerId;
    }

    public void displayOrganizer() {
        System.out.println("Organizer ID: " + organizerId);
        displayDetails();
    }
}