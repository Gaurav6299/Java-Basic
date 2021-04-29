class Bank
{
private String name;
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
private String EmpName;
Emp(String EmpName)
{
this.EmpName=EmpName;
}

String getEmpName()
{
return EmpName;
}
}

class Association
{
public static void main(String args[])
{
Emp e=new Emp("gaurav");
Bank b=new Bank("BOI");
System.out.println(e.getEmpName()+" is the employee of "+b.getName());
}
}