import java.io.*;
class Serialize5 implements Serializable
{
String name;
Serialize5(String name)
{
this.name=name;
}
public static void main(String args[])
{
try
{
Serialize5 s=new Serialize5("gaurav");
FileOutputStream file=new FileOutputStream("prem.txt");
ObjectOutputStream obj=new ObjectOutputStream(file);
obj.writeObject(s);

FileInputStream f=new FileInputStream("prem.txt");
ObjectInputStream ob=new ObjectInputStream(f);
s=(Serialize5)ob.readObject();
System.out.println(s.name);
obj.close();
file.close();

}
catch(Exception e)
{
e.printStackTrace();
}

}
}



