package Flight;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FlightDAO {
    public void insertFlight(Flight flight) {
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "INSERT INTO flights (flight_number, source, destination, date, time) " +
                             "VALUES (?, ?, ?, ?, ?)")) {

            preparedStatement.setString(1, flight.getFlightNumber());
            preparedStatement.setString(2, flight.getSource());
            preparedStatement.setString(3, flight.getDestination());
            preparedStatement.setString(4, flight.getDate());
            preparedStatement.setString(5, flight.getTime());

            preparedStatement.executeUpdate();
            System.out.println("Flight added successfully!");

        } catch (SQLException e) {
            System.err.println("Error inserting flight: " + e.getMessage());
        }
    }

    // Implement other methods for CRUD operations (update, delete, etc.) if needed
}
