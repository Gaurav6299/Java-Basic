class Collage
{
String name;
int roll;
Collage(String name,int roll)
{
this.name=name;
this.roll=roll;
}

public String toString()
{
return String.format(name+" "+roll);
}

}

class equals4
{
public static void main(String args[])
{
Collage c=new Collage("gaurav",10);
System.out.println(c);
}
}