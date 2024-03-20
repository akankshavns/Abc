import java.util.*;
class StaticDemo {

    static String Name, Enroll; 
    int  sem;
    static void fun(){
        System.out.println("your name is:- " + Name + "\nyour Enroll is :- " + Enroll  );
        
    }
   
    StaticDemo(){
        sem = 0;
        // System.out.print(sem);
    }
    
}
public class StaticVariable {
    // static String Enroll;
    public static void main(String[] args){
        System.out.println("Enter your name, Enrollment, semeter:- ");
        Scanner sc = new Scanner(System.in);
       StaticDemo.Name = sc.nextLine();
       StaticDemo.Enroll=sc.nextLine();
       int num= sc.nextInt();
       StaticDemo.fun();
       StaticDemo obj1 = new StaticDemo();
       obj1.sem = num;
       System.out.print(obj1.sem);

    }

}
