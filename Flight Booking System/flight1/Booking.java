package se.hkr.flights1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Booking {
    private String bookingId;
    private LocalDate bookingDate;
    private double bookingAmount;
    private ArrayList<Flight> flightDetails;
    private Passenger passengerDetails;


    public String getBookingId() {
        return bookingId;
    }

    public LocalDate getBookingDate() {
        return bookingDate;
    }

    public double getBookingAmount() {
        return bookingAmount;
    }

    public ArrayList<Flight> getFlightDetails() {
        return flightDetails;
    }

    public Passenger getPassengerDetails() {
        return passengerDetails;
    }
}
