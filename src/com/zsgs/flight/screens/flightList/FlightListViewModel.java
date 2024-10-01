package com.zsgs.flight.screens.flightList;

import com.zsgs.flight.screens.availableticket.AvailableTicketsScreen;

import java.util.ArrayList;
import java.util.List;

class FlightListViewModel {
	
	private FlightListScreen flightListScreen;

	public FlightListViewModel(FlightListScreen flightListScreen) {
		this.flightListScreen = flightListScreen;
	}

	public List<String> getMovieList() {
		List<String> flightName =  new ArrayList<String>();
		flightName.add("INDIGO");
		flightName.add("AIRINDIA");
		return flightName;
	}
	
	public void onFlightSelected(String flightName) {
		AvailableTicketsScreen availableTicketsScreen=new AvailableTicketsScreen();
		availableTicketsScreen.onCreate();

	}
	
	public void dontShowFlight(String flightName) {
		
	}

}
