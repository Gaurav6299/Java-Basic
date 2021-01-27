import java.util.*;
class traingle
{
static int arrayTraingle(List<List<Integer>> l)
{
List<Integer> list=new ArrayList(l.get(l.size()-1));

for(int i=l.size()-2;i>=0;i--)
{
for(int j=0;j<i+1;j++)
{
int x=l.get(i).get(j)+Math.min(list.get(j),list.get(j+1));
list.add(j,x);
System.out.println(list);
}
}

return 0;
}
public static void main(String args[])
{
List<List<Integer>> l=new ArrayList<>();
List<Integer> l1=new ArrayList<>();
l1.add(-1);
l.add(new ArrayList(l1));
List<Integer> l2=new ArrayList<>();
l2.add(2);
l2.add(3);
l.add(new ArrayList(l2));

List<Integer> l3=new ArrayList<>();
l3.add(1);
l3.add(-1);
l3.add(-3);

l.add(new ArrayList(l3));
System.out.println(arrayTraingle(l));
}
}