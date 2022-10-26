package sample;

public class Teacher extends Person {

    Main mn;

    // Attributes
    private String degree;


    // Constructor
    public Teacher(String degree) {
        this.degree = degree;
    }

    public Teacher(String firstName, String middleName, String lastName, String email, String phone, String degree) {
        super(firstName, middleName, lastName, email, phone);
        this.degree = degree;
    }

    public Teacher(Main mn) {
        this.mn = mn;
    }


    // Getters and Setters
    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }


    // Methods
//    public void print() {
//        System.out.println("Degree: " + degree);
//    }


    @Override
    public String toString() {
        return "Teacher{" +
                "mn=" + mn +
                ", degree='" + degree + '\'' +
                '}';
    }
}