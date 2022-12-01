package asess_package;

public class nested_try_catch {
    public static void main(String[] args) {
        try {
            try {
                System.out.println("Going to divide");
                int b = 90 / 0;
            }
            catch (ArithmeticException e) {
                System.out.println(e);
            }
            try {
                int a[] = new int[5];
                a[8] = 4;
                System.out.println(a[4]);
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException.........");
            }

            System.out.println(("Inside of first try block"));
        } catch (Exception e) {
            System.out.println("handled");
        }
        System.out.println("Normal flow");
    }
}
