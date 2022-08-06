/*
Created by Kaivan Shah 21CE125
Design a class named Circle containing following attributes and behavior.
Onedouble data field named radius. The default valueis1.
A no-argumentconstructor that creates a default circle.
A Single argument constructor that creates a Circle with the specified radius.•A method named getArea() that returns area of the Circle.
A method named getPerimeter() that returns perimeterof it.

*/
class Cylinder
{
    double radius;
    double height;
    Cylinder()
    {
        radius  = 1;
        height  = 1;
    }
    Cylinder(double x)
    {
        radius = x;
    }
    Cylinder(double x , double y)
    {
        radius = x;
        height = y;
    }
    double getarea()
    {
        return 2 * radius * Math.PI * (radius + height);
    }
}

class Main{
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder(3.4 , 4.5);
        System.out.println("Area - " + c1.getarea());
        System.out.println("21ce125 Kaivan Shah");
    }
}
