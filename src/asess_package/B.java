package asess_package;
// This class inherits class A-- single inheritance
public class B extends A{
    public void methodB()
    {
        System.out.println("This class B ");
    }
    public static void main(String[] args)
    {
        B obj=new B();
        obj.methodA();//calling the method which is in classA
        obj.methodB();
    }
}
