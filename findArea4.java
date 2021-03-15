abstract class Shape
{
String shape;
abstract double area();
public abstract String toString();
Shape(String shape)
{
this.shape=shape;
}

String getShape()
{
return shape;
}
}

class Square extends Shape
{
double side;
Square(String shape,double side)
{
super(shape);
this.side=side;
}

double area()
{
return Math.pow(side,2);
}

public String toString()
{
return("Shape="+super.getShape()+" area="+area());
}
}

class findArea4
{
public static void main(String args[])
{
Square s=new Square("square",10);
System.out.println(s.toString());
}
}