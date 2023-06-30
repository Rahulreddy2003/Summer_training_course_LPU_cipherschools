package lec_13B;
import lec_13A.A;
public class D {
    public static void main(String[] args) {
        A obj=new A();
        // System.out.println(obj.x); default is not accessible outside the package
        // System.out.println(obj.y); protected is not accessible outside the class
        // System.out.println(obj.z); private is not accessible outside the package
        System.out.println(obj.d);// Public is accessible outside the package
    }
}
