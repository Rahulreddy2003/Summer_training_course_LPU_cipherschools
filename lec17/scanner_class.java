import java.util.Scanner;
public class scanner_class {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name : ");
        String f_name=sc.next();// will take input untill the next whitespace
        String l_name=sc.next();
        System.out.println("Enter your profession : ");
        String prof=sc.next();
        sc.nextLine();
        System.out.println("Enter your Address : ");
        String pata=sc.nextLine();
        System.out.println("Name : "+f_name+""+ l_name);
        System.out.println("Profession : "+prof);
        System.out.println("Address : "+pata);
    }
}
