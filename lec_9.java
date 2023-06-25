// Inheritence-----------------------------------
class shape{
    double pi=3.14;
    double get_square(int r){
        return r*r;
    }
}
class Circle extends shape{
    void area(int r){
        System.out.println(pi*get_square(r));
    }
}
public class lec_9{
    public static void main(String args[]){
        Circle c=new Circle();
        c.area(5);
    }
}
