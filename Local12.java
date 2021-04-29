class Student
{
int a=10;

String name="gaurav";
Student()
{
int a=20;
String name="sujit";
System.out.println("The local value is:"+a);
System.out.println("the value is:"+this.a);
System.out.println("the name is:"+name);
System.out.println("the name instance is:"+this.name);
}
}

class Local12
{
public static void main(String args[])
{
Student s=new Student();
}
}