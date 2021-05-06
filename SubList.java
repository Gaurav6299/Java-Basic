import java.util.*;
class SubList
{
public static void main(String args[])
{
try
{
ArrayList<Integer> l=new ArrayList<>();
l.add(1);
l.add(2);
l.add(3);
l.add(4);
l.add(5);
System.out.println(l);
List<Integer> l1=l.subList(1,3);
System.out.println(l1);
}
catch(IndexOutOfBoundsException e)
{
System.out.println(e);
}

catch(IllegalArgumentException e)
{
System.out.println(e);
}

}
}