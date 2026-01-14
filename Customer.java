package AirlineReservationSystem;
import java.util.List;

public class Customer extends User {

    public Customer(String username, String password) {
        super(username, password);
    }

   
    public void viewAvailableFlights(List<Flight> flightList) {
        System.out.println("Available flights:");
        for (Flight flight : flightList) {
            if (flight.getAvailableSeats() > 0) {
                System.out.println(flight);
            }
        }
    }

    public void bookFlight(Flight flight) {
        flight.bookTicket();
    }
}
