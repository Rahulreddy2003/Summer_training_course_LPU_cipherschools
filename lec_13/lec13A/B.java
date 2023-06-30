public class B {
    public static void main(String[] args) {
        A obj=new A();
        System.out.println(obj.x); // default is accessible within same package
        System.out.println(obj.y); // Protected is accessible within same package
        // System.out.println(obj.z); private is Unaccessible within same package and subclass
        System.out.println(obj.d); // public is accessible everywhere
    }
}
