package Flight;

public class DomesticFlight extends Flight { //inheritance
    private String airline;

    public DomesticFlight(String flightNumber, String source, String destination, String date, String time, String airline) {
        super(flightNumber, source, destination, date, time);
        this.airline = airline;
    }

    // Getters and Setters specific to DomesticFlight
    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    // Override printFlightDetails method to print specific details for DomesticFlight
    
    @Override
    public void printFlightDetails() {
        System.out.println("Domestic Flight Details:");
        System.out.println("Flight Number: " + getFlightNumber());
        System.out.println("Source: " + getSource());
        System.out.println("Destination: " + getDestination());
        System.out.println("Date: " + getDate());
        System.out.println("Time: " + getTime());
        System.out.println("Airline: " + airline);
        System.out.println();
    }
}

