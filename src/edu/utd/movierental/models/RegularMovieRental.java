package edu.utd.movierental.models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class RegularMovieRental extends Rental{

    public static final double PER_DIEM_PRICE = 1.5;
    public static final int DAYS_LIMIT = 2;
    public  static  final double BASE_RENTAL_PRICE = 2;

    public RegularMovieRental(Movie movie, int daysRented) {
       super(movie, daysRented);
    }

    public double computeRentalPrice() {
        double rentalPrice = 0;
        rentalPrice += this.BASE_RENTAL_PRICE;
        if (this.getDaysRented() > this.DAYS_LIMIT) {
            rentalPrice += (this.getDaysRented() - this.DAYS_LIMIT) * this.PER_DIEM_PRICE;
        }
        return rentalPrice;
    }
}