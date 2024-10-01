package com.zsgs.flight.screens.availableticket;

import com.zsgs.flight.BaseScreen;

import java.util.List;

public class AvailableTicketsScreen extends BaseScreen {
	private AvailableTicketsViewModel viewModel;

	public AvailableTicketsScreen() {
		viewModel = new AvailableTicketsViewModel(this);
	}

	public void onCreate() {
		printAvailableTickets(viewModel.getAvailableFlightTickets());
	}
	private void printAvailableTickets(List<String> availableTickets){
		//for booking go to booking screen
	}
}
