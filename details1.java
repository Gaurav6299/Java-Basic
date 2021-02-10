class Bank
{
String name;
Bank(String name)
{
this.name=name;
}

String getName()
{
return name;
}
}

class Emp
{
String name;
Emp(String name)
{
this.name=name;
}

String getName()
{
return name;
}
}

class details1
{
public static void main(String args[])
{
Emp e=new Emp("BOI");
Bank b=new Bank("Gaurav");
System.out.println("Name="+e.getName()+" Emp="+b.getName());
}
}