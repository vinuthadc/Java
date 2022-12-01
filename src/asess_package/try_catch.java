package asess_package;

import java.sql.SQLOutput;

public class try_catch {
    public static void main(String[] args){
        int n1=20,n2=0, division;
        try {
            System.out.println(("This is try block"));
            division=n1/n2;
            System.out.println(" Result:"+division);

        }
       catch(ArithmeticException e)
        {

            System.out.println("Arithmentic exception--Cant divide by zero");
        }
        catch (Exception e)
        {
            //e.printStackTrace();
            System.out.println("General exception occured");
        }

        System.out.println("End of try catch block");
    }
}
