import java.util.Scanner;

public class GuessingGameApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please guess a number 1-10: ");
        System.out.println("If you need understanding on how to play enter \" 0 \".");
        int guess = input.nextInt();
        for(int triedAttempts = 0; triedAttempts < 2; triedAttempts++) {
            if (guess == 7) {
                System.out.println("You win!");
                break;
            } else if (guess == 0) {
                System.out.println("Please enter a number 1-10 until you win!");
            } else if (guess != 7){
                System.out.println("You have one more try!");
                guess = input.nextInt();
            } else {
                System.out.println("You lose!");
            }
        }
    }

}
