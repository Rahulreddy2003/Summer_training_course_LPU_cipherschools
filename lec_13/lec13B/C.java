package lec_13B;
import lec_13A.A;
public class C extends A{
    public static void main(String[] args) {
        A obj=new A();
        C obj2=new C();
        // System.out.println(obj.x) default not accessible outside the package for subclass
        // System.out.println(obj.z) private not accessible outside class
        System.out.println(obj.d); // public is accessible everywhere 
        System.out.println(obj2.y); // Protected is accessible for different package for subclass using object of subclass only. 
    }
}
