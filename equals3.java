class Student
{
String name;
int roll;
Student(String name,int roll)
{
this.name=name;
this.roll=roll;
}
public String toString()
{
return String.format(name+" "+roll);
}
}
class equals3
{
public static void main(String args[])
{
Student s1=new Student("gaurav",125);
System.out.println(s1);
}
}