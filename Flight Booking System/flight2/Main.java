package se.hkr.flights2;
import java.time.ZonedDateTime;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FlightService flightService = new FlightService();
        flightService.loadFlightsDetails();
        System.out.println(flightService.getflightList().size());
        boolean displayflag = true;
        while (displayflag) {

            System.out.printf("1. Add Flight %n2. Add Passenger %n3. Book a Flight %n4. Search Flights %n5. View Bookings %n6. Save and Exit %n");
            System.out.print("Choose an option: ");
            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1 -> {
                    try {
                        System.out.printf("Enter Flight Number: ");
                        String flightNo = scanner.nextLine();
                        System.out.print("Enter Departure City: ");
                        String departureCit = scanner.nextLine();
                        System.out.print("Enter Destination City: ");
                        String destinationCit = scanner.nextLine();
                        System.out.print("Enter Departure Time (yyyy-MM-dd HH:mm +/-HH:mm): ");
                        ZonedDateTime departureTime = flightService.departureTimeParse(scanner.nextLine());
                        System.out.print("Enter Arrival Time (yyyy-MM-dd HH:mm +/-HH:mm): ");
                        ZonedDateTime arrivalTime = flightService.arrivalTimeParse(scanner.nextLine());
                        Flight a = new Flight(flightNo, departureCit, destinationCit, departureTime, arrivalTime);
                        System.out.println(flightService.addFlight(flightNo, a));

                    } catch (se.hkr.flights2.FlightBookingException ex) {
                        System.out.println(ex.getMessage());
                    }
                }
                case 4 ->
                {
                System.out.print("Enter Departure City (leave blank for any): ");
                String departure = scanner.nextLine();
                System.out.print("Enter Destination City (leave blank for any): ");
                String destination = scanner.nextLine();
                ArrayList<Flight> matchingFlights = flightService.searchedFlight(departure, destination);
                System.out.println(matchingFlights.size());
                if (!matchingFlights.isEmpty()) {
                    System.out.println("Found Flights");
                    for (Flight fly : matchingFlights) {
                        System.out.printf("Flight Number: %s%nDeparture City: %s%nDestination City: %s%nDeparture Time %s%nArrival Time: %s",
                                fly.getFlightNo(), fly.getDepartureCity(), fly.getDestinationCity(), fly.getDeparture(), fly.getArrival());
                        System.out.println();
                    }
                }
                else
                {
                    System.out.println("No Flights found for matching criteria ");
                    }

                }

                case 6 -> {
                    Boolean a = flightService.saveAddedFlights();
                    if (a == true){
                        System.out.println("Flights successfully added in file.");
                    }
                    else {
                        System.out.println("Flight not saved in file");
                    }
                    displayflag = false;
                }
                default -> {
                    displayflag = false;
                }
            }
        }
    }}


