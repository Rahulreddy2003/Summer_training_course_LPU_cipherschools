public class A{
    int x=20; // default or pacakge privat
    protected int y=45;
    private int z=57;
    public int d=99;

    public static void main(String[] args) {
        A obj=new A();
        System.out.println(obj.x);
        System.out.println(obj.y);
        System.out.println(obj.z);
        System.out.println(obj.d);
    }
}
