import java.util.*;
class Enumeration1
{
public static void main(String args[])
{
Vector v=new Vector();
v.addElement("sujit");
v.addElement("kumar");
v.addElement("kushal");
v.addElement("gaurav");
System.out.println(v);

Enumeration e=v.elements();
while(e.hasMoreElements())
{

String k=(String)e.nextElement();
System.out.println(k);
}
}
}
