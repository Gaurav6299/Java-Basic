class bubble3
{
public static void main(String args[])
{
int a[]={10,11,2,3,4};
int n=a.length;
for(int i=0;i<n;i++)
{
for(int j=0;j<n-1;j++)
{
if(a[j+1]<a[j])
{
int temp=a[j+1];
a[j+1]=a[j];
a[j]=temp;
}
}
}
for(int i=0;i<n;i++)
{

System.out.print(a[i]+" ");
}
}
}