import java.util.*;
class linkedHash1
{
public static void main(String args[])
{
LinkedHashSet<Integer> set=new LinkedHashSet<>();
set.add(1);
set.add(10);
set.add(12);
set.add(13);
System.out.println(set);
Iterator i=set.iterator();
while(i.hasNext())
{
System.out.println(i.next());
}
}
}