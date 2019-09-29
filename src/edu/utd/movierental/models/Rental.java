package edu.utd.movierental.models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public abstract class Rental {
    private Movie movie;
    private int daysRented;
    private int rentalPoints = 0;
    
    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }
    
    public int getDaysRented() {
        return daysRented;
    }
    
    public Movie getMovie() {
        return movie;
    }

    public abstract  double computeRentalPrice();

    public int getRentalPoints() {
        return rentalPoints + 1;
    }
}