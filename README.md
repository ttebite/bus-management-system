# Bus Management System (Java)
This project is a simple command-line bus management system written in Java.
It simulates tracking passengers and bicycles on a bus while enforcing capacity limits.

The program allows a user to interact with the system through a menu where they can add or
remove passengers and bicycles and check the current status of the bus.

## Features
* Add passengers to the bus
* Remove passengers from the bus
* Add bicycles to the bus
* Remove bicycles from the bus
* View the current number of passengers and bicycles
* Prevent exceeding bus capacity limits

## How It Works
The system maintains two counts:
* Number of passengers on the bus
* Number of bicycles on the bus

Capacity limits are enforced using constants:
* Maximum passengers: **40**
* Maximum bicycles: **4**

The program repeatedly displays a menu and asks the user to select an option. 
Based on the user's input, the system updates the passenger or bicycle count while
ensuring capacity rules are followed.

## Example Menu
```
-- Bus Management System --
1. Add Passenger
2. Remove Passenger
3. Add Bicycle
4. Remove Bicycle
5. Show Bus Status
6. Exit
```

The system validates inputs to ensure passengers or bicycles cannot exceed capacity or drop below zero.

## Technologies Used
* Java
* Command-line interface
* Basic input handling using `Scanner`

## Key Concepts Demonstrated
* Object-oriented programming
* Control flow using loops and conditionals
* Input validation
* Command-line program design
