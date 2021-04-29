import java.util.*;
class ListIterator1
{
public static void main(String args[])
{
ArrayList<Integer> l=new ArrayList<>();
for(int i=1;i<=6;i++)
{
l.add(i);
}
ListIterator li=l.listIterator();
while(li.hasNext())
{
int y=(Integer)li.next();
System.out.println(y);
System.out.println("Index="+li.nextIndex());
}
}
}