abstract class  Shape
{
String color;
abstract double area();
public abstract String toString();

Shape(String color)
{
this.color=color;
}

public String getColor()
{
return color;
}
}


class Circle extends Shape
{
double radius;
Circle(String color,double radius)
{
super(color);
this.radius=radius;
}

double area()
{
return(Math.PI*Math.pow(radius,2));
}


public String toString()
{
return("Color is:"+super.getColor()+"  and area is:"+area());
}
}

class findArea
{
public static void main(String args[])
{
Circle c=new Circle("Blue",10);
System.out.println(c.toString());
}
}