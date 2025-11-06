package JavaClasses;

// Public make reference to be accessible from any other class
// if is "class ClassTypes{}" -> default -> it will be accessible from every class in the same package
public class ClassTypes {
    
    final double value=3.14;
    // Declare an non modifiable variable, if we try to change the value the Java Compiler will return error.
    
    int param1, param2;
    
    public static void main(String args[]){
        ClassTypes myObj1 = new ClassTypes(1, 2);
        ClassTypes myObj2 = new ClassTypes(1); 
        System.out.println(myObj1.param1); // 1
        System.out.println(myObj2.param2); // 2
    }

    //Constructor must have the same name than the Class, if we don't declarate it will be assigned a default constructor
    //Every constructor have a signature depending the params and the type of params, both must be different
    public ClassTypes(int param1, int param2){
        this.param1 = param1;
        this.param2 = param2;
    }

    public ClassTypes(int param1){
        this(param1, 2);
    }


}
