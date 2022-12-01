package Geometric;

import java.util.ArrayList;

class Geo_area {

    public void display(String shape, double result)
    {
        System.out.println("Area "+ shape +"=" + result);
    }
    public static void main(String[] args) {
        square s = new square();
        double sq_area=s.sq(5);
        Circle c = new Circle();
        double cir_area=c.Circle(10.9);
        Rectangle r = new Rectangle();
        double Rec_area=r.Rect(20, 30);

        ArrayList obj=new ArrayList ();
        obj.add(sq_area);
        obj.add(cir_area);
        obj.add(Rec_area);
        System.out.println("\nThe entire array list is:");
        System.out.println(obj);

        System.out.println("\nArray list using loop");

        //Iterator itr = obj.iterator();
       //while (itr.hasNext())
        //for(int i=0; i<obj.size();i++)
          for(Object k:obj)

            try
            {
                //System.out.println(itr.next());
                //System.out.println(obj.get(i));
                System.out.println(k);

            }
            catch (Exception e)
            {
                System.out.println("error");
            }
        // finally {System.out.println("Finally block");}
    }

}
