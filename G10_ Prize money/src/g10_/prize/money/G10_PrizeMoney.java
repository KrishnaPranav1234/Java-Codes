package g10_.prize.money;
import java.util.Scanner;

public class G10_PrizeMoney {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pizeMoney = 0;
        
        System.out.println("Enter Your Guesses \n --------------------------");
        
        System.out.print("\n\tNumber 1: ");
        int Number1 = input.nextInt();
        
        System.out.print("\n\tNumber 2: ");
        int Number2 = input.nextInt();
        
        System.out.print("\n\tNumber 3: ");
        int Number3 = input.nextInt();

        int randomNum1 = (int) (Math.random() * (5 - 2 + 1) + 2);
        int randomNum2 = (int) (Math.random() * (5 - 2 + 1) + 2);
        int randomNum3 = (int) (Math.random() * (5 - 2 + 1) + 2);

        System.out.println();
        
        if (Number1 == randomNum1) {
            System.out.println("Correct!");
            
            prizeMoney = 2500;
            System.out.println(prizeMoney+"1");
        }

        if (Number2 == randomNum2) {
            System.out.println(" Correct!");
             
            prizeMoney = 2500;
            System.out.println(prizeMoney+"2");
        }

        if (Number3 == randomNum3) {
            System.out.println(" Correct!");
            
            prizeMoney = 2500;
             System.out.println(prizeMoney+"3");
        }
        if (Number1 == randomNum1 || Number2 == randomNum2 || Number3 == randomNum3 ) {
            prizeMoney *= 1;
        }
        if (Number1 == randomNum1 || Number2 == randomNum2 || Number3 == randomNum3 ) {
            prizeMoney *= 2;
        }
        
        if (Number1 == randomNum1 && Number2 == randomNum2 || Number3 == randomNum3) {
            prizeMoney *=3;
        }

        System.out.println("\nYour Numbers --> " + Number1 + ", " + Number2 + ", " + Number3);
        System.out.println("Lottery Numbers --> " + randomNum1 + ", " + randomNum2 + ", " + randomNum3);
        System.out.println("Prize Money Won --> R" + prizeMoney);
    }}
