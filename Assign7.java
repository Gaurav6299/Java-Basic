class Outer
{
static String name="gaurav";
static class Parent
{
public void eat()
{
System.out.println("hello parent inside outer:"+name);
}
}

class Inner
{
public void run()
{
System.out.println("The name is:"+name);
}

}
}

class Assign7
{
public static void main(String args[])
{
Outer.Parent out=new Outer.Parent();
out.eat();

Outer.Inner in=new Outer().new Inner();
in.run();
}
}