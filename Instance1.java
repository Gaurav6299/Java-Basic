class Student
{
int roll;
int regd;
Student()
{
roll=153;
regd=1;
}

Student Test()
{
return this;
}

void display()
{
System.out.println("Roll="+roll+ " and Regd="+regd);
}
}

class Instance1
{
public static void main(String args[])
{
Student s=new Student();
s.Test().display();
}
}