package sample;

public class Name {

    Main mn;

    // Attributes
    private String firstName;
    private String middleName;
    private String lastName;


    // Constructor
    public Name() {
    }

    public Name(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public Name(Main mn) {
        this.mn = mn;
    }


    // Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    // Methods
//    public void print() {
//        System.out.println("Name: " + firstName + "\t" + middleName + "\t" + lastName + "\t");
//    }
}

