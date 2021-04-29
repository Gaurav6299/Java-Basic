class Student
{
void show()
{
System.out.println("I will show you something");

}

void show(byte a)
{
System.out.println("The value is:"+a);
}

void show(int a)
{
System.out.println("The value is:"+a);
}
}

class load
{
public static void main(String args[])
{
Student s=new Student();
s.show();
byte a=52;
s.show(a);
s.show(123);
}
}