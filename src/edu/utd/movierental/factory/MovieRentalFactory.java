package edu.utd.movierental.factory;

import edu.utd.movierental.models.*;
import edu.utd.movierental.utils.RentalType;

public class MovieRentalFactory {
    public static Rental getMovieRental(Movie movie, int daysRented, RentalType rentalType){
        Rental rental = null;

        switch (rentalType) {
            case REGULAR_MOVIE_RENTAL:
                rental = new RegularMovieRental(movie, daysRented);
                break;
            case CHILDREN_MOVIE_RENTAL:
                rental = new ChildrenMovieRental(movie, daysRented);
                break;
            case NEW_MOVIE_RENTAL:
                rental = new NewMovieRental(movie, daysRented);
                break;
            default:
                rental = null;
                break;
        }
        return rental;
    }
}
