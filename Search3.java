import java.util.*;
class Search3
{
public static void main(String args[])
{
ArrayList<Integer> l=new ArrayList<>();
l.add(10);
l.add(20);
l.add(24);
l.add(30);
l.add(40);
l.add(20);
l.add(24);
System.out.println(l);

int index=Collections.binarySearch(l,24,Collections.reverseOrder());
System.out.println(index);
}
}