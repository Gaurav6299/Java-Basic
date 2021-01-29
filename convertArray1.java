import java.util.*;
class convertArray1
{
public static void main(String args[])
{
ArrayList<Integer> l=new ArrayList<>();
l.add(10);
l.add(5);
l.add(3);
l.add(5);

Object b[]=l.toArray();
System.out.println(Arrays.toString(b));
}
}