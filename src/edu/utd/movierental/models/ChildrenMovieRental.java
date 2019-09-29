package edu.utd.movierental.models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ChildrenMovieRental extends Rental {

    public static final double PER_DIEM_PRICE = 1.5;
    public static final int DAYS_LIMIT = 3;
    public  static  final double DEFAULT_RENTAL_PRICE = 1.5;

    public ChildrenMovieRental(Movie movie, int daysRented) {
        super(movie, daysRented);
    }

    public double computeRentalPrice() {
        double rentalPrice = 0;
        rentalPrice += this.DEFAULT_RENTAL_PRICE;
        if (this.getDaysRented() > this.DAYS_LIMIT) {
            rentalPrice += (this.getDaysRented() - this.DAYS_LIMIT) * this.PER_DIEM_PRICE;
        }
        return rentalPrice;
    }
}