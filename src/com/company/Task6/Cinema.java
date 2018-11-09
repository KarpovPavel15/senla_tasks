package com.company.Task6;

class Cinema {
    private String name, address;
    InfoAbout infoAbout;

    Cinema( String name, String address, CinemaSeansInfo[] filmsArray ){
        this.name = name;
        this.address = address;
        infoAbout = new InfoAbout(filmsArray);
    }

    public class InfoAbout{
        private CinemaSeansInfo[] filmsArray;

        InfoAbout(CinemaSeansInfo[] filmArr){
            this.filmsArray = filmArr;
        }

        void displayCinema() {
            System.out.println("Cinema name: " + Cinema.this.name);
            System.out.println("Cinema address: " + Cinema.this.address);
            for (int i = 0; i < filmsArray.length; i++) {
                System.out.println(filmsArray[i].returnInfo());
            }
        }
    }
}
