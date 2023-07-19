public class lec_5 {
    public static void main(String args[]) {
        float f = (float) 5.5; // by default considers decimal to be double
        double d = 10.5;
        float f2 = 5.5f;
        char ch = 'a';
        int x=5;
        int y=9;
        int z=x+y; //here '+' is an operator rest are operands
        System.out.println("sum is : "+ z);
        System.out.println("char is : " + ch);
        System.out.println("f is : " + f);
        System.out.println("f2 is : " + f2);
        System.out.println("d is : " + d);

        //Increment and Decrement Operators
        //x++; post-increment;
        System.out.println("Post-Increment of x is x++ : "+ x++);

        //++x; pre-increment;
        System.out.println("Pre-Increment of x is ++x : "+ ++x);
        
        //Similarly for decrement 
    
    }
}
