public class Reservation {
    public String resID;
    public Flight flight;
    public Passenger passenger;

    public String confirm;

    public Reservation(String resID, Flight flight, Passenger passenger) {
        this.resID = resID;
        this.flight = flight;
        this.passenger = passenger;
    }

    ///////////////////reservationID
    public String getreservationID() {
        return this.resID;
    }

    ///////////////////which flight
    public Flight getflights() {
        return this.flight;
    }

    ///////////////////which passenger
    public Passenger getpassenger() {
        return this.passenger;
    }

    //////////////////////confirm cancel
    public void confirmReservation() {
        if (this.flight.getavailableSeats() <= 0) this.confirm = "No Seats";
        else {
            this.confirm = "Confirmed";
            this.flight.reduceNumberSeats();
        }
    }

    public void cancelReservation() {
        if (this.confirm == "No Seats") ;
        else if (this.confirm == "Confirmed") this.flight.addNumberSeats();
        this.confirm = "Canceled";
        this.passenger = null;
        this.flight = null;
        this.resID = null;
    }

    ///////////////////reservation status
    public String getreservationStatus() {
        return this.confirm;
    }

    public String toString() {
        return "Reservation details: " + this.resID + ", " + this.flight + ", " + this.passenger +
                ", " + this.confirm;
    }

    public static void main(String[] args) {
        Flight flight1 = new Flight("AI202", "New York", "2024-12-20 15:30", 1, 45.45);
        Flight flight2 = new Flight("AI303", "Los Angeles", "2024-12-20 18:00", 80, 45.45);
        Flight flight3 = new Flight("AI404", "Chicago", "2024-12-21 09:00", 60, 45.45);
        Flight flight4 = new Flight("AI505", "San Francisco", "2024-12-21 12:30", 70, 45.45);
        Flight flight5 = new Flight("AI606", "Boston", "2024-12-22 07:00", 55, 45.78);

        Passenger passenger1 = new Passenger("John", "Doe", 30, "P123456789");
        Passenger passenger2 = new Passenger("Jane", "Smith", 25, "P987654321");
        Passenger passenger3 = new Passenger("Michael", "Johnson", 40, "P112233445");
        Passenger passenger4 = new Passenger("Emily", "Davis", 28, "P223344556");
        Passenger passenger5 = new Passenger("Daniel", "Williams", 35, "P334455667");

        Reservation reservation1 = new Reservation("R001", flight1, passenger1);
        Reservation reservation2 = new Reservation("R002", flight1, passenger2);// not available
        Reservation reservation3 = new Reservation("R003", flight3, passenger3);
        Reservation reservation4 = new Reservation("R004", flight4, passenger4);
        Reservation reservation5 = new Reservation("R005", flight5, passenger5);

        System.out.println(passenger1.getfirstName());
        System.out.println(passenger1.getlastName());
        System.out.println(passenger1.getage());
        System.out.println(passenger1.getpassportNumber());
        System.out.println(passenger1.toString());
        ///
        System.out.println(flight1.getflightNumber());
        System.out.println(flight1.getdestination());
        System.out.println(flight1.getdepartureTime());
        System.out.println(flight1.getavailableSeats());
        System.out.println(flight1.getprice());
        ///
        System.out.println(reservation1.getreservationID());
        System.out.println(reservation1.getflights());
        System.out.println(reservation1.getpassenger());
        reservation1.confirmReservation();// after this you can check available and status
        System.out.println(reservation1.toString());
        System.out.println(reservation1.getreservationStatus());
        //
        System.out.println(flight1.isAvailable());
        //
        // reservation1.cancelReservation();// now it is canceled and is available for others
        // System.out.println(reservation1.getreservationStatus());
        // System.out.println(reservation1.getreservationID());// null
        // System.out.println(reservation1.getflights());// null
        // System.out.println(reservation1.getpassenger());// null
        // System.out.println(flight1.isAvailable());// true
        /////////////////////////
        reservation2.confirmReservation();
        System.out.println(reservation2.toString());
        System.out.println(reservation2.getreservationStatus());
        System.out.println(flight1.isAvailable());
        reservation2.cancelReservation();
        System.out.println(reservation2.toString());

    }
}
