import java.util.Scanner;

public class GuessingGameApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("If you need understanding on how to play enter \" 0 \".");
        System.out.println("Please guess a number 1-10: ");
        int triedAttempts = 0;
        int guess = input.nextInt();
        if (guess == 0) {
            System.out.println("You enter a number 1-10 in two tries you'll win!");
            System.out.println("Please guess a number 1-10: ");
            guess = input.nextInt();
        }
        while (triedAttempts < 2){
            if (guess == 7) {
                System.out.println("You win!");
                break;
            } else if(guess < 0) {
                System.out.println("You Entered A Negative Integer :( Sorry.");
                System.out.println("GoodBye!");
                break;
            } else if (triedAttempts < 1){
                System.out.println("You have one more try! Try again!");
                guess = input.nextInt();
            } else if (triedAttempts == 1) {
                System.out.println("You Lose! Come back soon!");
            } else {
                guess = input.nextInt();
            }
            triedAttempts++;
        }
    }

}
