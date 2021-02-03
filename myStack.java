import java.util.*;
class myStack
{
public static void main(String args[])
{
Vector<Integer> v=new Vector<>();
v.add(10);
v.add(20);
v.add(30);
v.add(40);
System.out.println("Vector is:"+v);
v.remove(2);
System.out.println("Vector is:"+v);
for(int i=0;i<v.size();i++)
{
System.out.println("Elements in vector:"+v.get(i));
}
v.add(1,60);
System.out.println(v);
v.set(1,90);
v.set(2,100);
System.out.println(v);
System.out.print("iterating through vector:");
Iterator i=v.iterator();
while(i.hasNext())
{
System.out.println(i.next());
}
}
}