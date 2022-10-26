package sample;

public class Lottery {

    // Lotto numbers
    private int lotto1 = generateLottoNumbers();
    private int lotto2 = generateLottoNumbers();
    private int lotto3 = generateLottoNumbers();
    private int lotto4 = generateLottoNumbers();
    private int lotto5 = generateLottoNumbers();

    private int correct = 0;
    private boolean gamePassed = false;
    

    Main mn;

    // Output correct numbers to console
    public Lottery(Main m){
        mn = m;
        System.out.println("Lotto numbers: " + lotto1 + "," + lotto2 + "," + lotto3 + "," + lotto4 + "," + lotto5);
    }

    // Generate number
    private int generateLottoNumbers() {
        int randomLottoNumber = (int)(Math.random()* 47 + 1);

        if(randomLottoNumber == lotto1){
            randomLottoNumber = generateLottoNumbers();
        }
        if(randomLottoNumber == lotto2){
            randomLottoNumber = generateLottoNumbers();
        }
        if(randomLottoNumber == lotto3){
            randomLottoNumber = generateLottoNumbers();
        }
        if(randomLottoNumber == lotto4){
            randomLottoNumber = generateLottoNumbers();
        }
        if(randomLottoNumber == lotto5){
            randomLottoNumber = generateLottoNumbers();
        }

        return randomLottoNumber;
    }


    // Reset button is clicked, generate new numbers
    public void onClickReset() {
        generateLottoNumbers();
        mn.UnHideButton(mn.getBtnPlayLotto());
        System.out.println("Lotto numbers: " + lotto1 + "," + lotto2 + "," + lotto3 + "," + lotto4 + "," + lotto5);
        resetLotto();
//        mn.reset(mn.getLotto1(), mn.getLabelLotto());
    }


    public void onClickSubmit() {
        correct = 0;
        int[] IntegerArray = mn.passInLottoTextField(); //???

        // Checks text field number against generated numbers
        for(int x =0; x < IntegerArray.length; x++) {
            if(lotto1 == IntegerArray[x]) {
                correct+=1;
                break;
            }
        }

        for(int x =0; x < IntegerArray.length; x++) {
            if(lotto2 == IntegerArray[x]) {
                correct+=1;
                break;
            }
        }

        for(int x =0; x < IntegerArray.length; x++) {
            if(lotto3 == IntegerArray[x]) {
                correct+=1;
                break;
            }
        }

        for(int x =0; x < IntegerArray.length; x++) {
            if(lotto4 == IntegerArray[x]) {
                correct+=1;
                break;
            }
        }

        for(int x =0; x < IntegerArray.length; x++) {
            if(lotto5 == IntegerArray[x]) {
                correct+=1;
                break;
            }
        }

        // Read in number of correct/incorrect numbers, output message
        if (correct == 5) {
            mn.getLabelLotto().setText("Congratulations, you have won!");
            gamePassed = true;

            // Hide play button/text fields
            mn.deactivateTextField(mn.getLotto1());
            mn.deactivateTextField(mn.getLotto2());
            mn.deactivateTextField(mn.getLotto3());
            mn.deactivateTextField(mn.getLotto4());
            mn.deactivateTextField(mn.getLotto5());
            mn.hideButton(mn.getBtnPlayLotto());

            // User wins 5 stars
            mn.setStarCount(mn.getStarCount() + 5);
        }
        else if (correct == 4) {
            gamePassed = true;
            mn.getLabelLotto().setText("Ooh close, 4/5 correct!");

            // Hide play button/text fields
            mn.deactivateTextField(mn.getLotto1());
            mn.deactivateTextField(mn.getLotto2());
            mn.deactivateTextField(mn.getLotto3());
            mn.deactivateTextField(mn.getLotto4());
            mn.deactivateTextField(mn.getLotto5());
            mn.hideButton(mn.getBtnPlayLotto());

            // User wins 4 stars
            mn.setStarCount(mn.getStarCount() + 4);
        }
        else
            // User loses
            mn.getLabelLotto().setText("Oof, better luck next time!");

            // Clear text field
            mn.clearTextField(mn.getLotto1());

        // Prize tab becomes visible
        if (mn.getStarCount() > 1 && gamePassed == true) {
            mn.addTab3(mn.getListView(), mn.getHashTable());
        }

        // Game failed
        gamePassed = false;
    }

    // Reset button is clicked, reset guess
    public int resetLotto() {
        lotto1 = generateLottoNumbers();
        lotto2 = generateLottoNumbers();
        lotto3 = generateLottoNumbers();
        lotto4 = generateLottoNumbers();
        lotto5 = generateLottoNumbers();
        mn.clearTextField(mn.getLotto1());
        mn.clearTextField(mn.getLotto2());
        mn.clearTextField(mn.getLotto3());
        mn.clearTextField(mn.getLotto4());
        mn.clearTextField(mn.getLotto5());
        return lotto1;
    }
}




