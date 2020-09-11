import java.util.Scanner;

public class GuessingGameApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("If you need understanding on how to play enter \" 0 \".");
        System.out.println("Please guess a number 1-10: ");
        int guess = input.nextInt();
        int triedAttempts = 0;
        while (triedAttempts < 1){
            if (guess == 7) {
                System.out.println("You win!");
                break;
            } else if (guess == 0) {
                System.out.println("You enter a number 1-10 until you win!");
                System.out.println("Please guess a number 1-10: ");
                guess = input.nextInt();

            } else if(guess < 0) {
                System.out.println("You Entered A Negative Integer :( Sorry.");
                System.out.println("GoodBye!");
                break;
            } else {
                System.out.println("You have one more try! Try again!");
                guess = input.nextInt();
                triedAttempts++;
            }

        } if (triedAttempts >= 1) {
            System.out.println("You lose! Better luck next time!");
        }
    }

}
