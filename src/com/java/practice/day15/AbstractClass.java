abstract class A
{
    int a;

    public abstract void m1();
    
}

public class AbstractClass extends A{

    public void m1()
    {
        System.out.println("Overridden");
    }

    public static void main(String[] args)
    {
        AbstractClass ab = new AbstractClass();

        ab.m1();

        A a = new AbstractClass();

        a.m1();

    }

}