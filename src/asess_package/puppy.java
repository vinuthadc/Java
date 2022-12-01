package asess_package;

public class puppy {
   public  puppy() //This default constructor
    {
        System.out.println("default constructor");
    }
    public puppy(String Name)//parameterised constructor
    {
        System.out.println(("puppy name is;"+ Name));
    }
     public static void main(String[] args)
     {
         //puppy obj=new puppy();
         puppy obj=new puppy("Tommy");

     }
}
