package com.company.Task6;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        CinemaSeansInfo [] filmsArray = new CinemaSeansInfo[3];
        filmsArray[0] = new CinemaSeansInfo("AllEyesOnMe", 11);
        filmsArray[1] = new CinemaSeansInfo("Cry", 12);
        filmsArray[2] = new CinemaSeansInfo("EMINEM", 13);
        Cinema redStar = new Cinema("Red Star", "pr.Kleckova" ,filmsArray);
        Cinema oktyabr = new Cinema("Oktyabr'", "pr.Eckova" ,filmsArray);
        Cinema vostok = new Cinema("Vostok", "pr.Kova" ,filmsArray);
        redStar.infoAbout.displayCinema();
        oktyabr.infoAbout.displayCinema();
        vostok.infoAbout.displayCinema();

        //if u want to input by urself
       /* Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of cinemas: ");
        int numOfCinemas = Integer.parseInt(scan.nextLine());

        Cinema arrayOfCinemas[] = new Cinema[numOfCinemas];

        for (int i = 0; i < arrayOfCinemas.length; i++) {
            System.out.print("Enter cinema name: ");
            String cinemaName = scan.nextLine();
            System.out.print("Enter cinema address: ");
            String cinemaAddress = scan.nextLine();
            System.out.print("Enter number of films: ");
            int numOfFilms = Integer.parseInt(scan.nextLine());
            CinemaSeansInfo arrayOfCinemasInfo[] = new CinemaSeansInfo[numOfFilms];
            for (int k = 0; k < arrayOfCinemasInfo.length; k++) {
                System.out.print("Enter Film Title: ");
                String cinemaFilm = scan.nextLine();
                System.out.print("Enter Film Time: ");
                int cinemaFilmTime = scan.nextInt();
                arrayOfCinemasInfo[i] = new CinemaSeansInfo(cinemaFilm, cinemaFilmTime);
            }
            arrayOfCinemas[i] = new Cinema(cinemaName, cinemaAddress, arrayOfCinemasInfo);
            arrayOfCinemas[i].infoAbout.displayCinema();
        }*/

    }
}
