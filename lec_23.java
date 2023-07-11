// Strings----------------------------------
import java.util.*;
public class lec_23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name="Rahul Reddy"; // created using string literals - stored in method area
        String name2="RahulReddy";

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

        // changing the case
        System.out.println("========================");
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        //splitting
        // System.out.println("=============================");
        // System.out.println("Enter something separated through commas : ");
        // String temp=sc.nextLine();
        // String tempArr[]=temp.split(",");
        // for(int i=0;i<tempArr.length;i++){
        //     System.out.println(tempArr[i]);
        // }
        // System.out.println();
        // System.out.println("=============================");
        // System.out.println("Enter something separated through dots : ");
        // String dot_sep=sc.nextLine();
        // String tempArr2[]=dot_sep.split("[.]");
        // for(int i=0;i<tempArr2.length;i++){
        //     System.out.println(tempArr2[i]);
        // }

        //backslash text
        String back_slash="Hello, I'm \"quoted\"";
        System.out.println(back_slash);

        //length of a string
        int len=name.length();
        System.out.println("length of the string \"name\" is : "+len);

        //index of a char in string
        System.out.println("the index of character \"u\" in name is : " + name.indexOf('y'));
        //prints the first occurence of a character

        String mantra="abrakadabra";
        System.out.println("the index of character \"a\" from index 5 is: " + mantra.indexOf('a',1));
        int count=0;
        while(count!=-1){
            count=mantra.indexOf('a', count);
            if(count==-1)break;
            System.out.println("char \"a\" found at : "+(count+1));
            count++;
        }
    }
}
