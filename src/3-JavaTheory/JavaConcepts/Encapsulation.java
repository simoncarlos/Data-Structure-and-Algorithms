package JavaConcepts;

/* 

    Encapsulation in java is for hide the sensitive information from users. 
    The best way for access are the getter and setter methods. 
    This increase the security and flexible in software, we can make a read-only or write-only methods for attributes

*/
public class Encapsulation {
    int param1=0;
    private int value=0;

    public Encapsulation(int param1){
        this.param1 = param1;
    }
    public int getValue(){
        return this.value;
    }
    public void setValue(int param1){
        this.value = param1;
    }
    public static void main(String args[]){
        Encapsulation myObj = new Encapsulation(19);
        // System.out.println(myObj.value1); -> Error because of private attribute in class Encapsulation
        System.out.println(myObj.getValue()); // Uso de getter
    }

}
