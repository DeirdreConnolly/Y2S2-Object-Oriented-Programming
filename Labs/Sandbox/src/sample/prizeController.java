package application;

import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Hashtable;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.HBox;
import sample.Main;

public class prizeController {

    Main mn;

    public prizeController(Main m){
        // creates a call back method so I can access the mains methods
        mn = m;
    }


    public void populateTheList(ListView listview, Hashtable hash) {
        //Clears the list
        mn.getListView().getItems().clear();

//		int prizeNum = 1;
//		String prizeKey = "prize" + prizeNum;

        try {
            //Creates the file reader and points to the alt.txt
            FileReader file = new FileReader("prizes.txt");
            //Creates a buffer reader that reads in from the file that was pointed to.
            BufferedReader reader = new BufferedReader(file);
            // the one that reads the lines
            String line = reader.readLine();

            while (line != null) {

                //Creates the string array that will hold the parts of the hash table.
                String[] hashBits = line.split(";");

//				System.out.println(hashBits[0]);
//				System.out.println(hashBits[1]);
//				System.out.println(hashBits[2]);

                //Adds the correct prizes based off of the star value to the hash table.
                if(mn.getStarNumber() >= Integer.parseInt(hashBits[0] )) {
                    mn.getHashTable().put(hashBits[2], hashBits[1]);
                    //System.out.println(prizeKey);
                }

                line = reader.readLine();
            }

            // This sets the strings onto the observable list, and sets a corresponding key for that string.
            for(String counters : mn.getHashTable().keySet()) {
                mn.getListView().getItems().add(counters);
            }


//

            mn.getListView().getSelectionModel().setSelectionMode(SelectionMode.SINGLE);

            reader.close();

        } catch (Exception e1) {

            e1.printStackTrace();
        }

        HBox hbox2 = new HBox();
        hbox2.setAlignment(Pos.CENTER);

        hbox2.setPadding(new Insets (20 ,20 ,20 ,20));
        hbox2.getChildren().addAll(mn.getListView(), mn.getTestButton());

        mn.getTab3().setContent(hbox2);
    }


}
