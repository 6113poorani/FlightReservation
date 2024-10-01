package com.zsgs.flight.screens.login;

import com.zsgs.flight.screens.repository.RepositoryView;

class LoginViewModel {

	private LoginScreen view;

	public LoginViewModel(LoginScreen screen) {
		view = screen;
	}


	public void validateUser(String userName, String password) {
		RepositoryView repositoryView=RepositoryView.getInstance();
		if (repositoryView.isValid(userName,password)) {
			view.navigateMovieList();
		} else {
			view.showErroMessage("Invalid User name or Password");
		}
	}
}
