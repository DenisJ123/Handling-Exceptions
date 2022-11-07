import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args){
        int Num = 1;
        while (Num > 0) {
            try {
                System.out.println("Please enter a number between 0 - 9: ");
                Scanner myscan = new Scanner(System.in);
                int myNum = myscan.nextInt();

                if (myNum <= 9 && myNum > 0) {
                    System.out.println("You entered  " + myNum);
                    Num--;
                } else {
                    System.out.println("Not a valid number");
                }
            } catch (InputMismatchException ime) {
                System.out.println("Invalid");
            }
        }
    }
}

