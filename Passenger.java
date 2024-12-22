// package airreservationsystem;

public class Passenger {
    public String firstName;
    public String lastName;
    public int age;
    public String passportNumber;

    public Passenger(String firstName, String lastName, int age, String passportNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.passportNumber = passportNumber;
    }

    //////////////////////////firstName
    public String getfirstName() {
        return this.firstName;
    }

    //////////////////////////lastName
    public String getlastName() {
        return this.lastName;
    }

    //////////////////////////age
    public int getage() {
        return this.age;
    }

    //////////////////////////passportNumber
    public String getpassportNumber() {
        return this.passportNumber;
    }

    ///////////output
    public String toString() {
        return "Passenger details: " + this.firstName + ", " + this.lastName + ", " +
                this.age + ", " + this.passportNumber;
    }

    public static void main(String[] args) {

    }
}
