package com.zsgs.flight.screens.availableticket;

import com.zsgs.flight.screens.bookingscreen.BookingScreen;

import java.util.ArrayList;
import java.util.List;

class AvailableTicketsViewModel {
	
	private AvailableTicketsScreen view;

	public AvailableTicketsViewModel(AvailableTicketsScreen screen) {
		view = screen;
	}

    public List<String> getAvailableFlightTickets() {
		List<String > availableTickets=new ArrayList<>();
		return availableTickets;
    }
	public void onBookingSeats(){
		BookingScreen bookingScreen=new BookingScreen();
		bookingScreen.onCreate();
	}
}
