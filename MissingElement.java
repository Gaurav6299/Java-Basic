class MissingElement
{
static int missing(int a[],int n)
{
int low=0;
int high=n-1;
while(low<=high)
{
int mid=(low+high)/2;
if(a[mid]!=mid+1 && a[mid-1]==mid)
{
return mid+1;
}
if(a[mid]!=mid+1)
high=mid-1;

else
low=mid+1;
}
return -1;
}
public static void main(String args[])
{
int a[]={1,2,3,4,6};
int n=a.length;
System.out.println(missing(a,n));
}
}