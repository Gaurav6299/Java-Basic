class Student
{
Teacher12 t;
Student(Teacher12 t)
{
this.t=t;
t.display();
}
}

class Teacher12
{
Teacher12()
{
Student s=new Student(this);
}

void display()
{
System.out.println("hello how are you");
}

public static void main(String args[])
{
Teacher12 t=new Teacher12();
}
}