import java.util.*;
class SetClass
{
public static void main(String args[])
{
Set<Integer> set=new HashSet<>();
set.add(10);
set.add(12);
set.add(13);
set.add(14);
System.out.println("Set1 is :"+set);

Set<Integer> set1=new HashSet<>();
set1.add(12);
set1.add(10);
set1.add(11);
set1.add(1);
System.out.println("Set2 is :"+set1);

set.addAll(set1);
System.out.println("The value is:"+set);
}
}