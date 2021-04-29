import java.util.*;
class ListItr
{
public static void main(String args[])
{
ArrayList<Integer> l=new ArrayList<>();
for(int i=1;i<=6;i++)
{
l.add(i);
}

System.out.println(l);

Iterator i=l.iterator();
while(i.hasNext())
{
int x=(Integer)i.next();
System.out.println(x);
}

}
}