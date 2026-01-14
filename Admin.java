package AirlineReservationSystem;
import java.util.List;

public class Admin extends User {

    public Admin(String username, String password) {
        super(username, password);
    }

    
    public void addFlight(Flight flight, List<Flight> flightList) {
        flightList.add(flight);
        System.out.println("New flight added: " + flight);
    }


    public void viewFlights(List<Flight> flightList) {
        System.out.println("Available flights:");
        for (Flight flight : flightList) {
            System.out.println(flight);
        }
    }
}

