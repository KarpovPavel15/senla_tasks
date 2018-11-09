package com.company.Task6;

class CinemaSeansInfo{
    private String film;
    private int strDate;

    CinemaSeansInfo( String film, int strDate ){
        this.film = film;
        this.strDate = strDate;
    }

    public String returnInfo() {
        return "Film title: " + film +" || "+ "Session date: " + strDate;
    }
}