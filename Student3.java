class Student
{
int roll;
int age;
Student(int roll,int age)
{
this.roll=roll;
this.age=age;
}

void print()
{
System.out.println("Roll="+roll+" Age="+age);
}
}

class Wrapper
{
Student s;
Wrapper(Student s)
{
this.s=s;
}
}

class Student3
{
static void swap(Wrapper w1,Wrapper w2)
{
Student temp=w1.s;
w1.s=w2.s;
w2.s=temp;
}

public static void main(String args[])
{
Student s1=new Student(10,20);
Student s2=new Student(7,8);
Wrapper w1=new Wrapper(s1);
Wrapper w2=new Wrapper(s2);
swap(w1,w2);
w1.s.print();
w2.s.print();
}
}