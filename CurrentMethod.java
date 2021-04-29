class Student
{
String name;
String branch;
Student(String name,String branch)
{
this.name=name;
this.branch=branch;
}

void eat()
{
System.out.println("Call to another mathod");
this.display();
}

void display()
{
System.out.println("Name="+this.name+" and branch="+branch);
}
}

class CurrentMethod
{
public static void main(String args[])
{
Student s=new Student("kumar","cse");
s.eat();
}
}