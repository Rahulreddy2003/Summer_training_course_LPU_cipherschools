// package lec_13A;
class demo{
    private int a=5;
    private int b=15;
    private int c=35;
    private int d=53;
    public int get_A(){
        System.out.println("Value of a is : ");
        return this.a;
    }
    public int get_B(){
        System.out.println("Value of b is : ");
        return this.b;
    }
    public void set_A(int a){
        //we can manipulate the private variables using encapsulation
        if(a>50){
            this.a=a;
            System.out.println("Value of a changed to : "+a);
        }
        else{
            System.out.println("Value can't be changed");
        }
    }
    public void set_B(int b){
        this.b=b;
    }
}
public class encapsulation {
    public static void main(String[] args) {
        demo obj=new demo();
        System.out.println(obj.get_A());
        obj.set_A(69);
        System.out.println(obj.get_A());

    }
}
