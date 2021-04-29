class Missing12
{
static int findMissing(int a[])
{
int l=0;
int h=a.length-1;
while(l<=h)
{
int mid=(l+h)/2;
if(a[mid]!=mid+1 && a[mid-1]==mid)
{
return mid+1;
}

else if(a[mid]!=mid+1)
h=mid-1;

else
l=mid+1;
}

return -1;
}
public static void main(String args[])
{
int a[]={1,2,4,5,6};
System.out.println(findMissing(a));
}
}