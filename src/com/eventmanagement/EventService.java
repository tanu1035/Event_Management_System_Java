package com.eventmanagement;

import java.util.Scanner;

public class EventService {

    Scanner sc = new Scanner(System.in);
    EventManager manager = new EventManager();

    public void start() {

        int choice;

        do {
            System.out.println("\n===== EVENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Event");
            System.out.println("2. View Events");
            System.out.println("3. Search Event");
            System.out.println("4. Register Participant");
            System.out.println("5. View Participants");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Event ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Event Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Event Date: ");
                    String date = sc.nextLine();

                    System.out.print("Enter Venue: ");
                    String venue = sc.nextLine();

                    Event event = new Event(id, name, date, venue);
                    manager.addEvent(event);
                    break;

                case 2:
                    manager.viewEvents();
                    break;

                case 3:
                    System.out.print("Enter Event ID to search: ");
                    int searchId = sc.nextInt();

                    manager.searchEvent(searchId);
                    break;

                case 4:
                    System.out.print("Enter Participant ID: ");
                    int pid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Participant Name: ");
                    String pname = sc.nextLine();

                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();

                    Participant participant =
                            new Participant(pid, pname, email);

                    manager.registerParticipant(participant);
                    break;

                case 5:
                    manager.viewParticipants();
                    break;

                case 6:
                    System.out.println("Thank you for using the system!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 6);
    }
}