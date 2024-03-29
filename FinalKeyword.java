class FinalVariable {

    final double pi = 3.14;
    void display(){
        System.out .println("The value of pi = " + pi);
    } 
        
}
class FinalMethod {
    final void message(){
        System.out.println("I am method in java programing with final keyword");

    }    
}
final class  FinalClass {
    void fun(){
        System.out.println("I am a class with final keyword");
    }

    
}
public class FinalKeyword {
    public static void main (String [] args){
        FinalVariable obj = new FinalVariable();
        obj.display();

        FinalMethod obj2 = new FinalMethod();
        obj2.message();

        FinalClass obj3 = new FinalClass();
        obj3.fun();

    }
    
}
