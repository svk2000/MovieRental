package edu.utd.movierental.models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NewMovieRental extends Rental {

    public static final double PER_DIEM_PRICE = 3;

    public NewMovieRental(Movie movie, int daysRented) {
        super(movie, daysRented);
    }

    public double computeRentalPrice() {
        double rentalPrice = 0;
        rentalPrice += this.getDaysRented() * PER_DIEM_PRICE;
        return rentalPrice;
    }

    @Override
    public int getRentalPoints() {
        if(this.getDaysRented() > 1) {
            return super.getRentalPoints() + 1;
        }
        return super.getRentalPoints();
    }
}