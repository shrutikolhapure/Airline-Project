package AirlineReservationSystem;

public class Flight {
    private String flightID;
    private String origin;
    private String destination;
    private String departureTime;
    private int totalSeats;
    private int availableSeats;

  public Flight(String flightID, String origin, String destination, String departureTime, int totalSeats) {
        this.flightID = flightID;
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
        this.totalSeats = totalSeats;
        this.availableSeats = totalSeats;
    }

    public String getFlightID() {
        return flightID;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void bookTicket() {
        if (availableSeats > 0) {
            availableSeats--;
            System.out.println("Ticket successfully booked for flight: " + flightID);
        } else {
            System.out.println("Sorry, no available seats on this flight.");
        }
    }

    @Override
    public String toString() {
        return "Flight ID: " + flightID + ", From: " + origin + " To: " + destination + 
               ", Departure: " + departureTime + ", Available Seats: " + availableSeats;
    }
}

