package se.hkr.flights2;
import java.io.Serializable;
import java.time.ZonedDateTime;

public class Flight implements Serializable
{

    private String flightNo;
    private String departureCity;
    private String destinationCity;
    private ZonedDateTime departureDateTime ;
    private ZonedDateTime arrivalDateTime;

    public Flight(String flightNo, String departureCity, String destinationCity, ZonedDateTime departure, ZonedDateTime arrival) {
        this.flightNo = flightNo;
        this.departureCity = departureCity;
        this.destinationCity = destinationCity;
        this.departureDateTime = departure;
        this.arrivalDateTime = arrival;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public ZonedDateTime getDeparture() {
        return departureDateTime;
    }

    public ZonedDateTime getArrival() {
        return arrivalDateTime;
    }
}
