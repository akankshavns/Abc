import java.util.Scanner;

public class PrimeNumber {
    public static void main (String [] args){
        int number;
        System.out.print("Enter the number ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        sc.close();
        if (number == 1)System.out.println("This is not a prime number.");
        if (number == 2)System.out.println("This is prime number.");

        else{
            for(int i=2; i<=number-1; i++){
                if ((number % i)==0){
                    System. out.println("This is not a prime number.");
                    break;
    
                } else {
                    System.out.println("This is a prime number.");
                    break;
                }
            }
        }
    }

    
}
