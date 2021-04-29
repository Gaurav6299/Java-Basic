class SmallestPositive
{
public static void main(String args[])
{
int a[]={2,3,4};
int t=1;
int sum=0;
for(int i=0;i<a.length;i++)
{
if(a[i]<=t)
{
sum+=a[i];
t=sum+1;
}
else
{
System.out.println(t);
System.exit(0);
}
}
System.out.println("the value is:"+t);
}
}