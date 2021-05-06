import java.util.*;
class RemoveData
{
public static void main(String args[])
{
List<Integer> l=new ArrayList<>();
l.add(10);
l.add(1);
l.add(2);
l.add(3);
l.add(4);
l.add(5);
System.out.println(l);
l.subList(1,3).clear();
System.out.println(l);
}
}