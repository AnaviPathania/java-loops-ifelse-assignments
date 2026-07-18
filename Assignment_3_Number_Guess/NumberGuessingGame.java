import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secretNumber = 27;
        int attempts = 5;

        for (int i = 1; i <= attempts; i++) {
            System.out.println("Attempt " + i + ": Enter your guess");
            int guess = sc.nextInt();

            if (guess == secretNumber) {
                System.out.println("Congratulations!");
                return; 
            } else if (guess < secretNumber) {
                System.out.println("Too Low");
            } else {
                System.out.println("Too High");
            }
        }

        System.out.println("Better Luck Next Time!");
    }
}

