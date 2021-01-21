import java.util.*;
class linkedHashSet
{
public static void main(String args[])
{
LinkedHashSet<Integer> set=new LinkedHashSet<>();
set.add(10);
set.add(12);
set.add(11);
set.add(9);
System.out.println("the set is:"+set);

System.out.println("the first element is remove:"+set.remove(10));
}
}