package L4_MethodsRelatedConcepts;

public class L3MethodOverloading {
    public static void main(String[] args) {

      int highScore = calculateScore("Akhtar raza", 1000);
      System.out.println("1st High score is: " + highScore);

      int high2 = calculateScore(100);
      System.out.println("2nd High score is: " + high2);

      calculateScore();

      calculateScore(100, "Akhtar raza");

    }

    public static int calculateScore(String playerName, int score) {

        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {

        System.out.println("Unnamed player scored " + score + " points");
        return score * 100;
    }

    public static void calculateScore() {
        System.out.println("3rd Unnamed player scored 0 points");
    }

    public static void calculateScore(int score, String playerName) {
        System.out.println("4th " + playerName + " scored " + score + " points");
    }
}

/*

Method overloading: It occurs when a class has multiple methods with the same name but with different parameters.

The type, order and number of parameters, in conjunction with the name, make the method signature unique.
(Note - A method's return type is not part of the signature and the parameter name is not part of the signature)

*/
