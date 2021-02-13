class Outer
{
static String s="kumar";
static class nestedClass
{
public void message()
{
System.out.println("The value is:"+s);
}
}

class InstanceClass
{
public void display()
{
System.out.println("My name is:"+s);
}
}

}

class StaticAndNon
{
public static void main(String args[])
{
Outer.nestedClass s=new Outer.nestedClass();
s.message();

Outer.InstanceClass s2=new Outer().new InstanceClass();
s2.display();
}
}