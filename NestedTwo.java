class outer
{
static String s="gaurav";

static class nested
{
public void run()
{
System.out.println(s+" is run very fast");
}
}

class inner
{
public void dance()
{
System.out.println(s+" is doing dance very well");
}
}
}

class NestedTwo
{
public static void main(String args[])
{
outer.nested s=new outer.nested();
s.run();

outer.inner s1=new outer().new inner();
s1.dance();
}
}