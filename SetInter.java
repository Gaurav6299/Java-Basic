import java.util.*;
class SetInter
{
public static void main(String args[])
{
Set<Integer> set=new HashSet<>();
set.add(10);
set.add(11);
set.add(12);
set.add(13);
Set<Integer> set1=new HashSet<>();
set1.add(10);
set1.add(11);
set1.add(12);
set1.add(1);
set.retainAll(set1);
System.out.println("the intersection is:"+set);

}
}