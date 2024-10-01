package FlightReservation;

import java.util.*;

public class Passenger {

    void operation(List<Flight> flightsDetails){
        int passengerId=1;
        boolean flag=true;
        System.out.println("Your Passenger Id is : "+passengerId);
        while(flag){

            System.out.println("Enter you Choice : ");
            System.out.println("1.Book  2.Cancel   3.FlightDetails  4.exit");
            Scanner scn=new Scanner(System.in);
            int choice=scn.nextInt();
            BookCancel objBook=new BookCancel();
            switch(choice){
                case 1:{

                    objBook.book(flightsDetails,passengerId);
                    passengerId++;
                    break;


                }
                case 2:
                {

                    objBook.cancel(flightsDetails);
                    break;

                }
                case 3:
                {
                    System.out.println("The available Flights are : ");
                    for(int i=0;i<flightsDetails.size();i++){
                        flightsDetails.get(i).flightSummary();

                    }

                    break;
                }
                case 4:{
                    flag=false;
                }

            }

        }

    }
}
