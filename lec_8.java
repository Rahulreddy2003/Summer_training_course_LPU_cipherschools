// loops------------------
public class lec_8 {
    public static void main(String args[]){
        int i;

        // FOR LOOP
        for(i=1;i<=100;i++){  //loop will break if i=101
            System.out.println(i);
        }
        System.out.println("Final value if i is : " + i);

        // WHILE LOOP
        int n=5;
        while(n>0){
            System.out.println("Hello");
            n--;
        }
        System.out.println("After while loop, n is : "+n);

        // DO WHILE LOOP
        int p=5;
        do {
            System.out.println(p);
            p--;
        } while (p>0);
        System.out.println("After DO-While loop, p is : "+p);
    }
}
