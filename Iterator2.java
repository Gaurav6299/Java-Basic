import java.util.*;
class Iterator2
{
public static void main(String args[])
{
ArrayList<Integer> l=new ArrayList<>();
l.add(10);
l.add(20);
l.add(30);
l.add(40);
System.out.println(l);
Iterator i=l.iterator();
while(i.hasNext())
{
System.out.print(i.next()+" ");
}
System.out.println();

ListIterator li=l.listIterator();
while(li.hasPrevious())
{
System.out.println(li.previous());
}
}
}