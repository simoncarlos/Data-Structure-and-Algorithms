package JavaConcepts;

public class Inheritance {
    public Inheritance(){}
    public void print(){
        System.out.println("Inheritance Print");
    }
}

/* 

public class Example extends Inheritance{
    class Example(){
    super(); -> make reference to the constructor of Inheritance class(parent class)
    }
    @override
    public void print(){ -> Polimorfism (when it could have differents behaviors depend the subclass)
        super.print()
        System.out.println("Example Print");
    }
}

public class Example2 extends Inheritance{
    class Example2(){
    }
    public void print(){
        System.out.println("Example2 Print");
    }
}

public class Print{
    public class void main(String args[]){
        Example myObj = new Example();
        myObj.print(); -> print from super and from Example class

        Example2 myObj2 = new Example2();
        myObj2.print(); -> print
    }
}

*/