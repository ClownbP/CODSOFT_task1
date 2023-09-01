import java.util.Random;
import java.util.Scanner;

public class NextRando {
    public static void main(String[] args) {

        System.out.println(
                "Welcome to my guessing game. I would like you to enter Your guess from 1-100.\n You've got four guesses to go.");
        Scanner ScanPlayerVal = new Scanner(System.in);
        System.out.println("Enter The Guess You're thinking of.");
        int PlayerVal = ScanPlayerVal.nextInt();
        Random rand = new Random();
        int x = rand.nextInt(100);
        if (PlayerVal == x) {
            System.out.println("Correct You Win");
        } else {
            System.out.println("Hey! No let's try again. I'll give you hints now.");
            for (int i = 0; i < 3; i++) {
                int PlayerVal_ = ScanPlayerVal.nextInt();
                if (PlayerVal_ == x) {
                    System.out.println("Congratulation!!! You did the Impossible.");
                } else if (PlayerVal_ < 0) {
                    System.out.println("You've got to be kidding me man.Try again.");
                } else if (Math.abs(PlayerVal_ - x) <= 4) {
                    System.out.println("No!!You were pretty close though");
                } else if (Math.abs(PlayerVal_ - x) > 4) {
                    System.out.println("Omg you are so wrong! Try one more time.");
                }
            }
            System.out.printf("Psych The number actually was: %d", x);
        }
        ScanPlayerVal.close();
    }
}