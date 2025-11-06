package JavaClasses;
/* 

    Non-Access Modifiers don't change the visibility, they add another caracteristics to classes, methods and attributes
    Most commons:
        - final    ->  fix value, cannot be change
        - static   ->  the static methods or attributes don't depend on the instance of the class, is shared by all the class and is not necesary declare a class 
        - abstract ->  specific kind of class for inherit methods

*/
abstract public class NonAccsessModifiers {
    final double PI = 3.14;
    static String country = "Argentina";
    abstract protected void method();
    abstract void method2();
}

/*

public class Example extends NonAccessModifiers{ 
    public static void main(String args[]){
        Example myObj = new Example();
        myObj.double = 5  -> WRONG - Can't be possible to modify
        sysout(myObj.country)     -> WRONG - Can't be possible access to static attribute throw a instance
        sysout(Example.country)   -> OK - The static can be access by the class directly

    }

    void method(){
        syslog("Hello")  -> the declare of the method is a must in the extends of abstract classes
    }

    void method2(){
        syslog("") -> WRONG - the method2 is not accessible cause of the default access modifier declarated in the abstrac class
    }
}

*/