//find the missing element in a  unsorted array? and also the elemnt is present twice
import java.util.*;
class MultipleMissing
{
static List<Integer> missing(int a[],int n)
{
List<Integer> l=new ArrayList<>();
for(int b:a)
{
int index=Math.abs(b)-1;
if(a[index]>0)
{
a[index]=-a[index];
}

}
for(int i=0;i<n;i++)
{
if(a[i]>0)
{
l.add(i+1);
}
}
return l;
}
public static void main(String args[])
{
int a[]={1,2,2,3,5};
int n=a.length;
List<Integer> k=missing(a,n);
System.out.println("Missing elemnt is :"+k);
}
}