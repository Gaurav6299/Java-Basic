class Collage
{
String name;
Collage(String name)
{
this.name=name;
}

String getName()
{
return name;
}
}

class sujit
{
String empName;
sujit(String empName)
{
this.empName=empName;
}

String getEmp()
{
return empName;
}
}

class details2
{
public static void main(String args[])
{
Collage c=new Collage("Google");
sujit s=new sujit("gaurav");
System.out.println(s.getEmp()+" is an  Emp of "+c.getName());
}
}