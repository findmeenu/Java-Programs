package se.hkr.flights1;

public class Seat {
    private int businessRows;
    private int economyRows;
    private double seatColumn;
    private double economySeatPrice;
    private double discount;
    private String [][] seatChart;
    private String [][] bookedSeatChart;


    public int getBusinessRows() {
        return businessRows;
    }

    public int getEconomyRows() {
        return economyRows;
    }

    public double getSeatColumn() {
        return seatColumn;
    }

    public double getEconomySeatPrice() {
        return economySeatPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public String[][] getSeatChart() {
        return seatChart;
    }

    public String[][] getBookedSeatChart() {
        return bookedSeatChart;
    }

    public void populateSeatingChart (int businessRows, int economyRows, int seatColumn){}


}


