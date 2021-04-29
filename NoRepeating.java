import java.util.*;
class NoRepeating
{
public static void main(String args[])
{
int a[]={19,2,1,10,11,13,14,2};
Map<Integer,Integer> map=new LinkedHashMap<>();
for(int i=0;i<a.length;i++)
{
map.put(a[i],map.getOrDefault(a[i],0)+1);
}
System.out.println(map);

for(int s:map.keySet())
{
if(map.get(s)==1)
{
System.out.print(s);
break;
}
}

}
}
