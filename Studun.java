class Student
{
String name;
int age;
String branch;
Student(String name,int age,String branch)
{
this.name=name;
this.age=age;
this.branch=branch;
}

String getName()
{
return name;
}

int getAge()
{
return age;
}

String getBranch()
{
return branch;
}

public String toString()
{
return ("Name="+this.getName()+" Age="+this.getAge()+" Branch="+this.getBranch());
}


}

class Studun
{
public static void main(String args[])
{
Student s=new Student("gaurav",153,"CSE");
System.out.println(s.toString());
}
}