class Missing3
{
static int findMissing(int a[],int n)
{
int sum=0;
for(int i=0;i<a.length;i++)
{
sum+=a[i];
}
int res=n*(n+1)/2;

return res-sum;
}
public static void main(String args[])
{
int a[]={1,3,4,2,6,7,9,8,10};
int n=10;
System.out.println(findMissing(a,n));
}
}