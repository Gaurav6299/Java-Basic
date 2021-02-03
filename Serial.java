import java.io.*;
class Serial implements Serializable
{
String name;
Serial(String name)
{
this.name=name;
}
public static void main(String args[])
{
try
{
Serial s=new Serial("kumar");
FileOutputStream file=new FileOutputStream("gaurav.txt");
ObjectOutputStream obj=new ObjectOutputStream(file);
obj.writeObject(s);

FileInputStream f=new FileInputStream("gaurav.txt");
ObjectInputStream ob=new ObjectInputStream(f);
Serial k=(Serial)ob.readObject();
System.out.println(k.name);

file.close();
obj.close();
}
catch(Exception e)
{
e.printStackTrace();
}

}
}