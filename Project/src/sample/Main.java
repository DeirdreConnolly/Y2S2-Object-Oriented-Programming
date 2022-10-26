package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import static javafx.fxml.FXMLLoader.load;

public class Main extends Application {

    // Create instance of each class
    Name Name = new Name(this);
    Person Person = new Person(this);
    Teacher Teacher = new Teacher(this);
    Student Student = new Student(this);
    School School = new School(this);
    ClassGroup ClassGroup = new ClassGroup(this);
    ModuleGrade ModuleGrade = new ModuleGrade(this);
    Test Test = new Test(this);
    Controller Controller = new Controller(this);
//    GUI GUI = new GUI(this);


    // Create Tabs
    private Tab tab1 = new Tab("System");
    private TabPane layout = new TabPane();


    // Layout
    private VBox vbox1 = new VBox(20);
    private HBox hbox1 = new HBox(20);
    private HBox hbox2 = new HBox(20);
    private HBox hbox3 = new HBox(20);
    private HBox hbox4 = new HBox(20);


    // Buttons
    private Button btnAddClassGroup = new Button("Add class group");
    private Button btnRemoveClassGroup = new Button("Remove class group");
    private Button btnAddStudent = new Button("Add student");
    private Button btnRemoveStudent = new Button("Remove student");
    private Button btnEditModules = new Button("Edit modules");
    private Button btnEnterMarks = new Button("Enter marks");
    private Button btnListStudents = new Button("List all students");
    private Button btnListTeachers = new Button("List all teachers");
    private Button btnExit = new Button("Exit");


    // Getters and Setters
    public sample.Name getName() {
        return Name;
    }

    public void setName(sample.Name name) {
        Name = name;
    }

    public sample.Person getPerson() {
        return Person;
    }

    public void setPerson(sample.Person person) {
        Person = person;
    }

    public sample.Teacher getTeacher() {
        return Teacher;
    }

    public void setTeacher(sample.Teacher teacher) {
        Teacher = teacher;
    }

    public sample.Student getStudent() {
        return Student;
    }

    public void setStudent(sample.Student student) {
        Student = student;
    }

    public sample.School getSchool() {
        return School;
    }

    public void setSchool(sample.School school) {
        School = school;
    }

    public sample.ClassGroup getClassGroup() {
        return ClassGroup;
    }

    public void setClassGroup(sample.ClassGroup classGroup) {
        ClassGroup = classGroup;
    }

    public sample.ModuleGrade getModuleGrade() {
        return ModuleGrade;
    }

    public void setModuleGrade(sample.ModuleGrade moduleGrade) {
        ModuleGrade = moduleGrade;
    }

    public sample.Test getTest() {
        return Test;
    }

    public void setTest(sample.Test test) {
        Test = test;
    }

    public sample.Controller getController() {
        return Controller;
    }

    public void setController(sample.Controller controller) {
        Controller = controller;
    }

    public Tab getTab1() {
        return tab1;
    }

    public void setTab1(Tab tab1) {
        this.tab1 = tab1;
    }

    public TabPane getLayout() {
        return layout;
    }

    public void setLayout(TabPane layout) {
        this.layout = layout;
    }

    public VBox getVbox1() {
        return vbox1;
    }

    public void setVbox(VBox vbox1) {
        this.vbox1 = vbox1;
    }

    public HBox getHbox1() {
        return hbox1;
    }

    public void setHbox(HBox hbox1) {
        this.hbox1 = hbox1;
    }

    public Button getBtnAddClassGroup() {
        return btnAddClassGroup;
    }

    public void setBtnAddClassGroup(Button btnAddClassGroup) {
        this.btnAddClassGroup = btnAddClassGroup;
    }

    public Button getBtnRemoveClassGroup() {
        return btnRemoveClassGroup;
    }

    public void setBtnRemoveClassGroup(Button btnRemoveClassGroup) {
        this.btnRemoveClassGroup = btnRemoveClassGroup;
    }

    public Button getBtnAddStudent() {
        return btnAddStudent;
    }

    public void setBtnAddStudent(Button btnAddStudent) {
        this.btnAddStudent = btnAddStudent;
    }

    public Button getBtnRemoveStudent() {
        return btnRemoveStudent;
    }

    public void setBtnRemoveStudent(Button btnRemoveStudent) {
        this.btnRemoveStudent = btnRemoveStudent;
    }

    public Button getBtnEdit() {
        return btnEditModules;
    }

    public void setBtnEdit(Button btnEditModules) {
        this.btnEditModules = btnEditModules;
    }

    public Button getBtnEnter() {
        return btnEnterMarks;
    }

    public void setBtnEnter(Button btnEnterMarks) {
        this.btnEnterMarks = btnEnterMarks;
    }

    public Button getBtnList() {
        return btnListStudents;
    }

    public void setBtnList(Button btnListStudents) {
        this.btnListStudents = btnListStudents;
    }

    public Button getBtnExit() {
        return btnExit;
    }

    public void setBtnExit(Button btnExit) {
        this.btnExit = btnExit;
    }


    // Launch application
    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Stage window = primaryStage;
        window.setTitle("Pupil Management System");
        //window.setScene(new Scene(layout, 400, 400));
        Scene scene = new Scene(layout, 900, 400);


        // -- TAB 01 -- //

        // Buttons
        hbox1.getChildren().addAll(btnAddClassGroup, btnRemoveClassGroup);
        hbox2.getChildren().addAll(btnAddStudent, btnRemoveStudent);
        hbox3.getChildren().addAll(btnEditModules, btnEnterMarks);
        hbox4.getChildren().addAll(btnListStudents, btnListTeachers);
        vbox1.getChildren().addAll(hbox1, hbox2, hbox3, hbox4);


        // Alignment
        tab1.setContent(vbox1);
        hbox1.setAlignment(Pos.CENTER);
        hbox2.setAlignment(Pos.CENTER);
        hbox3.setAlignment(Pos.CENTER);
        hbox4.setAlignment(Pos.CENTER);
        vbox1.setAlignment(Pos.CENTER);


        // Button Functionality
        btnAddClassGroup.setOnAction(e -> {

        });

        btnRemoveClassGroup.setOnAction(e -> {

        });

        btnAddStudent.setOnAction(e -> {

        });

        btnRemoveStudent.setOnAction(e -> {

        });

        btnEditModules.setOnAction(e -> {

        });

        btnEnterMarks.setOnAction(e -> {

        });

        btnListStudents.setOnAction(e -> {

        });

        btnListTeachers.setOnAction(e -> {

        });


        btnExit.setOnAction(e -> window.close());


        layout.getTabs().addAll(tab1);
        window.setScene(scene);
        window.show();


    }


//    public static void main(String[] args) {
//        launch(args);
//    }
}
