import java.util.*;
// import java.math.*;
public class ArmstrongNumber {
    public static void main(String []args){

        int number, result = 0, remainder, i=0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for checking: ");
        number = sc.nextInt();
        sc.close();
        
        int originalNumber = number;
        int num = number;

        while (number!=0) {
            number = number / 10;
            i++;   
           
        }
        // System.out.println(i);
    
       

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, i);
            originalNumber /= 10;
        }

        if(result == num)
            System.out.println(num+ " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");
    }
}

        // String NumberInString = ("" + number);

        // i = NumberInString.length();
      
//         while (number != 0)
//         {
//             remainder = number % 10;
//             result += Math.pow(remainder, i);
//             number /= 10;
//         }

//         // for (int count=0; count < i; count++) {
//         //     result += Math.pow(Integer.parseInt(String.valueOf(NumberInString.charAt(count))), i);
//         // }

//         if (number == result) System.out.println("Given number" + num + " is an ArmstrongNumber");
//         else System.out.println("Sorry!! Try Again!!");

//     }
    
// }
