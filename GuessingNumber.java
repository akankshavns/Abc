import java.util.*;
import java.math.*;

public class GuessingNumber {
    public static void main (String [] args){
        while(true){
            int randomNumber = (int)(Math.random()*100);
            // System.out.println(randomNumber);
            int num;
            do {            System.out.println("Guess the number ");
                Scanner sc = new Scanner(System.in);
                num = sc .nextInt();
                if (num < randomNumber){
                    System.out.println("oop! number is greater than your guessing number.\nplease try again. ");
                    System.out.println("Otherwise press -1 for exit the game");
                }
                else {
                    if (num == randomNumber){
                        System.out.println("Hurray! you guess the correct number.");
                        break;
                    }
                    else{
                        System.out.println("oop! number is less than your guessing number \nplease try again.");
                        System.out.println("Otherwise press -1 for exit the game");
                    }
                }
            } while(num !=-1);
        }
    }
}
