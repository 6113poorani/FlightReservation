package com.zsgs.flight.screens.flightList;

import com.zsgs.flight.BaseScreen;


import java.util.List;

public class FlightListScreen extends BaseScreen {
	
	private FlightListViewModel flightListViewModel;
	
	public FlightListScreen(){
		flightListViewModel = new FlightListViewModel(this);
	}
	
	public void onCreate() {
		if (hasNetworkConnection()) {
			System.out.println("Listing the Flight names");
			printFlightName(flightListViewModel.getMovieList());
		} else {
			System.out.println("Please check internet connection");
		}

	}

	private void printFlightName(List<String> flightList) {
		//Flight listing
		//getting choice from the user
	}
	


	public void successfullyBlockListed() {
		//Flights listing without blocked movie name.
	}

	public void showErrorMessage() {
		//show error message.
	}
	
}
