abstract class sujit
{
String color;
abstract double area();
public abstract String toString();

sujit(String color)
{
this.color=color;
}

String getColor()
{
return color;
}
}

class Circle extends sujit
{
double radius;
Circle(String color,double radius)
{
super(color);
this.radius=radius;
} 

double area()
{
return Math.PI*Math.pow(radius,2);
}

public String toString()
{
return("Color= "+super.color+" Area="+area());
}
}

class circle1
{
public static void main(String args[])
{
Circle c=new Circle("blue",2.3);
System.out.println(c.toString());
}
}
