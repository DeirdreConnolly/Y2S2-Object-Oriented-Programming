package sample;

import java.util.ArrayList;

public class ClassGroup {

    Main mn;

    // Attributes
    private String classGroup;
    private ArrayList<ClassGroup> studentArrayList = new ArrayList<ClassGroup>();


    // Constructor
    public ClassGroup() {
    }

    public ClassGroup(Main mn) {
        this.mn = mn;
    }


    // Getters and Setters
    public Main getMn() {
        return mn;
    }

    public void setMn(Main mn) {
        this.mn = mn;
    }

    public String getClassGroup() {
        return classGroup;
    }

    public void setClassGroup(String classGroup) {
        this.classGroup = classGroup;
    }

    public ArrayList<ClassGroup> getStudentArrayList() {
        return studentArrayList;
    }

    public void setStudentArrayList(ArrayList<ClassGroup> studentArrayList) {
        this.studentArrayList = studentArrayList;
    }


    // Methods
    public void addStudents(){}


    public void removeStudents(){}

    @Override
    public String toString() {
        return "ClassGroup{" +
                "mn=" + mn +
                ", classGroup='" + classGroup + '\'' +
                ", studentArrayList=" + studentArrayList +
                '}';
    }
}
