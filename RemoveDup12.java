import java.util.*;
class RemoveDup12
{
static List<Integer> duplicates(int a[])
{
Arrays.sort(a);
List<Integer> l=new ArrayList<>();
for(int i=0;i<a.length-1;i++)
{
if(a[i]==a[i+1])
{
l.add(a[i]);
}
}
return l;
}
public static void main(String args[])
{
int a[]={4,3,2,7,8,2,3,1};
System.out.println(duplicates(a));
}
}