import java.util.*;
class MissingNum
{
static void findMissing(int a[],int l,int h)
{
List<Integer> l1=new ArrayList<>();
while(l<=h)
{
int mid=(l+h)/2;
if(a[mid]!=mid+1 && a[mid-1]==mid)
{
l1.add(mid+1);
l++;
}
else if(a[mid]!=mid+1)
h=mid-1;

else
l=mid+1;
}
System.out.println(l1);
}
public static void main(String args[])
{
int a[]={1,2,3,5,7};
findMissing(a,0,a.length-1);
}
}