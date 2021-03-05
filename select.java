import java.util.*;
class select
{
public static void main(String args[])
{
int a[]={-1,-5,4,2,5,3};
int n=a.length;
for(int i=0;i<n-1;i++)
{
int min=i;
for(int j=i;j<n;j++)
{
if(a[j]<a[min])
{
min=j;
}
}

int temp=a[i];
a[i]=a[min];
a[min]=temp;
}
System.out.println(Arrays.toString(a));
}
}
