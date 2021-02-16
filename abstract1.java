import java.util.*;
class abstract1
{
public static void main(String args[])
{
AbstractSet<Integer> set=new TreeSet<>();
set.add(12);
set.add(11);
set.add(4);
set.add(2);
System.out.println(set);
Iterator i=set.iterator();
while(i.hasNext())
{
System.out.println(i.next());
}

AbstractSet<Integer> set1=new TreeSet<>();
set1.add(10);
set1.add(5);
set1.add(4);
set1.add(6);

set.addAll(set1);
System.out.println(set);
set.removeAll(set1);
System.out.println(set);
}
}