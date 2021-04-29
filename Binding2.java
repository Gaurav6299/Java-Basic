class Student
{
public static class Parent
{
static void show()
{
System.out.println("Hello parent Class");
}
}

public static class Child extends Parent
{
static void show()
{
System.out.println("Hello Child class");
}
}
}

class Binding2
{
public static void main(String args[])
{
Student.Parent p=new Student.Parent();
p.show();

Student.Parent p1=new Student.Child();
p1.show();
}
}