package Geometric;

class Rectangle extends Geo_area {
    double Rect(double l, double b){

        System.out.println("\nDimension of Rectangle:"+l+" and "+b);
        super.display("Rectangle", l * b);
        return l*b;
    }
}