import java.util.Scanner;

public class fibonacciSerise {

    public static void main (String [] args){
        int terms, firstTerm=0, secondTerm=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers of terms in fibonacci series: ");
        terms = sc.nextInt();
        sc.close();  //this is only for vs code .
        System.out.println("Fibonacci Series till " + terms + " terms:");

    for (int i = 1; i <= terms; ++i) {
      System.out.print(firstTerm + ", ");
      int nextTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm;
    }
  }  
    }
