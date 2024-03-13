import java.util.*;
// import java.math.*;
public class ArmstrongNumber {
    public static void main(String []args){
        int num,  result = 0,remainder, i=0 ,add= 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for checking: ");
        num = sc.nextInt();
        while (num!=0) {
            num = num /10;
            i++;   
        }
      
        while (num != 0)
        {
            remainder = num % 10;
            result += Math.pow(remainder, 3);
            num /= 10;
        }
        System.out.println("addition = " + result);


        // System.out.println(i);
    }
    
}
