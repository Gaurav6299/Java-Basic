import java.util.*;
class ArrayList2
{
public static void main(String args[])
{
ArrayList<Integer> l=new ArrayList<>();
l.add(0,120);
l.add(1,100);
l.add(2,400);
l.add(3,500);
System.out.println(l);
l.remove(2);
System.out.println(l);
l.set(0,12);
System.out.println(l);

ArrayList<Integer> l1=new ArrayList<>();
l1.addAll(l);
System.out.println("L1="+l1);

Iterator i=l.iterator();
while(i.hasNext())
{
System.out.println(i.next());
}
}
}