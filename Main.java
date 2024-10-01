package FlightReservation;

import java.util.*;

public class Main extends Admin {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        boolean flag=true;
        while(flag) {
            System.out.println("For Login Enter 1 or 2 :");
            System.out.println("1.Admin");
            System.out.println("2.User");
            System.out.println("3.Exit");
            int choice = scn.nextInt();
            switch (choice) {

                case 1: {
                    System.out.println("Enter UserName : ");
                    String userName = scn.next();
                    System.out.println("Enter Password : ");
                    String password = scn.next();

                    if (userName.equals("Poorani") && password.equals("12345")) {
                        OperationAdmin();
                    } else {
                        System.out.println("Wrong Username or password");
                    }
                    break;
                }
                case 2: {

                    Passenger objPassenger = new Passenger();
                    objPassenger.operation(flightsDetails);
                    break;

                }
                case 3:{
                    flag=false;
                }

            }
        }

    }
}
