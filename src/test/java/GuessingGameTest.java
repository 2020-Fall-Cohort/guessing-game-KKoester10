import java.util.Scanner;

public class GuessingGameTest {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);


        System.out.println("what is your favorite ROYGBIV color? If you dont know what ROYGBIV means, enter \"Help\"");
        String favoriteColor = inputScanner.nextLine();
        if (favoriteColor.equalsIgnoreCase("Help")) {
            System.out.println("ROYGBIV stands for: RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET");
            System.out.println("what is your favorite ROYGBIV color?");
            favoriteColor = inputScanner.nextLine();
        }
    }
}
