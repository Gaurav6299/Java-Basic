class Student
{
protected void dance()
{
System.out.println("Hello i am doing dance in parent");
}

private void show()
{
System.out.println("Private methods are not overridden");
}
}

class teacher extends Student
{
public void dance()
{
System.out.println("I am doing dance in child");
}

private void show()
{
System.out.println("hello how are you");
}
}

class turnMethod
{
public static void main(String args[])
{
Student s=new Student();
s.dance();
teacher t=new teacher();
t.dance();
}
}