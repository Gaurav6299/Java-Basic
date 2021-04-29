import java.util.*;
class Student
{
String name;
int id;
String dept;
Student(String name,int id,String dept)
{
this.name=name;
this.id=id;
this.dept=dept;
}
}

class Department
{
List<Student> student;
String name;
Department(String name,List<Student> student)
{
this.name=name;
this.student=student;
}

List<Student> getStudent()
{
return student;
}
}

class Institute
{
List<Department> dept;
String name;
Institute(String name,List<Department> dept)
{
this.name=name;
this.dept=dept;
}

int getTotalStudentInInstitute()
{
int noOfStudent=0;
List<Student> student;
for(Department d:dept)
{
student=d.getStudent();
for(Student s:student)
{
noOfStudent++;
}
}
return noOfStudent;
}
}



class Agression
{
public static void main(String args[])
{
Student s1=new Student("gaurav",153,"CSE");
Student s2=new Student("Kushal",156,"CSE");
Student s3=new Student("vikash",253,"MECH");
Student s4=new Student("Ankit",254,"MECH");

List<Student> cse=new ArrayList<>();
cse.add(s1);
cse.add(s2);

List<Student> mech=new ArrayList<>();
mech.add(s2);
mech.add(s3);

Department d1=new Department("CSE",cse);
Department d2=new Department("MECH",mech);

List<Department> dept=new ArrayList<>();
dept.add(d1);
dept.add(d2);

Institute ins=new Institute("NIT",dept);
System.out.println("Total Studnet in institute="+ins.getTotalStudentInInstitute());
}
}