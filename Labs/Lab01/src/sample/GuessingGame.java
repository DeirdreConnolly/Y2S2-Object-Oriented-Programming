package sample;

import javafx.scene.control.Label;
import sample.Main;

public class GuessingGame {

    private int random = generateNewNumber();
    private int guess = 0;
    private int gWins = 0;
    private boolean gameSuccess = false;

    Main mn;

    // Output correct number to console
    public GuessingGame(Main f) {
        mn = f;
        System.out.println("Number generated: " + random);
    }


    // Generate random number
    public int generateNewNumber() {
        random = (int) (Math.random() * 50 + 1);
        return random;
    }


    // Getters and setters
    public int getRandom() {
        return random;
    }

    public void setRandom(int random) {
        this.random = random;
    }

    public int getGuess() {
        return guess;
    }

    public void setGuess(int guess) {
        this.guess = guess;
    }

    public int getgWins() {
        return gWins;
    }

    public void setgWins(int gWins) {
        this.gWins = gWins;
    }

    public boolean isGameSuccess() {
        return gameSuccess;
    }

    public void setGameSuccess(boolean gameSuccess) {
        this.gameSuccess = gameSuccess;
    }


    // Reset button is clicked, generate new number
    public void onClickReset() {
        generateNewNumber();
        mn.UnHideButton(mn.getBtnPlayGuess());
        System.out.println("New number generated: " + random);
        resetGuess();
        mn.reset(mn.getGuess(), mn.getTriesGuess(), mn.getLabelGuess());
    }


    // Submit button is clicked
    public void onClickSubmit() {
        guess += 1;             // shorthand for: guess = 1 + guess
        gameSuccess = true;

        if (mn.getValue() == random) {
            Label labelGuessWin = new Label("You guessed it! You have won 2 stars!");
            guess += 1;             // shorthand for: guess = 1 + guess
            gWins += 1;
            gameSuccess = true;

            // Hide play button/text field
            mn.hideButton(mn.getBtnPlayGuess());
            mn.hideTextField(mn.getGuess());









            // Check for 5 wins in a row
            if (gWins % 5 == 0) {
                mn.setStarCount(mn.getStarCount() + 3);
            }
            else {
                mn.setStarCount(mn.getStarCount() + 2);
            }
            mn.triesGuess();
        }

        // Guess too low
        else if(mn.getValue() < random){
            mn.getLabelGuess().setText("Too low!");
            guess += 1;
            if (guess == 4) {
                mn.deactivateTextField(mn.getGuess());
            }
            //updates the guess display labels
            mn.triesGuess();
        }

        // Guess too high
        else if(mn.getValue() > random) {
            mn.getLabelGuess().setText("Too high!");
            guess += 1;
            if (guess == 4) {
                mn.deactivateTextField(mn.getGuess());
            }
            mn.triesGuess();
        }

        // Prize tab becomes visible if user has earned stars
        if (mn.getStarCount() >= 1 && gameSuccess == true) {
            mn.addTab3(mn.getListView(), mn.getHashTable());
        }

        // Game over, out of guesses
        if(guess >= 4) {
            gWins = 0;
            mn.getLabelGuess().setText("Game over! Press reset to play again.");
            mn.hideButton(mn.getBtnPlayGuess());
        }
        // Game failed
        gameSuccess = false;
    }

    // Reset button is clicked, reset guess
    public int resetGuess() {
        guess = 0;
        return guess;
    }
}














//    public static void main(String args[])
//    public void test(){
//        System.out.println("pls work :(");
//    }
//
//    public void game1(){
//        Scanner scanner = new Scanner(System.in);
//        int count = 0;
//        int random = 1 + (int) (Math.random() * 49);
//        int guess = 0;
//
//        System.out.println("Guess a number between 1-50 >>> ");
//
//        do {
//            guess = scanner.nextInt();
//            count++;
//
//            if (guess > random) {
//                System.out.println("Ooof, too high!");
//            } else if (guess < random) {
//                System.out.println("Ooof, too low!");
//            } else {
//                System.out.println("Yay, you got it!");
//            }
//        } while (count != 4);
//    }
//
//
//}
