package Project;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox parent = new VBox();
        parent.getChildren().add(new Label("Guess a number to win a prize!"));

        HBox guessField = new HBox(new Label("Guess: "));

        TextField textField = new TextField();
        guessField.getChildren().add(textField);
        parent.getChildren().add(guessField);

        Button button = new Button("Play");
        button.setOnAction(event -> System.out.println("I would like to access " + textField.getText() + " here."));
        parent.getChildren().add(button);

//        Scene scene = new Scene(new Label("Foo"));
        primaryStage.setScene(new Scene(parent));
        primaryStage.show();
    }
}
