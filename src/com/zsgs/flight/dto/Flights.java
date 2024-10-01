package com.zsgs.flight.dto;

import java.sql.Time;
import java.util.List;

public class Flights{
    private String flightName;
    private String flightDescription;
    private int flightSeats;
    private Time departureTime;
    private Time arraivalTime;


    public String getMovieName() {
        return flightName;
    }

    public void setMovieName(String flightName) {

        this.flightName = flightName;
    }

    public String getMovieDescription() {

        return flightDescription;
    }

    public void setMovieDescription(String flightDescription) {

        this.flightDescription= flightDescription;
    }

    public int getFlightSeats() {
        return flightSeats;
    }

    public void setFlightSeats(int flightSeats) {
        this.flightSeats = flightSeats;
    }

    public Time getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Time departureTime) {
        this.departureTime = departureTime;
    }

    public Time getArraivalTime() {
        return arraivalTime;
    }

    public void setArraivalTime(Time arraivalTime) {
        this.arraivalTime = arraivalTime;
    }


}
