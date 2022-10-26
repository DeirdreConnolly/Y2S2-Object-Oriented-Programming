package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    // Create instance of each class
    Car car = new Car(this);
    Controller control = new Controller(this);


    // Layout
    private GridPane grid = new GridPane();
    private Text sceneTitle = new Text("Car Details");
    private Label labelMake = new Label("Make:");
    private Label labelModel = new Label("Model:");
    private Label labelRegistrationNumber = new Label("Registration Number:");
    private Label labelMileage = new Label("Mileage (km):");
    private Label labelYearOfManufacture = new Label("Year of Manufacture:");
    private TextField tfMake = new TextField();
    private TextField tfModel = new TextField();
    private TextField tfRegistrationNumber = new TextField();
    private TextField tfMileage = new TextField();
    private TextField tfYearOfManufacture = new TextField();
    private Button btnSubmit = new Button("Submit");
    private Button btnCancel = new Button("Cancel");
    private HBox parentButtons = new HBox(10);



    // Getters and setters



    // Launch application
    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception{
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Stage window = primaryStage;
        window.setTitle("Cars");
//        window.setScene(new Scene(layout, 400, 400));
        Scene scene = new Scene(grid, 500, 300);


        // Layout/content
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        grid.setAlignment(Pos.TOP_LEFT);

        grid.add(sceneTitle, 0, 0, 2, 1);
        grid.add(labelMake, 0, 1);
        grid.add(tfMake, 1, 1);
        grid.add(labelModel, 0, 2);
        grid.add(tfModel, 1, 2);
        grid.add(labelMileage, 0, 3);
        grid.add(tfMileage, 1, 3);
        grid.add(labelRegistrationNumber, 0, 4);
        grid.add(tfRegistrationNumber, 1, 4);
        grid.add(labelYearOfManufacture, 0, 5);
        grid.add(tfYearOfManufacture, 1, 5);

        parentButtons.setAlignment(Pos.BOTTOM_CENTER);
        parentButtons.getChildren().addAll(btnSubmit, btnCancel);
        grid.add(parentButtons, 1, 7);




















        // Button functionality
        btnSubmit.setOnAction(e -> {
            control.onClickSubmit();
        });

        btnCancel.setOnAction(e -> {
            control.onClickCancel();
        });


        window.setScene(scene);
        window.show();

    }
}
