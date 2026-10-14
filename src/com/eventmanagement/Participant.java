package com.eventmanagement;

public class Participant extends Person {

    private int participantId;

    public Participant(int participantId, String name, String email) {
        super(name, email);
        this.participantId = participantId;
    }

    public int getParticipantId() {
        return participantId;
    }

    @Override
    public void displayDetails() {
        System.out.println("Participant ID: " + participantId);
        super.displayDetails();
    }
}