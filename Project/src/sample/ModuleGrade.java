package sample;

public class ModuleGrade {

    Main mn;

    // Attributes
    private String module;
    private int grade;


    // Constructor
    public ModuleGrade(String module, int grade) {
        this.module = module;
        this.grade = grade;
    }

    public ModuleGrade(Main mn) {
        this.mn = mn;
    }


    // Getters and Setters
    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }




    // Methods
//    public void print() {
//        System.out.println("Module: " + module + "\n" + "Grade: " + grade);
//    }

    @Override
    public String toString() {
        return "ModuleGrade{" +
                "mn=" + mn +
                ", module='" + module + '\'' +
                ", grade=" + grade +
                '}';
    }
}