/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;
import java.util.Scanner;
/**
 *
 * @author Student
 */
import java.util.Scanner;

public class MAIN {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        login user = new login();

        System.out.print("Enter first name: ");
        String firstName = input.nextLine();

        System.out.print("Enter last name: ");
        String lastName = input.nextLine();

        System.out.print("Enter username: ");
        String username = input.nextLine();

        System.out.print("Enter password: ");
        String password = input.nextLine();

        System.out.print("Enter cellphone number: ");
        String phone = input.nextLine();

        String registration = user.registerUser(
                username, password, phone);

        System.out.println(registration);

        if (registration.equals("User is successfully registered.")) {

            System.out.println();
            System.out.println("LOGIN");

            System.out.print("Enter username: ");
            String loginUsername = input.nextLine();

            System.out.print("Enter password: ");
            String loginPassword = input.nextLine();

            boolean status = user.loginUser(
                    loginUsername,
                    loginPassword,
                    username,
                    password);

            if (status) {

                System.out.println("Welcome TO QuickChat ");

                System.out.println("option 1) Send Messages");
                System.out.println("option 2) Recently sent messages");
                System.out.println("option 3) Quit");

                int controllerv = Integer.parseInt(input.nextLine());

                switch (controllerv) {

                    case 1:

                        System.out.println("How many Messages would you like to send?");

                        int howMany = Integer.parseInt(input.nextLine());

                        for (int i = 1; i <= howMany; i++) {

                            System.out.print("Enter recipient (+27...): ");
                            String rec = input.nextLine();

                            System.out.print("Enter message: ");
                            String msgText = input.nextLine();

                            if (msgText.length() > 250) {

                                System.out.println("Please enter a message of less than 250 characters.");
                                i--;
                                continue;
                            }

                            Messages m = new Messages(i, rec, msgText);

                            System.out.println(m.checkRecipientCell());

                            System.out.println("Message Hash: " + m.getMessageHash());

                            System.out.println(m.sentMessage());

                            System.out.println("MessagesID: " + m.getMessageID());
                            System.out.println("MessagesHash: " + m.getMessageHash());
                            System.out.println("Recipient: " + m.getRecipient());
                            System.out.println("Message: " + m.getMessage());

                            System.out.println("");
                        }

                        System.out.println("Total messages sent: " + Messages.returnTotalMessages());

                        break;

                    case 2:

                        System.out.println("""
                                
                                ===== STORED MESSAGE MENU =====

                                a) Display the sender and recipient of all stored messages.
                                b) Display the longest stored message.
                                c) Search for a message ID and display the corresponding recipient and message.
                                d) Search for all messages stored for a particular recipient.
                                e) Delete a message using the message hash.
                                f) Display a report of all stored messages.

                                """);

                        System.out.print("Select an option: ");

                        String reportChoice = input.nextLine().toLowerCase();

                        switch (reportChoice) {

                            case "a":

                                MessageReport.displaySenderRecipient();

                                break;

                            case "b":

                                MessageReport.displayLongestMessage();

                                break;

                            case "c":

                                System.out.print("Enter Message ID: ");
                                String id = input.nextLine();

                                MessageReport.searchMessageID(id);

                                break;

                            case "d":

                                System.out.print("Enter Recipient: ");
                                String recipientSearch = input.nextLine();

                                MessageReport.searchRecipient(recipientSearch);

                                break;

                            case "e":

                                System.out.print("Enter Message Hash: ");
                                String hash = input.nextLine();

                                MessageReport.deleteMessage(hash);

                                break;

                            case "f":

                                MessageReport.displayReport();

                                break;

                            default:

                                System.out.println("Invalid selection.");

                                break;
                        }

                        break;

                    case 3:

                        System.out.println("Goodbye");

                        System.exit(0);

                        break;

                    default:

                        System.out.println("Invalid option");

                        break;
                }

            } else {

                System.out.println("Login failed");
            }

        } else {

            System.out.println("Registration UnSuccessful");
        }

        input.close();
    }
}