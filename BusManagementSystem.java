import java.util.Scanner;
public class BusManagementSystem {
    public static final int Max_Passengers = 40;
    public static final int Num_Bicycles = 4;
    public static void main(String[] args){
        int numOfPassengers = 0;
        int numOfBicycles = 0;
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        while(running){
            System.out.println("--Bus Management System--");
            System.out.println("1. Add Passenger");
            System.out.println("2. Remove Passenger");
            System.out.println("3. Add Bicycle");
            System.out.println("4. Remove Bicycle");
            System.out.println("5. Show Bus Status");
            System.out.println("6.Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if(choice == 1){
                System.out.print("How many passengers are getting on?: ");
                int passengersToAdd = sc.nextInt();
                if (numOfPassengers + passengersToAdd <= Max_Passengers){
                    numOfPassengers += passengersToAdd;
                    System.out.println("Passengers added successfully!");
                } else {
                    System.out.println("Not Enough Space On This Bus");
                }
            }else if(choice == 2){
                System.out.print("How many passengers are getting of?: ");
                int passengersToRemove = sc.nextInt();
                if (passengersToRemove <= numOfPassengers){
                    numOfPassengers -= passengersToRemove;
                } else{
                    System.out.println("Error: You can’t remove more " +
                                       "passengers than are on the bus!");
                }
            }else if(choice == 3){
                System.out.print("How many bicycles are getting on?: ");
                int bicyclesToAdd = sc.nextInt();
                if (numOfBicycles + bicyclesToAdd <= Num_Bicycles){
                   numOfBicycles += bicyclesToAdd;
                   System.out.println("Bicycles added successfully!");
                } else{
                    System.out.println("Not Enough Space On This Bus");
                }
            }else if(choice == 4){
                System.out.print("How many bicycles are getting of?: ");
                int bicyclesToRemove = sc.nextInt();
                if (bicyclesToRemove <= numOfBicycles){
                    numOfBicycles -= bicyclesToRemove;
                } else{
                    System.out.println("Error: You can’t remove more " +
                                       "bicycles than are on the bus!");
                }
            }else if(choice == 5){
                System.out.println("There are " + numOfPassengers + " Passengers " +
                                "and " + numOfBicycles + " Bicycles in the bus!");
            }else if(choice == 6){
                running = false;
            }

        }
           sc.close();
           System.out.println("Thank you for using BusManagementSystem!");


    }

}
