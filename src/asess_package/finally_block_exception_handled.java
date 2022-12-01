package asess_package;

public class finally_block_exception_handled {
    public static void main (String[] args)
    {
        try {
            int number = 20 / 2;
            System.out.println("Result:"+number);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        finally {
            System.out.println("Finally block is always executed:");
        }
        System.out.println("....End of main...");
    }
}
