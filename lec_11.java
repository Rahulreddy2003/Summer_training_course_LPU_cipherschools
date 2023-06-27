abstract class Car // We cannot instantiate an abstract class, which means we cannot create objects of an abstract class
{
    int maxSpeed;
    abstract void accelerate(); // Only Declared but not implemented it is without a body
    // They are created to force the child classes to implement them before using, We will use them after overriding
    abstract void brake();
}

abstract class BMW extends Car {
    void accelerate() {
        System.out.println("BMW is accelerating");
    }
}

class BMW2 extends BMW {
    void brake() {
        System.out.println("BMW is applying brakes");
    }
}
abstract class A{ // an abstract class can exist without abstract methods.
    // We simply mean we will not be able to create object[instantiate] of this class.
    int x=10;
    void fun()
    {
        System.out.println("Hello , I', A");
    }
}

public class lec_11 {
    public static void main(String[] args) {
        // Car c= new Car(); //Cannot instantiate an abstract class
        // BMW beemer=new BMW();
        // beemer.accelerate();
        BMW2 b = new BMW2();
        b.accelerate();
        b.brake();

    }
}
