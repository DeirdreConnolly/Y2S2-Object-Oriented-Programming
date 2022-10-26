package sample;

import java.util.ArrayList;

public class Student extends Person {

    Main mn;

    // Attributes
    private int DOB;
    private ArrayList<ModuleGrade> moduleGradeArrayList = new ArrayList<ModuleGrade>();


    // Constructor
    public Student(int DOB, ArrayList<ModuleGrade> moduleGradeArrayList) {
        this.DOB = DOB;
        this.moduleGradeArrayList = moduleGradeArrayList;
    }

    public Student(String firstName, String middleName, String lastName, String email, String phone, int DOB, ArrayList<ModuleGrade> moduleGradeArrayList) {
        super(firstName, middleName, lastName, email, phone);
        this.DOB = DOB;
        this.moduleGradeArrayList = moduleGradeArrayList;
    }

    public Student(Main mn) {
        this.mn = mn;
    }


    // Getters and Setters
    public Main getMn() {
        return mn;
    }

    public void setMn(Main mn) {
        this.mn = mn;
    }

    public int getDOB() {
        return DOB;
    }

    public void setDOB(int DOB) {
        this.DOB = DOB;
    }

    public ArrayList<ModuleGrade> getModuleGradeArrayList() {
        return moduleGradeArrayList;
    }

    public void setModuleGradeArrayList(ArrayList<ModuleGrade> moduleGradeArrayList) {
        this.moduleGradeArrayList = moduleGradeArrayList;
    }


    // Methods
//    public void print() {
//        System.out.println("DOB: " + DOB);
//    }


    @Override
    public String toString() {
        return "Student{" +
                "mn=" + mn +
                ", DOB=" + DOB +
                ", moduleGradeArrayList=" + moduleGradeArrayList +
                '}';
    }
}
