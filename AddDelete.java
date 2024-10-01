package FlightReservation;

import java.util.*;

public class AddDelete {
     void addFlights(List<Flight> flightsDetails) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter a Flight Name : ");
        String flightName=scn.next();
        System.out.println("Enter a no.of seats : ");
        int flightSeats=scn.nextInt();
        System.out.println("Enter a Price for a ticket : ");
        int ticketPrice=scn.nextInt();
        System.out.println("No. Of .rows");
        int row=scn.nextInt();
        System.out.print("No . Of . col");
        int col=scn.nextInt();
        Flight f=new Flight(flightName,flightSeats,ticketPrice,row,col);
        flightsDetails.add(f);
        System.out.println("Flight details added Successfully");
        f.flightSummary();

    }
   void deleteFlights(List<Flight> flightsDetails) {
      System.out.println("The available Flights are : ");
      for(int i=0;i<flightsDetails.size();i++){
         System.out.println(flightsDetails.get(i).flightId+" "+flightsDetails.get(i).flightName);
      }
      Scanner scn=new Scanner(System.in);
      System.out.println("Enter a Flight Id : ");
      int f=scn.nextInt();
      for(int i=0;i<flightsDetails.size();i++){
      if(f==flightsDetails.get(i).flightId){
         if(flightsDetails.get(i).passengerDetails.size()==0){
         flightsDetails.remove(i);
            System.out.println("The Flight "+f+" deleted successfully");
            break;}
         else{
            System.out.println("Already The passenger booked the flight");
            return;
         }
      }
      }
   }

}
