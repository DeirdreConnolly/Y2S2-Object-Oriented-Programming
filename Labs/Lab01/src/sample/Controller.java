package sample;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.VBox;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Hashtable;

public class Controller {

    Main mn;

    public Controller(Main f) {
        mn = f;
    }

    public void populateList(ListView prizeList, Hashtable hash) {
        // Clear list
        mn.getListView().getItems().clear();

        try {
            // Create file
            FileReader file = new FileReader("prizes.txt");
            // Create buffer reader that reads in from the file that was pointed to
            BufferedReader reader = new BufferedReader(file);
            // Read each line
            String line = reader.readLine();

            while (line != null) {

                // Creates string array to hold elements of hash table
                String[] hashBits = line.split(";");
//				System.out.println(hashBits[0]);
//				System.out.println(hashBits[1]);
//				System.out.println(hashBits[2]);

                // Matches prize/star count to hash table element
                if(mn.getStarCount() >= Integer.parseInt(hashBits[0])) {
                    mn.getHashTable().put(hashBits[2], hashBits[1]);
                }

                line = reader.readLine();
            }

            // Sets the strings onto the observable list, sets a corresponding key for that string
            for(String counters : mn.getHashTable().keySet()) {
                mn.getListView().getItems().add(counters);
            }

            mn.getListView().getSelectionModel().setSelectionMode(SelectionMode.SINGLE);

            // Close file
            reader.close();

        } catch (Exception e1) {

            e1.printStackTrace();
        }

        Label stars = new Label("Stars earned: " + mn.getStarCount());
        VBox vboxP = new VBox(10);
        vboxP.setAlignment(Pos.CENTER);

        vboxP.setPadding(new Insets(20));
        vboxP.getChildren().add(stars);
        vboxP.getChildren().add(mn.getListView());
        vboxP.getChildren().add(mn.getBtnSelectPrize());

        mn.getTab3().setContent(vboxP);
    }
}

