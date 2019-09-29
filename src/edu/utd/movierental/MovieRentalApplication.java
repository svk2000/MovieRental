package edu.utd.movierental;

import edu.utd.movierental.factory.MovieRentalFactory;
import edu.utd.movierental.models.*;
import edu.utd.movierental.models.*;
import edu.utd.movierental.utils.RentalType;

import javax.xml.bind.*;
import java.io.StringWriter;

public class MovieRentalApplication {

    public static void main(String[] args) throws JAXBException {
        Customer customer = new Customer("Vamsi Krishna Somepalli");
        customer.addRental(MovieRentalFactory.getMovieRental(new Movie("Toy Story"), 1, RentalType.CHILDREN_MOVIE_RENTAL));
        customer.addRental(MovieRentalFactory.getMovieRental(new Movie("Star Wars"), 2, RentalType.NEW_MOVIE_RENTAL));
        customer.addRental(MovieRentalFactory.getMovieRental(new Movie("Mission Impossible"), 4, RentalType.REGULAR_MOVIE_RENTAL));
        System.out.println(customer.getStatement().printStatementAsXML());
    }

}
