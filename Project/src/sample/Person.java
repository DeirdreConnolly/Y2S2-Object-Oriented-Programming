package sample;

public class Person extends Name {

    Main mn;

    // Attributes
    private String email;
    private String phone;


    // Constructor
    public Person() {
    }

    public Person(Main mn, String email, String phone) {
        this.mn = mn;
        this.email = email;
        this.phone = phone;
    }

    public Person(String firstName, String middleName, String lastName, String email, String phone) {
        super(firstName, middleName, lastName);
        this.email = email;
        this.phone = phone;
    }

    public Person(Main mn) {
        this.mn = mn;
    }


    // Getters and Setters
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String firstName) {
//        this.name = firstName;
//    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    // Methods
//    public void print() {
//        System.out.println("Email: " + email + "\n" + "Phone: " + phone);
//    }


    @Override
    public String toString() {
        return "Person{" +
                "mn=" + mn +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
