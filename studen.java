import java.util.*;
class Student
{
String name;
int roll;
String dept;
Student(String name,int roll,String dept)
{
this.name=name;
this.roll=roll;
this.dept=dept;
}
}

class Department
{
String name;
List<Student> l;
Department(List<Student> l,String name)
{
this.l=l;
this.name=name;
}

List<Student> getStudent()
{
return l;
}
}

class Institute
{
String name;
List<Department> dept;
Institute(String name,List<Department> dept)
{
this.name=name;
this.dept=dept;
}

int getTotalStudent()
{
int noOfStudent=0;
for(Department d:dept)
{
List<Student> l=d.getStudent();
for(Student s:l)
{
noOfStudent+=1;
}
}
return noOfStudent;
}
}

class studen
{
public static void main(String args[])
{
Student s1=new Student("gaurav",153,"CSE");
Student s2=new Student("kumar",156,"CSE");
Student s3=new Student("Ankit",145,"MECH");
Student s4=new Student("vikash",12,"MECH");

List<Student> cse=new ArrayList<>();
cse.add(s1);
cse.add(s2);

List<Student> mech=new ArrayList<>();
mech.add(s3);
mech.add(s4);

Department  CSE=new Department(cse,"CSE");
Department MECH=new Department(mech, "MECH");

List<Department> dept=new ArrayList<>();
dept.add(CSE);
dept.add(MECH);

Institute ins=new Institute("NIT",dept);
System.out.println("Toatal number of student is:"+ins.getTotalStudent());
}
}

