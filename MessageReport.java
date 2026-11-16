/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Student
 */
public class MessageReport {

    // Part 1: Display sender and recipient
    public static void displaySenderRecipient() {

        for (Messages msg : Messages.storedMessages) {

            System.out.println("Sender: User");
            System.out.println("Recipient: " + msg.getRecipient());
            System.out.println();
        }
    }

    // Part 2: Display the longest message
    public static void displayLongestMessage() {

        Messages longest = null;

        for (Messages msg : Messages.storedMessages) {

            if (longest == null ||
                msg.getMessage().length() > longest.getMessage().length()) {

                longest = msg;
            }
        }

        if (longest != null) {

            System.out.println("Longest Message:");
            System.out.println(longest.getMessage());

        } else {

            System.out.println("No stored messages found.");
        }
    }

    // Part 3: Search for a message using its ID
    public static void searchMessageID(String id) {

        for (Messages msg : Messages.storedMessages) {

            if (msg.getMessageID().equals(id)) {

                System.out.println("Recipient: " + msg.getRecipient());
                System.out.println("Message: " + msg.getMessage());
                return;
            }
        }

        System.out.println("Message not found.");
    }

    // Search for messages using recipient number
    public static void searchRecipient(String recipient) {

        boolean found = false;

        for (Messages msg : Messages.storedMessages) {

            if (msg.getRecipient().equals(recipient)) {

                System.out.println("Message: " + msg.getMessage());

                found = true;
            }
        }

        if (!found) {

            System.out.println("No messages found.");
        }
    }

    // Delete a message using its hash
    public static void deleteMessage(String hash) {

        for (int i = 0; i < Messages.storedMessages.size(); i++) {

            if (Messages.storedMessages.get(i).getMessageHash().equals(hash)) {

                Messages.storedMessages.remove(i);

                System.out.println("Message deleted.");
                return;
            }
        }

        System.out.println("Hash not found.");
    }

    // Display all stored messages
    public static void displayReport() {

        System.out.println("\n===== MESSAGE REPORT =====");

        for (Messages msg : Messages.storedMessages) {

            System.out.println("\nMessage ID: " + msg.getMessageID());
            System.out.println("Hash: " + msg.getMessageHash());
            System.out.println("Recipient: " + msg.getRecipient());
            System.out.println("Message: " + msg.getMessage());
        }
    }
}   

