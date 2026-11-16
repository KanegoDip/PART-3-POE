QuickChat 💬

A simple Java console-based messaging application developed as part of a programming project.

About the Project

QuickChat is a messaging application that allows users to register, log in, send messages and store messages. It also provides a message reporting system where users can search, view and delete stored messages.

The application was developed using basic Java programming concepts and object-oriented programming.

Features

* User registration and login
* Username and password validation
* Cellphone number validation
* Message ID generation
* Message hash generation
* Send, disregard and store messages
* Store messages in a JSON file
* Display stored message reports
* Search messages using message IDs
* Search messages using recipient numbers
* Display the longest stored message
* Delete messages using message hashes

Technologies Used

* Java
* NetBeans IDE
* Java ArrayLists
* Java FileWriter
* Object-Oriented Programming

Project Structure

QuickChat/
│
├── MAIN.java
├── login.java
├── Messages.java
├── MessageReport.java
├── storedMessages.json
└── README.md

How to Run

1. Clone or download this repository.
2. Open NetBeans IDE.
3. Open the QuickChat project.
4. Make sure all Java classes are included.
5. Run MAIN.java.
6. Register using your personal details.
7. Log in using your registered username and password.
8. Select an option from the QuickChat menu.

Message Options

When sending a message, users can choose:

Option	Description
1	Send Message
2	Disregard Message
3	Store Message

Stored Message Report

The application provides six reporting options:

1. Display sender and recipient details.
2. Display the longest stored message.
3. Search for a message using its ID.
4. Search for messages sent to a particular recipient.
5. Delete a message using its hash.
6. Display a complete stored message report.

File Storage

Messages selected for storage are written to storedMessages.json using Java FileWriter.

Learning Outcomes

This project demonstrates the use of:

* Classes and objects
* Methods and constructors
* Encapsulation
* Conditional statements
* Switch statements
* Loops
* ArrayLists
* File handling
* Exception handling

Author

Student Java Programming Project

License

This project was developed for educational purposes.
