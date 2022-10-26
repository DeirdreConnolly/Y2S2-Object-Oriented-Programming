package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.StackPane;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import org.w3c.dom.Text;
import org.w3c.dom.events.Event;

import java.util.Hashtable;

public class Main extends Application {

    private int starCount = 0;
    private int value = 0;

//    public static void main(String[] args) {
//        launch(args);
//    }

    // Create instance of each game class
    GuessingGame g = new GuessingGame(this);
    Lottery l = new Lottery(this);
    Controller p = new Controller(this);


    // Create tabs
    private Tab tab1 = new Tab("Guessing Game");
    private Tab tab2 = new Tab("Lotto Cure");
    private Tab tab3 = new Tab("Prize Selection");
    private TabPane layout = new TabPane();


    // -- GUESSING GAME -- //

    // Layout
    private VBox parentGuess = new VBox(20);
    private Label labelGuess = new Label("Guess a number 1-50 to win a prize!");
    private Label triesGuess = new Label(g.getGuess() + "/4 tries");
    private TextField guess = new TextField();
    private HBox buttonsGuess = new HBox(20);
    private Button btnPlayGuess = new Button("Play");
    private Button btnResetGuess = new Button("Reset");
    private Button btnExit = new Button("Exit");


    // -- LOTTERY -- //

    // Layout
    private VBox parentLotto = new VBox(10);
    private Label labelLotto = new Label("Enter lotto numbers:");
    private TextField lotto1 = new TextField();
    private TextField lotto2 = new TextField();
    private TextField lotto3 = new TextField();
    private TextField lotto4 = new TextField();
    private TextField lotto5 = new TextField();
//    private static TextField[] lotto;
//    private static int numLotto = 5;
    private HBox buttonsLotto = new HBox(20);
    private Button btnPlayLotto = new Button("Play");
    private Button btnResetLotto = new Button("Reset");


    // -- PRIZE SELECTION -- //

    // Layout
    private VBox parentPrize = new VBox(10);
    private Button btnSelectPrize = new Button("Select");


//    private ListView prizeList = new ListView();
//    private ListView<String> prizeList = new ListView<>();
//    prizeList.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
//    String result = prizeList.getSelectionModel().getSelectedItem().toString();



    // Hash table stuff
    private ListView<String> prizeList = new ListView<>();
    private Hashtable<String, String> hash = new Hashtable<String, String>();



    // Getters and setters
    public int getStarCount() {
        return starCount;
    }

    public void setStarCount(int starCount) {
        this.starCount = starCount;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public GuessingGame getG() {
        return g;
    }

    public void setG(GuessingGame g) {
        this.g = g;
    }

    public Lottery getL() {
        return l;
    }

    public void setL(Lottery l) {
        this.l = l;
    }

    public Controller getP() {
        return p;
    }

    public void setP(Controller p) {
        this.p = p;
    }

    public Tab getTab1() {
        return tab1;
    }

    public void setTab1(Tab tab1) {
        this.tab1 = tab1;
    }

    public Tab getTab2() {
        return tab2;
    }

    public void setTab2(Tab tab2) {
        this.tab2 = tab2;
    }

    public Tab getTab3() {
        return tab3;
    }

    public void setTab3(Tab tab3) {
        this.tab3 = tab3;
    }

    public TabPane getLayout() {
        return layout;
    }

    public void setLayout(TabPane layout) {
        this.layout = layout;
    }

    public VBox getParentGuess() {
        return parentGuess;
    }

    public void setParentGuess(VBox parentGuess) {
        this.parentGuess = parentGuess;
    }

    public Label getLabelGuess() {
        return labelGuess;
    }

    public void setLabelGuess(Label labelGuess) {
        this.labelGuess = labelGuess;
    }

    public TextField getGuess() {
        return guess;
    }

    public void setGuess(TextField guess) {
        this.guess = guess;
    }

    public HBox getButtonsGuess() {
        return buttonsGuess;
    }

    public void setButtonsGuess(HBox buttonsGuess) {
        this.buttonsGuess = buttonsGuess;
    }

    public Button getBtnPlayGuess() {
        return btnPlayGuess;
    }

    public void setBtnPlayGuess(Button btnPlayGuess) {
        this.btnPlayGuess = btnPlayGuess;
    }

    public Button getBtnResetGuess() {
        return btnResetGuess;
    }

    public void setBtnResetGuess(Button btnResetGuess) {
        this.btnResetGuess = btnResetGuess;
    }

    public VBox getParentLotto() {
        return parentLotto;
    }

    public void setParentLotto(VBox parentLotto) {
        this.parentLotto = parentLotto;
    }

    public Label getLabelLotto() {
        return labelLotto;
    }

    public void setLabelLotto(Label labelLotto) {
        this.labelLotto = labelLotto;
    }

    public TextField getLotto1() {
        return lotto1;
    }

    public void setLotto1(TextField lotto1) {
        this.lotto1 = lotto1;
    }

    public TextField getLotto2() {
        return lotto2;
    }

    public void setLotto2(TextField lotto2) {
        this.lotto2 = lotto2;
    }

    public TextField getLotto3() {
        return lotto3;
    }

    public void setLotto3(TextField lotto3) {
        this.lotto3 = lotto3;
    }

    public TextField getLotto4() {
        return lotto4;
    }

    public void setLotto4(TextField lotto4) {
        this.lotto4 = lotto4;
    }

    public TextField getLotto5() {
        return lotto5;
    }

    public void setLotto5(TextField lotto5) {
        this.lotto5 = lotto5;
    }

    public HBox getButtonsLotto() {
        return buttonsLotto;
    }

    public void setButtonsLotto(HBox buttonsLotto) {
        this.buttonsLotto = buttonsLotto;
    }

    public Button getBtnPlayLotto() {
        return btnPlayLotto;
    }

    public void setBtnPlayLotto(Button btnPlayLotto) {
        this.btnPlayLotto = btnPlayLotto;
    }

    public Button getBtnResetLotto() {
        return btnResetLotto;
    }

    public void setBtnResetLotto(Button btnResetLotto) {
        this.btnResetLotto = btnResetLotto;
    }

    public Label getTriesGuess() {
        return triesGuess;
    }

    public void setTriesGuess(Label triesGuess) {
        this.triesGuess = triesGuess;
    }

    // List prizes
    public ListView<String> getListView (){
        return prizeList;
    }

    public void setListView(ListView<String> prizeList) {
        this.prizeList = prizeList;
    }

    public Hashtable<String, String> getHash() {
        return hash;
    }

    public void setHash(Hashtable<String, String> hash) {
        this.hash = hash;
    }

    public ListView<String> getPrizeList() {
        return prizeList;
    }

    public void setPrizeList(ListView<String> prizeList) {
        this.prizeList = prizeList;
    }

    public VBox getParentPrize() {
        return parentPrize;
    }

    public void setParentPrize(VBox parentPrize) {
        this.parentPrize = parentPrize;
    }

    public Button getBtnSelectPrize() {
        return btnSelectPrize;
    }

    public void setBtnSelectPrize(Button btnSelectPrize) {
        this.btnSelectPrize = btnSelectPrize;
    }


    // Launch application
    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Stage window = primaryStage;
        window.setTitle("Deirdre's Game");
        //window.setScene(new Scene(layout, 400, 400));
        Scene scene = new Scene(layout, 400, 400);


        // -- GUESSING GAME -- //

        // Enter number
        parentGuess.getChildren().add(labelGuess);
        parentGuess.getChildren().add(guess);
        parentGuess.getChildren().add(triesGuess);
        guess.setMaxWidth(150);


        // Buttons
        buttonsGuess.getChildren().add(btnPlayGuess);
        buttonsGuess.getChildren().add(btnResetGuess);
        buttonsGuess.getChildren().add(btnExit);
        parentGuess.getChildren().add(buttonsGuess);


        // Alignment
        tab1.setContent(parentGuess);
        parentGuess.setAlignment(Pos.CENTER);
        buttonsGuess.setAlignment(Pos.CENTER);

        // Button functionality
         btnPlayGuess.setOnAction(e -> {
             parseUserTextField();
             g.onClickSubmit();
        });

         btnResetGuess.setOnAction(e -> {
             g.onClickReset();
         });

        btnExit.setOnAction(e -> window.close());


        //  -- LOTTERY -- //

//        lotto = new TextField[numLotto];
//        lotto[0] = new TextField();
//        lotto[1] = new TextField();
//        lotto[2] = new TextField();
//        lotto[3] = new TextField();
//        lotto[4] = new TextField();
        

        // Enter numbers
        parentLotto.getChildren().add(labelLotto);
        parentLotto.getChildren().add(lotto1);
        parentLotto.getChildren().add(lotto2);
        parentLotto.getChildren().add(lotto3);
        parentLotto.getChildren().add(lotto4);
        parentLotto.getChildren().add(lotto5);
        lotto1.setMaxWidth(30);
        lotto2.setMaxWidth(30);
        lotto3.setMaxWidth(30);
        lotto4.setMaxWidth(30);
        lotto5.setMaxWidth(30);


        // Buttons
        buttonsLotto.getChildren().add(btnPlayLotto);
        buttonsLotto.getChildren().add(btnResetLotto);
        parentLotto.getChildren().add(buttonsLotto);


        // Alignment
        tab2.setContent(parentLotto);
        parentLotto.setAlignment(Pos.CENTER);
        buttonsLotto.setAlignment(Pos.CENTER);


        // Button functionality
        btnPlayLotto.setOnAction(e -> {
            parseUserTextField();
            l.onClickSubmit();  //???
        });

        btnResetLotto.setOnAction(e -> {
            l.onClickReset();
        });


        // -- PRIZE SELECTION -- //

        // Button, list view
        parentPrize.getChildren().add(prizeList);
        parentPrize.getChildren().add(btnSelectPrize);

        // Alignment
        tab3.setContent(parentPrize);
        parentPrize.setAlignment(Pos.CENTER);

        // Button functionality
        btnSelectPrize.setOnAction(e -> {
            try {
                // Creates a new dialog box & sets its type
                Dialog prizeAlert = new Alert(Alert.AlertType.INFORMATION);
                prizeAlert.setTitle("Please confirm");
                prizeAlert.setHeaderText("");

                // Convert clicked item to string
                String result = prizeList.getSelectionModel().getSelectedItem().toString();

                // Output hash table value of selected item
                prizeAlert.setContentText("You have chosen: " + hash.get(result));
                prizeAlert.show();

            } catch (Exception e1) {
                e1.printStackTrace();
            }
            window.close();
        });









        // SCENE
//        Scene scene = new Scene(layout, 400, 400);
//        window.setScene(scene);
//        window.show();

//        btn1.setText("Play game");
//        StackPane layout = new StackPane();
//        layout.getChildren().add(button);

//        btn1 = new Button("Claim prize");
//        btn1.setOnAction(e -> AlertBox.display("Congratulations!", "Click to claim your prize!"));



        layout.getTabs().addAll(tab1,tab2);
        window.setScene(scene);
        window.show();
    }


    public void reset (TextField tf, Label lb, Label lb2) {
        tf.clear();
        lb.setText(g.getGuess() + "/4 tries");
        lb2.setText("Guess a number 1-50 to win a prize!");
        guess.setEditable(true);
        guess.setVisible(true);
    }

    public void triesGuess() {
        triesGuess.setText(g.getGuess() + "/4 tries");
    }


    // Clear/hide/parse/disable text field
    public void clearTextField(TextField tf) {
        tf.clear();
    }

    public void hideTextField(TextField tf) {
        tf.setEditable(false);
        tf.setVisible(false);
    }

    public void parseUserTextField() {
        boolean correct = true;
        try {
            value = Integer.parseInt(lotto1.getText());
            value = Integer.parseInt(lotto2.getText());
            value = Integer.parseInt(lotto3.getText());
            value = Integer.parseInt(lotto4.getText());
            value = Integer.parseInt(lotto5.getText());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public void deactivateTextField(TextField tf) {
        tf.setEditable(false);
        tf.setVisible(false);
    }


    // Clear/hide button
    public void hideButton(Button btn) {
        btn.setVisible(false);
    }

    public void UnHideButton(Button btn) {
        btn.setVisible(true);
    }

    public int[] passInLottoTextField() {
        // Parsing user input from lotto into string array
        String StringArray[] = btnPlayLotto.getText().split("\\B");

        // Create new int array
        int IntegerArray[] = new int[StringArray.length];

        for (int i = 0; i < StringArray.length; i++) {
            IntegerArray[i] = Integer.parseInt(StringArray[i]); //???
            //System.out.print(" "+ IntegerArray[i]);
        }
        return IntegerArray;
    }

    public Hashtable<String, String> getHashTable(){
        return hash;
    }

    public void addTab3(ListView prizeList, Hashtable hash) {
        layout.getTabs().add(tab3);
        p.populateList(prizeList, hash);
        layout.getTabs().add(tab3);
    }
}



/*
HASH TABLES
- Allows fast searching
- Based off array
- Key values assigned to elements in hash table (array), using hash function
- Find using calculation rather than searching
*/