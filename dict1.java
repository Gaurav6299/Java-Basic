import java.util.*;
class dict1
{
public static void main(String args[])
{
Dictionary d=new Hashtable();
d.put(1,"gaurav");
d.put(2,"sujit");
d.put(3,"kumar");
System.out.println("Key and value is:"+d);

Enumeration e=d.elements();
while(e.hasMoreElements())
{
System.out.println(e.nextElement());
}
System.out.println("Size="+d.size());
System.out.println(d.get(2));
}
}