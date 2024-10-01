package FlightReservation;

import java.util.*;

public class Admin {

    static List<Flight> flightsDetails=new ArrayList<>();

     static void OperationAdmin(){
         boolean flag=true;
         while(flag){
             System.out.println("Enter Your Choice : ");{
                 System.out.println("1.Add the Flights"+"\n2.Delete the Flights"+"\n3.Print the Flight Details"+"\n4.Exit");
                 Scanner scn=new Scanner(System.in);
                 int choice=scn.nextInt();
                 AddDelete objAdd=new AddDelete();
                 switch (choice){
                     case 1:{
                        objAdd.addFlights(flightsDetails);
                        break;
                     }
                     case 2:{
                         objAdd.deleteFlights(flightsDetails);
                         break;
                     }
                     case 3:{
                         if(flightsDetails.size()==0){
                             System.out.println("There is no flights");
                         }
                         for(int i=0;i<flightsDetails.size();i++){
                             flightsDetails.get(i).flightSummary();
                             flightsDetails.get(i).printDetails();

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
}
