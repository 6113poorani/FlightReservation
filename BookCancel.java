package FlightReservation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookCancel {
    void decrementSeatArray(String[][] seatArray,String n){
        int k=1;
        for(int i=0;i<seatArray.length;i++){
            for(int j=0;j<seatArray[i].length;j++){
                if(k==Integer.parseInt(n)){
                    seatArray[i][j]=n;
                    return;
                }
                k++;


            }
        }
    }
    void update(String[][] seatArray,String n,List<String> l){

        for(int i=0;i<seatArray.length;i++){
            for(int j=0;j<seatArray[i].length;j++){
                if(seatArray[i][j].equals(n)){
                    l.add(seatArray[i][j]);
                    seatArray[i][j]="*";
                    return;
                }
            }
        }
    }
     Flight findFlight(int f,List<Flight> flights){
        Flight c=null;
        for(Flight fid:flights){
            if(fid.flightId==f){
                return fid;
            }
        }
        return c;
    }

      void book(List<Flight> flightsDetails, int passengerId){
        System.out.println("The available Flights are : ");
        for(int i=0;i<flightsDetails.size();i++){
            System.out.println(flightsDetails.get(i).flightId+" "+flightsDetails.get(i).flightName);
        }
        System.out.printf("%n");
        System.out.println("Enter your Flight ID : ");
        Scanner scn=new Scanner(System.in);
        int f=scn.nextInt();
        if(f>flightsDetails.size()){
            System.out.println("There is no flight availble at this ID");
            return;
        }
          System.out.println("The available seats are : ");
        Flight currentFlight=findFlight(f,flightsDetails);
        for(int i=0;i<currentFlight.row;i++){
            for(int j=0;j<currentFlight.col;j++){
                System.out.print(currentFlight.seatArray[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("How many tickets do you want to book : ");
        int t=scn.nextInt();
        List<String> seatBooking=new ArrayList<>();
        for(int i=0;i<t;i++){
            String n=scn.next();
            update(currentFlight.seatArray,n,seatBooking);
        }
        addPassenger(passengerId,t,currentFlight);

        currentFlight.seatsBooked.add(seatBooking);
        currentFlight.flightSummary();

    }
    void cancel(List<Flight> flightsDetails) {
        System.out.println("Enter the flight Id : ");
        Scanner scn = new Scanner(System.in);
        int f = scn.nextInt();
        System.out.print("Enter the Passenger Id : ");
        int passengerid = scn.nextInt();
        if (f > flightsDetails.size()) {
            System.out.println("There is no flight availble at this ID");
            return;
        }
        Flight currentFlight = findFlight(f, flightsDetails);

        cancelPassenger(passengerid, currentFlight);


    }
    void addPassenger(int passenger,int tickets,Flight f){

        f.passengerDetails.add("The passenger Id is "+passenger+" "+tickets+" tickets are booked with a cost of "+tickets*f.price);
        f.passengerId.add(passenger);
        f.ticketsBooked.add(tickets);
        f.ticketCost.add(f.price*tickets);
        f.seats-=tickets;
        f.price+=(200*tickets);
        System.out.println("Booked Successfully");

    }
    void cancelPassenger(int passenger,Flight f){

        int index=f.passengerId.indexOf(passenger);
        if(index==-1){
            System.out.println("There is no passenger like that");
            return;
        }
        System.out.println("The booked tickets are : ");
        for(int i=0;i<f.seatsBooked.get(index).size();i++){
            System.out.println(f.seatsBooked.get(index).get(i));
            decrementSeatArray(f.seatArray,f.seatsBooked.get(index).get(i));
        }
        f.seatsBooked.remove(index);
        int totaltickets=f.ticketsBooked.get(index);
        int totalprice=f.ticketCost.get(index);
        System.out.println(totalprice+ "refunded Succesfully!");
        f.seats+=totaltickets;
        f.price-=(200*totaltickets);
        f.passengerId.remove(index);
        f.passengerDetails.remove(index);
        f.ticketsBooked.remove(index);
        f.ticketCost.remove(index);

    }
}
