package se.hkr.flights1;

import java.util.ArrayList;
import java.util.Map;

public class FlightServices {
    private  Map<Flight, Seat> flightSchedule;
    private ArrayList<Passenger> passenger;
    private ArrayList<Booking> bookingRef;
    private double totalAmount;

    public Map<Flight, Seat> getFlightSchedule() {
        return flightSchedule;
    }

    public ArrayList<Passenger> getPassenger() {
        return passenger;
    }

    public ArrayList<Booking> getBookingRef() {
        return bookingRef;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void searchFlight(Flight departure , Flight destination, Flight date, Class BUSINESS, Seat price) {}
public Booking bookFlight (Flight flighnumber, Seat seatNo) {return null;}
public void cancelBooking (Booking bookingID) {}

public void viewBookingHistory(Passenger passengerID) {}
public  void addFlight() {}

public void removeFlight (Flight flightNo) {}

public void addBookingHistory (Booking bookingRef){}
}
