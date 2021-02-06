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

class Rectangle extends shape
{
int length;
int breadth;
Rectangle(String name,int length,int breadth)
{
super(name);
this.length=length;
this.breadth=breadth;
}

double area()
{
return length*breadth;
}

public String toString()
{
return("Name="+super.name+" Area="+ area());
}
}

class shape1
{
public static void main(String args[])
{
Rectangle r=new Rectangle("Rectangle",10,20);
System.out.println(r.toString());
}
}

