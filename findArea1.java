abstract class Shape
{
String shape;
abstract double area();
public abstract String toString();

Shape(String shape)
{
this.shape=shape;
}

public String getShape()
{
return shape;
}

}

class Rectangle extends Shape
{
int length;
int breadth;
Rectangle(String shape,int length,int breadth)
{
super(shape);
this.length=length;
this.breadth=breadth;
}

double area()
{
return(0.5*length*breadth);
}

public String toString()
{
return("Shape="+super.getShape()+" and area is:"+area());
}
}

class findArea1
{
public static void main(String args[])
{
Rectangle r=new Rectangle("rectangle",10,20);
System.out.println(r.toString());
}
}