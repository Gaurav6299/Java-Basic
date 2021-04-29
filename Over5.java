class Student
{
protected void run()
{
System.out.println("Hello i am parent");
}

void show()
{
System.out.println("I am child");
}
}

class Collage extends Student
{
protected void run()
{
System.out.println("hello chutiya child");
}

void show()
{
System.out.println("I want to display something");    
}
}

class Over5
{
public static void main(String args[])
{
Student s=new Student();
s.run();

Student s2=new Collage();
s2.show();
}
}