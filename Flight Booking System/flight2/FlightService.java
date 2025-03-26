package se.hkr.flights2;

import java.io.*;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


public class FlightService
{
    ArrayList<Flight> flightList;
    public FlightService()
    {
        this.flightList = new ArrayList<>();
    }

    public String addFlight(String flightno, Flight b)
            throws se.hkr.flights2.FlightBookingException
    {
        try
        {
            for (Flight f : flightList)
            {
                if (flightno.equals(f.getFlightNo()))
                {
                    throw new se.hkr.flights2.FlightBookingException("Flight Already exists.");
                }
            }
            flightList.add(b);
            //saveAddedFlights();
            return "Flight added Sucessfully.";


        }
        catch (Exception ex)
        {
            return ex.getMessage();

        }
    }

        public Boolean saveAddedFlights() {
            try (ObjectOutputStream b = new ObjectOutputStream(new FileOutputStream("flights.ser", false))) {
                b.writeObject(flightList);
                return true;

            }
            catch (IOException e) {
                e.printStackTrace();
                return false;
            }
            catch (Exception e)
            {
                return false;

            }
        }

        public ZonedDateTime departureTimeParse (String dt)
    {
        ZonedDateTime departureTime = ZonedDateTime.parse(dt, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm XXX"));
        return departureTime;
    }

    public ZonedDateTime arrivalTimeParse (String dt)
    {
        ZonedDateTime arrivalTime = ZonedDateTime.parse(dt, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm XXX"));
        return arrivalTime;
    }
    public void loadFlightsDetails () {
            try (ObjectInputStream c = new ObjectInputStream(new FileInputStream("flights.ser"))) {
                flightList = (ArrayList<Flight>) c.readObject();

            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();

            }
        }



    public ArrayList<Flight> searchedFlight (String departure, String destination) {
        ArrayList<Flight> searchFlight = new ArrayList<>();

        if ("".equals(departure) && "".equals(destination)) {
            searchFlight.addAll(flightList);

        } else if ("".equals(departure) && !"".equals(destination)) {

            for (Flight fly : flightList) {
                if (destination.equalsIgnoreCase(fly.getDestinationCity())) {
                    searchFlight.add(fly);

                }
            }
        } else if (!"".equals(departure) && "".equals(destination)) {

            for (Flight fly : flightList) {
                if (departure.equalsIgnoreCase(fly.getDepartureCity())) {
                    searchFlight.add(fly);


                }
            }
        } else if (!"".equals(departure) && !"".equals(destination)) {

            for (Flight fly : flightList) {
                if (departure.equalsIgnoreCase(fly.getDepartureCity()) && destination.equalsIgnoreCase(fly.getDestinationCity())) {
                    searchFlight.add(fly);

                }
            }


        }
    return searchFlight;
    }

public ArrayList<Flight> getflightList(){return flightList;}
}








