import java.util.*;
class ReverseOrder
{
public static void main(String args[])
{
List<Integer> l=new ArrayList<>();
l.add(10);
l.add(5);
l.add(20);
l.add(15);
l.add(25);
System.out.println(l);
Collections.sort(l,Collections.reverseOrder());
System.out.println(l);
}
}