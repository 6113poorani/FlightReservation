package FlightReservation;
import java.util.*;
public class Flight {
     static int flights=1;
     String flightName;
     int flightId;
     int seats;
     int row,col;
     String[][] seatArray;
     int price;
      List<String> passengerDetails;
     List<Integer> passengerId;
    List<Integer> ticketsBooked;
    List<Integer> ticketCost;
    List<List<String>> seatsBooked;
    Flight(String flightName,int flightSeats,int ticketPrice,int row,int col){
        this.flightId=flights;
        flights++;
        this.flightName=flightName;
        this.seats=flightSeats;
        this.price=ticketPrice;
        this.row=row;
        this.col=col;
        this.seatArray=new String[row][col];
        seatfill(seatArray,row,col);
        this.passengerDetails=new ArrayList<>();
        this.passengerId=new ArrayList<>();
        this.ticketsBooked=new ArrayList<>();
        this.ticketCost=new ArrayList<>();
        this.seatsBooked=new ArrayList<>();

    }
    void seatfill(String[][] seatArray,int row,int col){
        int k=1;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                seatArray[i][j]=String.valueOf(k++);
            }
        }
    }

    void flightSummary(){
        System.out.println("Information Of Flight : "+flightId);
        System.out.println("Flight Name : "+flightName);
        System.out.println("The Available seats are : "+seats);
        System.out.println(row);
        System.out.println(col);
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(seatArray[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("The Price per ticket is : "+price);
        System.out.println("----------------------------");
    }
    void printDetails(){
        System.out.println("Passenger Details of Flight "+flightId);
        for(int i=0;i<passengerDetails.size();i++){
            System.out.println(passengerDetails.get(i));
            for(int j=0;j<seatsBooked.get(i).size();j++){
                System.out.print(seatsBooked.get(i).get(j)+" ");
            }
        }
        System.out.println("---------------------------------");
    }
}
