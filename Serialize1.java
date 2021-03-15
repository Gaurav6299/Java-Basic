import java.io.*;
class Serialize1 implements Serializable
{
String name;
Serialize1(String name)
{
this.name=name;
}

public static void main(String args[])
{
try
{
Serialize1 s=new Serialize1("kushal");
FileOutputStream file=new FileOutputStream("viko.txt");
ObjectOutputStream ob=new ObjectOutputStream(file);
ob.writeObject(s);

FileInputStream f=new FileInputStream("viko.txt");
ObjectInputStream o=new ObjectInputStream(f);
s=(Serialize1)o.readObject();
System.out.println(s.name);
ob.close();
file.close(); 
}
catch(Exception e)
{
e.printStackTrace();
}

}
}