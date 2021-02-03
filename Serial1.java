import java.io.*;
class Serial1 implements Serializable
{
String Collage;
Serial1(String Collage)
{
this.Collage=Collage;
}
public static void main(String args[])
{
try
{
Serial1 s=new Serial1("Nalanda");
FileOutputStream f=new FileOutputStream("nit.txt");
ObjectOutputStream o=new ObjectOutputStream(f);
o.writeObject(s);

FileInputStream file=new FileInputStream("nit.txt");
ObjectInputStream ob=new ObjectInputStream(file);
Serial1 k=(Serial1)ob.readObject();
System.out.println(k.Collage);

f.close();
o.close();
}
catch(Exception e)
{
e.printStackTrace();
}

}
}