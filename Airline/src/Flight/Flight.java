package Flight;

public abstract class Flight {  //abstartction
    private String flightNumber;
    private String source;
    private String destination;
    private String date;
    private String time;

    //Encapsulation
    public Flight(String flightNumber, String source, String destination, String date, String time) {
        this.flightNumber = flightNumber;
        this.source = source;
        this.destination = destination;
        this.date = date;
        this.time = time;
    }

    // Getters
    public String getFlightNumber() {
        return flightNumber;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    // Setters
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }

    // Add any other methods as per your requirements

    // Abstract method to be implemented by subclasses
    public abstract void printFlightDetails();
}
