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
System.out.println("Roll="+roll+"Age="+age);
}
}

class wrapper
{
Student s;
wrapper(Student s)
{
this.s=s;
}
}

class Student4
{
static void swap(wrapper w1,wrapper w2)
{
Student temp=w1.s;
w1.s=w2.s;
w2.s=temp;
}
public static void main(String args[])
{
Student s1=new Student(20,30);
Student s2=new Student(100,200);
wrapper w1=new wrapper(s1);
wrapper w2=new wrapper(s2);
swap(w1,w2);
w1.s.print();
w2.s.print();
}
}