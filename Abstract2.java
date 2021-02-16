import java.util.*;
class Abstract2
{
public static void main(String args[])
{
AbstractSet<Integer> set=new TreeSet<>();
set.add(10);
set.add(11);
set.add(12);
set.add(8);
System.out.println(set);
if(set.contains(12))
{
System.out.println("Yes");
}
else
System.out.println("No");
}
}