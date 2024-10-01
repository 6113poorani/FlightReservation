package com.zsgs.flight.screens.repository;


public class RepositoryView {
    private static RepositoryView repositoryView;
    private RepositoryView(){

    }
    public static RepositoryView getInstance(){
        if(repositoryView==null){
            return repositoryView=new RepositoryView();
        }
        return repositoryView;
    }


    public boolean isValid(String userName, String password) {
        if(userName.equals("ZSGS")&&password.equals("Admin")){
            return true;
        }
        return false;
    }
}
