class permut
{
static int missingNumber(int a[],int low,int high)
{
while(low<=high)
{
int mid=(low+high)/2;
if(a[mid]!=mid+1 && a[mid-1]==mid)
return mid+1;

if(a[mid]!=mid+1)
high=mid-1;
else
low=mid+1;
}
return -1;
}
public static void main(String args[])
{
int a[]={1,2,4,5};
int low=0;
int high=a.length-1;
int k=missingNumber(a,low,high);
System.out.println("the missing number is:"+k);
}
}