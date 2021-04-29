import java.util.*;
class Pair
{
static void pairSum(int a[],int n)
{
Arrays.sort(a);
int left=0;
int right=a.length-1;
while(left<right)
{
if(a[left]+a[right]<n)
left=left+1;

else if(a[left]+a[right]>n)
right=right-1;

else if(a[left]+a[right]==n)
{
System.out.println("the pair is:"+"(" +a[left]+","+a[right]+")");
right=right-1;
left=left+1;
}
}
}
public static void main(String args[])
{
int a[]={1,2,3,4,5};
int n=5;
pairSum(a,n);
}
}