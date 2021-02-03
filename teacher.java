class Student
{
int roll;
String name;
Student(int roll,String name)
{
this.roll=roll;
this.name=name;
}

public int getRoll()
{
return roll;
}

public String getName()
{
return name;
}
}

class teacher
{
public static void main(String args[])
{
Student s=new Student(1,"sujit");
System.out.println("Roll="+s.getRoll()+"Name="+s.getName());
}
}