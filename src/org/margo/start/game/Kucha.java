package org.margo.start.game;

public class Kucha {
    int[] locationCells;
    int numOfHits = 0;
    public String checkYourself(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);
        String result = "Мимо";
        for (int cell : locationCells) {
            if (guess == cell) {
                result = "Попал";
                numOfHits++;
                break;

            }
        }
        if (numOfHits == locationCells.length) {
            result = "Потопил";
        }
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        int numOfGuesses = 0;
        Seebattle helper = new Seebattle();
        SimpleDotCom theDotCOm = new SimpleDotCom();
        int randomNum = (int) (Math.random() * 5);
        int[] locations = {randomNum, randomNum+1, randomNum+2};
        theDotCOm.setLocationCells(locations);
        boolean isAlive = true;

        while (isAlive == true) {
            String guess = helper.getUserInput("Введите число");
            String result = theDotCOm.checkYourself(guess);
            numOfGuesses++;
            if (result.equals("Потопил")) {
                isAlive = false;
                System.out.print("Вам потребовалось" + numOfGuesses + "попыток(и)");
            }
        }

    }



}
