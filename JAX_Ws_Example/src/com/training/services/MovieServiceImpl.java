package com.training.services;

import com.training.beans.Director;
import com.training.ifaces.MovieService;

import javax.jws.WebService;

@WebService(endpointInterface = "com.training.ifaces.MovieService")
public class MovieServiceImpl implements MovieService {
    public MovieServiceImpl() {
    }

    @Override
    public double getRating(String movieName) {
        double rating = 3.2;

        if(movieName.equals("Dabbang3")){
            rating = 4.3;
        }
        return rating;
    }

    @Override
    public Director getTopDirector(String movieType) {

        Director topDirector = new Director("Bhansali",723812983,"Fort");


        if(movieType.equals("Bhojpuri")){

            topDirector = new Director("Rushiya",9211380,"Ghodbunder");

        }

        return topDirector;


    }
}
