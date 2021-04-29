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
return("name="+name+" and Roll="+roll);
}

}

class Assign9
{
public static void main(String args[])
{
Collage c=new Collage("gaurav",153);
System.out.println(c);
}
}

