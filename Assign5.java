class Collage
{
static String branch="CSE";
String name="gaurav";
static class Kumar
{
public void display()
{
System.out.println("the branch is:"+branch);
}
}

class Sujit
{
public void show()
{
System.out.print("Haii my name is:"+name);
System.out.println(" Branch is:"+branch);
}
}

}

class Assign5
{
public static void main(String args[])
{
Collage.Kumar out=new Collage.Kumar();
out.display();

Collage.Sujit s=new Collage().new Sujit();
s.show();
}
}