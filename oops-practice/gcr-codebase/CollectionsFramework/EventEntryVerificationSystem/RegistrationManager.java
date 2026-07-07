package GcrCodeBase.CollectionsFramework.EventEntryVerificationSystem;

import java.util.HashSet;

public class RegistrationManager {
    private HashSet<String> registeredEmails;

    public RegistrationManager() {
        registeredEmails = new HashSet<>();
    }

    public void registerParticipant(String email) {
        String normalizedEmail = email.trim().toLowerCase();
        if (registeredEmails.add(normalizedEmail)) {
            System.out.println("SUCCESS: Registration successful for [" + normalizedEmail + "]");
        } else {
            System.out.println("REJECTED: Duplicate registration detected for [" + normalizedEmail + "]");
        }
    }

    public void displayParticipants() {
        System.out.println("\n--- Registered Participants List ---");
        if (registeredEmails.isEmpty()) {
            System.out.println("No participants registered yet.");
        } else {
            for (String email : registeredEmails) {
                System.out.println("- " + email);
            }
        }
        System.out.println("Total attendees eligible to enter: " + registeredEmails.size());
        System.out.println("------------------------------------");
    }
}