import java.util.*;
class removeAll
{
public static void main(String args[])
{
ArrayList<Integer> l=new ArrayList<>();
l.add(10);
l.add(20);
l.add(30);
l.add(40);

ArrayList<Integer> l1=new ArrayList<>();
l1.add(10);
l1.add(20);
l1.add(70);

l.removeAll(l1);
System.out.println("List is:"+l);
}
}