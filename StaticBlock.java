import java.util.Scanner;

public class StaticBlock {
    static int result;
    static{
        System.out.println("I am inside in static block ");
        System.out.print("Enter the two number ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc .nextInt();
        int num2 = sc.nextInt();
        result = num1 + num2;
        System.out.println("Result = "+ result);
        
    }
    public static void  main (String[] args){
        //Static block call automatically.
    }
}