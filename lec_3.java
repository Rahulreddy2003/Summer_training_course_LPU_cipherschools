class lec_3{
    public static void main(String args[]){
        int x=5;
        int y=6;
        System.out.println("the value of x is : "+x);
        System.out.println("the value of y is : "+y);

        byte b=10;
        System.out.println("value of b is : "+ b);

        //widening(Narrowing/Upcasting)
        int i=b;
        System.out.println("Value of i is : "+i);

        byte b2=(byte)129; //Implicit Typecasting or Narrowing or Down-casting
        System.out.println("b2 is : "+b2);

        byte b3=(byte)256; 
        System.out.println("b2 is : "+b3);
    }
}
