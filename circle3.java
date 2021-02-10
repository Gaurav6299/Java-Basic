abstract class shape
{
String name;
abstract double area();
public abstract String toString();
shape(String name)
{
this.name=name;
}

String getName()
{
return name;
}
}

class Circle extends shape
{
double radius;
Circle(double radius,String name)
{
super(name);
this.radius=radius;
}

double area()
{
return Math.PI*Math.pow(radius,2);
}

public String toString()
{
return("Name="+super.name+" Area=="+area());
}
}

class circle3
{
public static void main(String args[])
{
Circle c=new Circle(287.2,"Circle");
System.out.println(c.toString());
}
}
