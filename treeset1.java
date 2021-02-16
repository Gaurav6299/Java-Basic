import java.util.*;
class treeset1
{
public static void main(String args[])
{
Set<Integer> set=new TreeSet<>();
set.add(10);
set.add(2);
set.add(1);
set.add(3);
System.out.println(set);
Iterator i=set.iterator();
while(i.hasNext())
{
System.out.println(i.next());
}
Iterator i1=set.descendingIterator();
while(i1.hasNext())
{
System.out.println(i1.next());
}
}
}