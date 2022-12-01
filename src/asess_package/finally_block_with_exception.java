package asess_package;

public class finally_block_with_exception {
    public static void main (String[] args)
    {
        try {
            int number = 20/0;
            System.out.println("Result:"+number);
        }
        catch(NullPointerException e) //It's not NullPointerException
        {
            System.out.println(e);
        }
        finally {
            System.out.println("Finally block is always executed:");
        }
        System.out.println("....End of main...");
    }
}
