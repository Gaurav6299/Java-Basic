class Student
{
private String name;
private int roll;

public void setName(String name)
{
this.name=name;
}

public void setRoll(int roll)
{
this.roll=roll;
}

public String getName()
{
return name;
}

public int getRoll()
{
return roll;
}
}

class Encap1
{
public static void main(String args[])
{
Student s=new Student();
s.setName("gaurav");
s.setRoll(10);
System.out.println("Name="+s.getName()+"Roll="+s.getRoll());
}
}