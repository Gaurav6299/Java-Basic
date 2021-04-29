import java.util.*;
class Collect
{
public static void main(String args[])
{
int a[]=new int[]{1,2,3,4,5};
Vector<Integer> v=new Vector<>();
Hashtable<Integer,String> ht=new Hashtable<>();
v.addElement(2);
v.addElement(4);
v.addElement(5);
System.out.println("Vector is:"+v);
System.out.println(v.elementAt(2));

ht.put(1,"gaurav");
ht.put(2,"sujit");
System.out.println(ht.get(2));
}
}