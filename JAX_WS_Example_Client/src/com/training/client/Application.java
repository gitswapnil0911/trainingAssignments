package com.training.client;

public class Application {
    public static void main(String[] args) {

        MovieServiceImplService service = new MovieServiceImplService();

        MovieService proxy = service.getMovieServiceImplPort();

                double value = proxy.getRating("Dabbang3");

        System.out.println("Rating "+value);

    }
}
