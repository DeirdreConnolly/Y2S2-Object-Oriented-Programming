//   The basics. Get FX to display something. Cntr shift o
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
public class Main extends Application {
   Stage window;
   Button button;
public static void main(String[] args) {
    launch(args);
}
@Override
public void start(Stage primaryStage) throws Exception {
    window = primaryStage;
    window.setTitle("OOP2 - JavaFX");
    button = new Button("Click me");
    StackPane layout = new StackPane();
    layout.getChildren().add(button);
    Scene scene = new Scene(layout, 300, 250);
    window.setScene(scene);
    window.show();}}
