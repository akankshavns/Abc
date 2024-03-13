import java.util.*;

 class InnerFactorial {
    int number; 
    long result = 1;
    void Fact(){
        Scanner sc = new Scanner(System.in);
        System.out .print("Enter the number ");
        number = sc.nextInt();
        if (number == 0){
            System.out.println("Factorial of " + number + " is = 1");
        }
        if(number<0) {
            System.out.println("Factorial of negative number can't be exist");

        }
        else{
            for(int i = 1; i<=number; i++){
                result = (long)result * i;                                                         

            }
            System.out.println("Factorial of " + number + " is = "+ result);
        }
       
    }

    
}
public class Factorial {
    public static void main(String [] args){
        InnerFactorial obj = new InnerFactorial();
        obj.Fact(); 

    }
}
