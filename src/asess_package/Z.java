package asess_package;
//Multi level inheritance
public class Z extends Y
    //if Z extends to X, it's called Heirarchial inheritance as X is parent to Y and Z
{
    public void methodZ()
    {
        System.out.println("This is class Z");
    }
    public static void main(String[] args)
    {
        Z obj=new Z();
        obj.methodX();
        obj.methodY();
        obj.methodZ();

    }
}
