package JavaClasses;

/* 
    Modifiers for classes: 
        - public  -> Accessible from everywhere
        - default -> Accessible only from the same package
*/
public class AccessModifiers {
    /*
        Modifiers for attributes, constructors and methods:
        - public     -> Accessible from every class 
        - private    -> Accessible only from the same class
        - default    -> Accessible only from the same package
        - protected  -> Accessible from the same package and subclasses
    */
    public int value1;
    private int value2;
    int value3;
    protected int value4;

    public AccessModifiers(){
        value1 = 1;
        value2 = 2;
        value3 = 3;
        value4 = 4;
    }
}

/*
*Different package*

public class Example extends AccessModifiers{
    public static void Main(String args[]){
        Example myObj = new Example();
        
        myObj.value1 -> OK (public access modifier)
        myObj.value2 -> WRONG (private access modifier, only accessible from the same class)
        myObj.value3 -> WRONG (default access modifier, only accessible from the same package)
        myObj.value4 -> OK (accessible from the same package or outside subclasses)
    }    
}

*/