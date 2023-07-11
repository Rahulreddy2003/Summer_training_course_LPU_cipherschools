// Strings----------------------------------
import java.util.*;
public class lec_21 {
    public static void main(String[] args) {
        String name="CipherSchools"; // created using string literals - stored in method area
        String name2="CipherSchools";

        String name3=new String("CipherSchools"); // created using constructors
        String name4=new String("CipherSchools");

        System.out.println(name==name2);
        System.out.println(name3==name4);
        System.out.println(name==name3);

        // Strings are immutable, any changes on string will create a new one

        // Concatenation---------------
        String s1="hello";
        s1=s1+" David";
        System.out.println(s1);
        System.out.println(s1+" How are you ?");
        System.out.println(s1);//s1 remains the same

        //Another way to concat the strings
        String s2=new String("Hello");
        String s3=new String(" Guys");
        String s4=s2.concat(s3);
        System.out.println(s4);
        System.out.println(s2);// remains same

        // to check if string values are equal in value
        //this generally compares references(hashcodes)of objects (just like (==))
        //but, for string class it has been overriden to check for content equality
        System.out.println(name.equals(name2));
        System.out.println(name3.equals(name4));


        char arr[]={'c','i','p','h','e','r'};
        String strFromArr=new String(arr); //constructor overloaded
        System.out.println(strFromArr);
    }
}
