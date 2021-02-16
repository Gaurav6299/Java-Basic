import java.util.*;
class diff
{
public static void main(String args[])
{
Set<Integer> set=new HashSet<>();
set.add(1);
set.add(2);
set.add(3);
Set<Integer> set1=new HashSet<>();
set1.add(1);
set1.add(2);
set1.add(4);
set.removeAll(set1);
System.out.println(set);
}
}