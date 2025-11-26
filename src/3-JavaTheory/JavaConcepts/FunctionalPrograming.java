public class FunctionalPrograming{
    public static void main(String args[]){
        
        Function<Integer, Integer> squareFunction ? 
        new Function<Integer, Integer>(){
            @Override
            public Integer applu(Integer x){
                return x*x;
            }
        }

        Function<Integer, Boolean> isOdd = x -> x%2=1;
        Predicate<Integer> isEven = isEven = x-> x%2=0;
        isEven.test(8);

    }
}

public class Rectangle {
    protected int width;
    protected int height;

    public void setWidth(int width) { this.width = width; }
    public void setHeight(int height) { this.height = height; }

    public int area() { return width * height; }
}

public class Square extends Rectangle {
    @Override
    public void setWidth(int width) { 
        this.width = width; 
        this.height = width; 
    }
    @Override
    public void setHeight(int height) { 
        this.width = height; 
        this.height = height; 
    }
}
