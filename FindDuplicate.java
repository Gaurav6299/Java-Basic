import java.util.*;
class FindDuplicate
{
static List<Integer> duplicate(int a[])
{
List<Integer> l=new ArrayList<>();
Arrays.sort(a);
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
int a[]={1,2,1,3,2,3,4};
List<Integer> k=duplicate(a);
System.out.println("The value is:"+k);
}
}