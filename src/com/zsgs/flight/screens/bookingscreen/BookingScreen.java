package com.zsgs.flight.screens.bookingscreen;

import com.zsgs.flight.BaseScreen;

public class BookingScreen extends BaseScreen {
	private BookingScreenViewModel viewModel;

	public BookingScreen() {
		viewModel = new BookingScreenViewModel(this);
	}

	public void onCreate() {
			printTotalPayment(viewModel.getTotalPayment());
	}
	private void printTotalPayment(int totalpayment){

	}
}
