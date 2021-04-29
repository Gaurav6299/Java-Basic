class Outer
{
static String msg="gaurav";
static class  NestedClass
{
public void show()
{
System.out.println("I gonna so you something "+msg);
}
}


class InnerClass
{
public void display()
{
System.out.println("I am displaying:"+msg);
}
}

}

class Assign4
{
public static void main(String args[])
{
Outer.NestedClass out=new Outer.NestedClass();
out.show();

Outer.InnerClass in=new Outer().new InnerClass();
in.display();
}
}