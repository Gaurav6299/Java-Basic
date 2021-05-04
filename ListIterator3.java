import java.util.*;
class ListIterator3
{
public static void main(String args[])
{
ArrayList<Integer> l=new ArrayList<>();
for(int i=1;i<=5;i++)
{
l.add(i);
}
System.out.println(l);
ListIterator li=l.listIterator();
while(li.hasNext())
{
int k=(Integer)li.next();

while(k%2==0)
{
k++;
li.set(k);
li.add(k);
}
}
System.out.println(l);
}
}