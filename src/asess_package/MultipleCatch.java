package asess_package;

public class MultipleCatch {
    public static void main(String[] args)
    {
        try {
            int a[]=new int[5];
                System.out.println(a[10]);
            }
            catch(ArithmeticException e)
            {
                System.out.println("Arithmentic exception...");
            }
        catch (ArrayIndexOutOfBoundsException e)
        {System.out.println("ArrayIndexOutOfBoundsException....");
        }
        catch (Exception e)
        {
            System.out.println("Parent Exception");
        }
        System.out.println("multiple catch ended");
    }
}
