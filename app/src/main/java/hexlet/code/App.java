package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                0 - Exit
                """);

        Scanner scanner = new Scanner(System.in);

        int answer = scanner.nextInt();

        System.out.println("Your choice: " + answer );

        String name;

        switch (answer) {
            case 1:
                System.out.println("Welcome to the Brain Games!");
                Cli.greetUser();
                break;
            case 2:
                System.out.println("Welcome to the Brain Games!");
                name = Cli.greetUser();
                Even.runEven(name);
                break;
            default:
                System.out.println("Bye!");
                break;
        }
    }
}
