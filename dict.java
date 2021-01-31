import java.util.*;
class dict
{
public static void main(String args[])
{
Dictionary d=new Hashtable();
d.put("gaurav","cse");
d.put("sujit","kumar");
d.put("kushal","Das");
d.put("Ankit","Mech");
d.put("Aman","Collage");
System.out.println("The value is:"+d);

Enumeration e=d.elements();
while(e.hasMoreElements())
{
System.out.println(e.nextElement());
}
System.out.println("Size="+d.size());
System.out.println(d.get("gaurav"));
System.out.println(d.isEmpty());
d.remove("Ankit");
System.out.println("The dict is:"+d);
}
}