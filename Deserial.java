import java.io.*;
class Deserial implements Serializable
{
String name;
Deserial(String name)
{
this.name=name;
}
public static void main(String  args[])
{
Deserial d1=new Deserial("gaurav");
try
{
FileOutputStream out=new FileOutputStream("dog.txt");
ObjectOutputStream obj=new ObjectOutputStream(out);
obj.writeObject(d1);

FileInputStream f1=new FileInputStream("dog.txt");
ObjectInputStream ob=new ObjectInputStream(f1);
d1=(Deserial)ob.readObject();

obj.close();
out.close();
}
catch(Exception e)
{
e.printStackTrace();
}
System.out.println(d1.name);
}
}