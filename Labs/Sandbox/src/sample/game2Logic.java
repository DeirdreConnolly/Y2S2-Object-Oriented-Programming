package application;

import sample.Main;

public class game2Logic {

    // Creating the random number variables
    private int randomNumber1 = generateLottoNumbers();
    private int randomNumber2 = generateLottoNumbers();
    private int randomNumber3 = generateLottoNumbers();
    private int randomNumber4 = generateLottoNumbers();
    private int randomNumber5 = generateLottoNumbers();

    //sets the gamePassed variable to false.
    private boolean gamePassed = false;

    private int correctNums = 0;

    // creates an Integer Array that is null
    //private int[] IntegerArray = null;

    Main mn;

    public game2Logic(Main m){
        // creates a call back method so I can access the mains methods
        mn = m;
        System.out.println("Lotto Numbers: [" + randomNumber1 +","+ randomNumber2 +","+ randomNumber3 +","+ randomNumber4 +","+ randomNumber5+"]");
    }

    private int generateLottoNumbers() {
        // Generating a number from [1-9]
        int randomLottoNumber = (int)(Math.random()* 9 + 1);

        if(randomLottoNumber == randomNumber1){
            randomLottoNumber = generateLottoNumbers();
        }
        if(randomLottoNumber == randomNumber2){
            randomLottoNumber = generateLottoNumbers();
        }
        if(randomLottoNumber == randomNumber3){
            randomLottoNumber = generateLottoNumbers();
        }
        if(randomLottoNumber == randomNumber4){
            randomLottoNumber = generateLottoNumbers();
        }
        if(randomLottoNumber == randomNumber5){
            randomLottoNumber = generateLottoNumbers();
        }

        return randomLottoNumber;
    }


    public void onClickSubmit() {
        // IntegerArray = null;
        correctNums = 0;
        int[] IntegerArray = mn.passInLottoTextField();

        // Checks the textfield number against the generated lotto numbers
        for(int x =0; x < IntegerArray.length; x++) {
            if(randomNumber1 == IntegerArray[x]) {
                correctNums+=1;
                break;
            }
        }

        for(int x =0; x < IntegerArray.length; x++) {
            if(randomNumber2 == IntegerArray[x]) {
                correctNums+=1;
                break;
            }
        }

        for(int x =0; x < IntegerArray.length; x++) {
            if(randomNumber3 == IntegerArray[x]) {
                correctNums+=1;
                break;
            }
        }

        for(int x =0; x < IntegerArray.length; x++) {
            if(randomNumber4 == IntegerArray[x]) {
                correctNums+=1;
                break;
            }
        }

        for(int x =0; x < IntegerArray.length; x++) {
            if(randomNumber5 == IntegerArray[x]) {
                correctNums+=1;
                break;
            }
        }

//		if(randomNumber1 == IntegerArray[0]) {
//			correctNums +=1;
//		}
//		if (randomNumber2 == IntegerArray[1]) {
//			correctNums +=1;
//		}
//		if (randomNumber3 == IntegerArray[2]) {
//			correctNums +=1;
//		}
//		if (randomNumber4 == IntegerArray[3]) {
//			correctNums +=1;
//		}
//		if (randomNumber5 == IntegerArray[4]) {
//			correctNums +=1;
//		}

        // Reads in the number of correct/incorrect numbers and outputs the right message.
        if (correctNums == 5) {
            mn.getL4().setText("All numbers are Correct.");
            gamePassed = true;
            //hides the button and text fields
            mn.deactivateTextField(mn.getuserInputG2());
            mn.hideButton(mn.getButtonSubmitLotto());
            //increases the star number
            mn.setStarNumber(mn.getStarNumber()+5);
        }
        else if (correctNums == 4) {
            gamePassed = true;
            //changes the label to inform the user of the result.
            mn.getL4().setText("Four out of five numbers are correct.");
            //hides the button and text fields
            mn.deactivateTextField(mn.getuserInputG2());
            mn.hideButton(mn.getButtonSubmitLotto());
            //increases the star number
            mn.setStarNumber(mn.getStarNumber()+4);
        }
        else
            //changes the label to inform the user of the result.
            mn.getL4().setText("The numbers are not correct");
        // clears the text field.
        mn.clearTextField(mn.getuserInputG2());

        //If they passed the game and have stars it adds on the third tab.
        if (mn.getStarNumber() > 1 && gamePassed == true) {
            mn.addTab3(mn.getListView(), mn.getHashTable());
        }
        // sets game passed to false.
        gamePassed = false;
    }

//	public void generateNewLottoNums() {
//		// Generates new lotto numbers
//		randomNumber1 = generateLottoNumbers();
//		randomNumber2 = generateLottoNumbers();
//		randomNumber3 = generateLottoNumbers();
//		randomNumber4 = generateLottoNumbers();
//		randomNumber5 = generateLottoNumbers();
//	}

//	public void outputNewNums() {
//		System.out.println("New Lotto Numbers: [" + randomNumber1 +","+ randomNumber2 +","+ randomNumber3 +","+ randomNumber4 +","+ randomNumber5+"]");
//	}

}
