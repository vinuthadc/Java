package asess_package;

import java.io.IOException;

public class test_throws {
    void method_1 () throws IOException
    {
        throw new IOException(" Device error");
    }
    void method_2 () throws IOException
    {
        method_1();
    }
    void method_3()
    {
        try { method_2();}
        catch (Exception e)
        {
            System.out.println(("Exception Handled in method 3...."));
        }
    }
    public static void main(String[] args)
    {
        test_throws obj=new test_throws();
        obj.method_3();
        System.out.println(("Normal Flow..."));
    }
}
