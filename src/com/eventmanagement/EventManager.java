package com.eventmanagement;

import java.util.ArrayList;

public class EventManager {

    ArrayList<Event> events = new ArrayList<>();
    ArrayList<Participant> participants = new ArrayList<>();

    public void addEvent(Event event) {
        events.add(event);
        System.out.println("Event added successfully!");
    }

    public void viewEvents() {

        if (events.isEmpty()) {
            System.out.println("No events available.");
            return;
        }

        for (Event event : events) {
            event.displayEvent();
        }
    }

    public void registerParticipant(Participant participant) {
        participants.add(participant);
        System.out.println("Participant registered successfully!");
    }

    public void viewParticipants() {

        if (participants.isEmpty()) {
            System.out.println("No participants registered.");
            return;
        }

        for (Participant participant : participants) {
            participant.displayDetails();
            System.out.println("--------------------------");
        }
    }

    public void searchEvent(int id) {

        for (Event event : events) {

            if (event.getEventId() == id) {
                event.displayEvent();
                return;
            }
        }

        System.out.println("Event not found.");
    }
}