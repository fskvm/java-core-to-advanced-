package L0_Rough_Codes;

public class MethodChallenge {
    public static void main(String[] args) {

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Akhtar raza",highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Bob",highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("percy",highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Gilbert",highScorePosition);

        highScorePosition = calculateHighScorePosition(25);
        displayHighScorePosition("James",highScorePosition);
        char ch = 314;
        System.out.println(ch);
        
//        const
//        goto
   }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position "
                + highScorePosition + " on high score list");
    }

    public static int calculateHighScorePosition(int playersScore) {
//        if (playersScore >= 1000) {
//            return 1;
//        } else if ((playersScore >= 500) && (playersScore < 1000)) {
//            return 2;
//        } else if ((playersScore >= 100) && (playersScore < 500)) {
//            return 3;
//        } else {
//            return 4;
//        }
//!        or
//        int position = 0;
//        if (playersScore >= 1000) {
//            positon +=1;
//        } else if ((playersScore >= 500) && (playersScore < 1000)) {
//            position += 2;
//        } else if ((playersScore >= 100) && (playersScore < 500)) {
//            position += 3;
//        } else {
//            position += 4;
//        }
//        return position;
//!        or
        int position = 4; //? assuming position 4 will be returned
        if (playersScore >= 1000) {
            position = 1;
        } else if (playersScore >= 500) {
            position = 2;
        } else if (playersScore >= 100) {
            position = 3;
        }
        return position;

    }
}

