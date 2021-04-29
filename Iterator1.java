import java.util.*;
class Iterator1
{
public static void main(String args[])
{
ArrayList<Integer> l=new ArrayList<>();
for(int i=1;i<=7;i++)
{
l.add(i);
}

System.out.println(l);
Iterator it=l.iterator();
while(it.hasNext())
{
int x=(Integer)it.next();

if(x%2==0)
{
it.remove();
}
}

System.out.println(l);
}
}