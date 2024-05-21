package hexlet.code;

import java.util.Scanner;
import java.util.Random;

public class Even {
    public static void runEven(String name) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Answer 'yes' if the number is even, " +
                "otherwise answer 'no'.");

        int roundsToWin = 3;
        int correctAnswersCount = 0;

        while (correctAnswersCount < roundsToWin) {

            int randomNumber = random.nextInt(100) + 1;

            System.out.println("Question: " + randomNumber);
            System.out.print("Your answer: ");

            String userResponse = scanner.nextLine().toLowerCase();

            boolean isEvenNumber = randomNumber % 2 == 0;
            boolean isCorrectResponse = (isEvenNumber && "yes".equals(userResponse)) ||
                    (!isEvenNumber && "no".equals(userResponse));

            if (isCorrectResponse) {
                System.out.println("Correct!");
                correctAnswersCount++;
            } else {
                String correctAnswer = isEvenNumber ? "yes" : "no";
                System.out.println("'" + userResponse + "' is wrong answer ;(. Correct answer was '"
                        + correctAnswer + "'.");
                System.out.println("Let's try again, " + name + "!");
                break;
            }
        }
        if (correctAnswersCount == roundsToWin) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
}
