// package airreservationsystem;

public class Flight {
    private String flightNumber;
    private String destin;
    private String depTime;
    private int availSeats;
    private double priceofSeat;

    public Reservation reservation;

    public Flight(String flightNumber, String destin, String depTime, int availSeats,
                  double priceofSeat) {
        this.flightNumber = flightNumber;
        this.destin = destin;
        this.depTime = depTime;
        this.availSeats = availSeats;
        this.priceofSeat = priceofSeat;
    }

    ////////////////////////////flight number
    public String getflightNumber() {
        return this.flightNumber;
    }
    ////////////////////////////destination

    public String getdestination() {
        return this.destin;
    }

    ////////////////////////////departure time
    public String getdepartureTime() {
        return this.depTime;
    }

    ////////////////////////////available seats
    public int getavailableSeats() {
        return this.availSeats;
    }

    ////////////////////////////price
    public double getprice() {
        return this.priceofSeat;
    }

    //////reduce seats
    public void reduceNumberSeats() {
        this.availSeats -= 1;
    }

    /////// add seats
    public void addNumberSeats() {
        this.availSeats += 1;
    }

    ///////////output
    public String toString() {
        return "Flight details: " + this.flightNumber + ", " + this.destin + ", " + this.depTime +
                ", " + this.availSeats + ", " + this.priceofSeat;
    }
    //////////

    public boolean isAvailable() {
        if (this.availSeats <= 0) return false;
        else return true;
    }

    public static void main(String[] args) {

    }
}
