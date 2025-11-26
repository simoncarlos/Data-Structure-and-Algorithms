package JavaConcepts;

public class InterfacesLambdas implements Contract{
    
    public void calculate(int a, int b){
        System.out.println(a+b);
    }
    public static void main(String args[]){
        InterfacesLambdas myObj = new InterfacesLambdas();
        Contract abs = (a,b) -> System.out.println(a+b);
        abs.calculate(1, 2);
        myObj.show();
        Contract.method();
    }
}

/*
    Interfaces declare methos for be implements, it can't use states or instances like classes
    Establish with methods must have the classes, if is not declare is a public abstract method
    Interface could be normal or functional(only one abstract class)
*/
@FunctionalInterface
interface Contract{
    abstract void calculate(int a, int b);
    default void show(){
        System.out.println("Hello");
    }
    static void method(){
        System.out.println("method static");
    }
}