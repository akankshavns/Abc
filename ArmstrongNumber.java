import java.util.*;
// import java.math.*;
public class ArmstrongNumber {
    public static void main(String []args){

        int number, result = 0, remainder, i=0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for checking: ");
        number = sc.nextInt();
        sc.close();
        
        int num = number;

        // while (number!=0) {
        //     number = number / 10;
        //     i++;   
        // }

        String NumberInString = ("" + number);

        i = NumberInString.length();
      
        // while (number != 0)
        // {
        //     remainder = number % 10;
        //     result += Math.pow(remainder, i);
        //     number /= 10;
        // }

        for (int count=0; count < i; count++) {
            result += Math.pow(Integer.parseInt(String.valueOf(NumberInString.charAt(count))), i);
        }

        if (number == result) System.out.println("Given number" + num + " is an ArmstrongNumber");
        else System.out.println("Sorry!! Try Again!!");

    }
    
}
