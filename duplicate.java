import java.util.*;
class duplicate
{
public static void main(String args[])
{
int a[]={1,3,4,4,2};
Map<Integer,Integer> map=new HashMap<>();
int n=a.length;
for(int i=0;i<n;i++)
{
map.put(a[i],map.getOrDefault(a[i],0)+1);
}

for(Integer k:map.keySet())
{
if(map.get(k)!=1)
{
System.out.println(k);
}
}

}
}