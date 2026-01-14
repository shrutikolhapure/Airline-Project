package AirlineReservationSystem;
import java.util.*;

public class AirlineManagement  {
    private static List<Flight> flightList = new ArrayList<>();
    private static List<User> userList = new ArrayList<>();

    public static void main(String[] args) {
       
        Admin admin = new Admin("admin", "Admin@123");
       

        userList.add(admin);
    
        Scanner sc = new Scanner(System.in);

   
        System.out.println("Enter username: ");
        String username = sc.nextLine();
        System.out.println("Enter password: ");
        String password = sc.nextLine();

        User loggedInUser = null;
        for (User user : userList) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                loggedInUser = user;
                break;
            }
        }

        if (loggedInUser == null) {
            System.out.println("Invalid credentials!");
            return;
        }

        if (loggedInUser instanceof Admin) {
            adminMenu(sc, (Admin) loggedInUser);
        } else if (loggedInUser instanceof Customer) {
            customerMenu(sc, (Customer) loggedInUser);
        }
    }


    private static void adminMenu(Scanner sc, Admin admin) {
        int choice;
        do {
            System.out.println("\nAdmin Menu:");
            System.out.println("1. Add Flight");
            System.out.println("2. View Flights");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter Flight ID: ");
                    String flightID = sc.nextLine();
                    System.out.print("Enter Origin: ");
                    String origin = sc.nextLine();
                    System.out.print("Enter Destination: ");
                    String destination = sc.nextLine();
                    System.out.print("Enter Departure Time: ");
                    String departureTime = sc.nextLine();
                    System.out.print("Enter Total Seats: ");
                    int totalSeats = sc.nextInt();
                    Flight newFlight = new Flight(flightID, origin, destination, departureTime, totalSeats);
                    admin.addFlight(newFlight, flightList);
                    break;
                case 2:
                    admin.viewFlights(flightList);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 3);
    }

    
    private static void customerMenu(Scanner sc, Customer customer) {
        int choice;
        do {
            System.out.println("\nCustomer Menu:");
            System.out.println("1. View Available Flights");
            System.out.println("2. Book Flight");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    customer.viewAvailableFlights(flightList);
                    break;
                case 2:
                    System.out.print("Enter Flight ID to book: ");
                    String flightID = sc.nextLine();
                    Flight selectedFlight = null;
                    for (Flight flight : flightList) {
                        if (flight.getFlightID().equals(flightID)) {
                            selectedFlight = flight;
                            break;
                        }
                    }
                    if (selectedFlight != null) {
                        customer.bookFlight(selectedFlight);
                    } else {
                        System.out.println("Flight not found.");
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 3);
    }
}

