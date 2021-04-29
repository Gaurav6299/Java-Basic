class Student
{
int a;
int b;
Student(int a,int b)
{
this.a=a;
this.b=b;
}

public String toString()
{
return("a="+a+" and b="+b);
}
}

class Assign8
{
public static void main(String args[])
{
Student s1=new Student(10,20);
System.out.println(s1);
}
}