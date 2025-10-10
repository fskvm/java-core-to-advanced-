package L1_Basic_in_out;

import java.util.Scanner;

public class L6Challenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.println(getInputFromConsole(2025));
            System.out.println(getInputFromScanner(2025));
    }


    public static String getInputFromConsole(int currentYear) {
//      These works only from the terminal you should enter - java .\src\L1_Basic_in_out\L6Challenge.java (Otherwise it will throw an error some intellij versions may support without running from the terminal)
        String name = System.console().readLine("Enter your name: ");
        System.out.println("Hi " + name + ", Thanks for taking the course");

        String dateOfBirth = System.console().readLine("Enter your date of birth: ");
        int age = currentYear - Integer.parseInt(dateOfBirth);
        return "So you are " + age + " years old";
    }

    public static String getInputFromScanner(int currentYear) {
        return "";
    }
}

