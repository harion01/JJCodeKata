package kata;

public class Day12Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Day12Person(String info) {
        String[] split = info.split(" ");
        this.firstName = split[0];
        this.lastName = split[1];
        this.idNumber = Integer.parseInt(split[2]);
    }

    // Print person data
    public String makeName() {
        return "Name: " + lastName + ", " + firstName;
    }

    public String makeID(){
        return "ID: " + idNumber;
    }

}
