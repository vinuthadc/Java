package Geometric;

class Circle extends Geo_area {
    double Circle(double r){
        System.out.println("\nDimension of circle:Radius-->"+r);
        super.display("Circle", 3.14 * r * r);
        return 3.14*r*r;
    }
}
