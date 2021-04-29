import java.io.*;
class Student implements Serializable
{
String name;
Student(String name)
{
this.name=name;
}
}

class Deserial1
{
public static void main(String args[])
{
Student s=new Student("kumar");
try
{
FileOutputStream f=new FileOutputStream("cat.txt");
ObjectOutputStream ob=new ObjectOutputStream(f);
ob.writeObject(s);
ob.close();
f.close();
}
catch(Exception e)
{
e.printStackTrace();
}

try
{
FileInputStream f1=new FileInputStream("cat.txt");
ObjectInputStream ob1=new ObjectInputStream(f1);
s=(Student)ob1.readObject();
ob1.close();
f1.close();
}
catch(Exception e)
{
e.printStackTrace();
}
System.out.println(s.name);
}
}
