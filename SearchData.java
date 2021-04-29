import java.util.*;
class SearchData
{
public static void main(String args[])
{
ArrayList<Integer> l=new ArrayList<>();
l.add(10);
l.add(20);
l.add(30);
l.add(40);
System.out.println(l);
int index=Collections.binarySearch(l,35);
System.out.println(index);
int x=Collections.binarySearch(l,40);
System.out.println(x);

Integer a[]={12,13,22,11,15};
int k=Collections.binarySearch(Arrays.asList(a),11);
}
}