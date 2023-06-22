import java.util.*;
// class Car{
//     String name;
//     String color;
//     int year ;
//     int maxspeed;
//     void accelerate(){
//         System.out.println("Car is accelerating");
//     }
// }
// public class lec_7 {
//     public static void main(String[] args){
//         Car c=new Car();
//         System.out.println(c.name);
//         System.out.println(c.color);
//         System.out.println(c.year);
//         System.out.println(c.maxspeed);
//     }
// } 

// Counter Flow--------------------------
class Student {
    String name;
    int marks;

    boolean is_pass() {
        return marks > 40 ? true : false;
    }
}

public class lec_7 {
    int findMax(int a, int b, int c) {
        int max = a;

        if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }
        return max;
    }

    public static void main(String args[]) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.name = "Suryansh";
        s1.marks = 30;
        s2.name = "Sushant";
        s2.marks = 90;
        System.out.println(s1.is_pass());
        System.out.println(s2.is_pass());

        lec_7 l=new lec_7();
        System.out.println("The Max of three numbers is : " +l.findMax(2, 5, 7));
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a Character : ");
        char c=sc.next().charAt(0);
        switch (c) {
            case 'a':
                System.out.println("Hi,I'm a");
                break;
            case 'b':
                System.out.println("Hi,I'm b");
                break;
            case 'c':
                System.out.println("Hi,I'm c");
                break;
            default:
                System.out.println("neither a, nor b or c");
                break;
        }

    }
}
