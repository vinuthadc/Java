package asess_package;

public class test_throw {
    static void test_throw(int age) // As this static, we dont need object to call this method
    {
        if(age<18)
            throw new ArithmeticException(" Too Young to Vote");
        else System.out.println(" You can vote");
    }
    public static void main(String[] args)
    {
      test_throw(15);
    }
}
