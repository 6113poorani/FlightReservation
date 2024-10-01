package com.zsgs.flight.screens.login;

import com.zsgs.flight.BaseScreen;
import com.zsgs.flight.screens.flightList.FlightListScreen;

import java.util.Scanner;

public class LoginScreen extends BaseScreen {
	private LoginViewModel viewModel;

	public LoginScreen() {
		viewModel = new LoginViewModel(this);
	}

	public void onCreate() {
		if (hasNetworkConnection()) {
			System.out.println("Welcome to flight ticket booking application");
			
			System.out.println("\n\nPlease login to proceed.");
			Scanner scanner = new Scanner(System.in);
			System.out.println("\nEnter the user name:");
			String userName = scanner.next();
			System.out.println("Enter the password:");
			String password = scanner.next();
			
			viewModel.validateUser(userName, password);
		} else {
			System.out.println("Please check internet connection");
		}
	}

	public void navigateMovieList() {
		FlightListScreen flightListScreen = new FlightListScreen();
		flightListScreen.onCreate();
	}
	
	public void showErroMessage(String message) {
		System.out.println(message);
	}
}
