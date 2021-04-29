class Collage
{
String name;
Collage(String name)
{
this.name=name;
}
String getName()
{
return name;
}
}

class Student
{
String sName;
Student(String sName)
{
this.sName=sName;
}

String getStudentName()
{
return sName;
}
}

class Associa
{
public static void main(String args[])
{
Student s=new Student("kumar");
Collage c=new Collage("NIT");

System.out.println(s.getStudentName()+" is the Student of "+c.getName());
}
}
