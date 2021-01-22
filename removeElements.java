import java.util.*;
class removeElements
{
public static void main(String args[])
{
ArrayList<Integer> l=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,4,4));
ArrayList<Integer>l1=new ArrayList<>();
Iterator i=l.iterator();
while(i.hasNext())
{
Integer k=(Integer)i.next();
if(k==4)
{
l1.add(k);
}
}
l.removeAll(l1);
System.out.println("the list is:"+l);
}
}