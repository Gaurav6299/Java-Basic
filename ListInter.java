import java.util.*;
class ListInter
{
public static void main(String args[])
{
List<Integer> l=new ArrayList<>();
l.add(1);
l.add(20);
l.add(30);
l.add(40);
System.out.println(l);

List<Integer> l1=new ArrayList<>();
l1.add(0,40);
l1.add(1,50);
l1.add(2,60);
System.out.println(l1);
l.addAll(0,l1);
System.out.println(l);
l.set(0,90);
System.out.println(l);
l.set(2,100);
System.out.println(l);
l.remove(2);
System.out.println(l);
l.remove(3);
System.out.println(l);
l.remove(2);
System.out.println(l);
}
}