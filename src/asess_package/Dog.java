package asess_package;

public class Dog {
    String breed;
    int age;
    String color;
    void bark(String Brd)
    {
     this.breed=Brd;
        System.out.println(Brd+"::Doesn't bark much");
    }
    void hungry(int Age)
    {
        System.out.println("Dog's age is::"+Age);

    }
    void sleep(String color)
    {
        System.out.println(("Color is not related to sleep pattern::"+color));

    }
    public static void main(String[] args) {
        {
            Dog obj=new Dog();
            obj.bark("Afghan Hound");
            obj.hungry(5);
            obj.sleep("brown");
        }

    }
}
