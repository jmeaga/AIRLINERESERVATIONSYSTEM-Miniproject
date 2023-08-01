package Flight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FlightReservationSystem {
    private List<Flight> flights;
    private FlightDAO flightDAO;

    public FlightReservationSystem() {
        flights = new ArrayList<>();
        flightDAO = new FlightDAO();
        loadFlightsFromDatabase(); // Load flights from the database (optional)
    }

    private void loadFlightsFromDatabase() {
        // Implement code to load flights from the database using the FlightDAO class (if needed)
    }

    public void addFlight(Flight flight) {
        flights.add(flight);
        flightDAO.insertFlight(flight); // Insert flight into the database
    }

    public void viewFlights() {
        for (Flight flight : flights) {
            flight.printFlightDetails(); // Use polymorphism to call the appropriate subclass method
        }
    }

    // Implement other methods like bookTicket, viewBookedTickets, etc.

    public static void main(String[] args) {
        FlightReservationSystem reservationSystem = new FlightReservationSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Flight Reservation System");
            System.out.println("1. Add Domestic Flight");
            System.out.println("2. View Flights");
            // Add more options for booking tickets, viewing booked tickets, etc.
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter Flight Number: ");
                    String flightNumber = scanner.nextLine();
                    System.out.print("Enter Source: ");
                    String source = scanner.nextLine();
                    System.out.print("Enter Destination: ");
                    String destination = scanner.nextLine();
                    System.out.print("Enter Date: ");
                    String date = scanner.nextLine();
                    System.out.print("Enter Time: ");
                    String time = scanner.nextLine();
                    System.out.print("Enter Airline: ");
                    String airline = scanner.nextLine();

                    DomesticFlight newFlight = new DomesticFlight(flightNumber, source, destination, date, time, airline);
                    reservationSystem.addFlight(newFlight);
                    break;
                case 2:
                    reservationSystem.viewFlights();
                    break;
                // Implement cases for booking tickets, viewing booked tickets, etc.
                case 0:
                    System.out.println("Thank you for using the Flight Reservation System. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
