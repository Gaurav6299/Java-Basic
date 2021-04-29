class Student
{
int a;
int b;
Student(int a)
{
this(10,20);
System.out.println("Another constructor will called "+a);
}

Student(int a,int b)
{
System.out.println("a="+a+" and b="+b);
}

}

class kumarThis
{
public static void main(String args[])
{
Student s=new Student(12);
}
}