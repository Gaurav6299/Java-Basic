class Student
{
int a;
int b;
Student()
{
a=10;
b=20;
}

Student run()
{
return this;
}

void display()
{
System.out.println("The a="+a+ " and b="+b);
}
}

class CurrentInstance
{
public static void main(String args[])
{
Student s=new Student();
s.run().display();

}
}