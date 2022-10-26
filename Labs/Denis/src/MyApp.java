import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.paint.*;
import javafx.scene.shape.*;

public class MyApp extends Application {
    public void start(Stage stage) {
        Circle circ = new Circle(40, 40, 30);
       // Group root = new Group(circ);
      //  Scene scene = new Scene(root, 400, 300);
       Group root = new Group();

       Scene s = new Scene(root, 300, 300, Color.BLACK);

         Rectangle r = new Rectangle(25,25,250,250);
         r.setFill(Color.BLUE);

         root.getChildren().add(r);


        stage.setTitle("My JavaFX RECT Application");
        stage.setScene(s);
        stage.show();
    }
}