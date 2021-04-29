import java.util.*;
class Selection2
{
public static void main(String args[])
{
int a[]={2,1,3,4,5,3,6};
int n=a.length;
for(int i=0;i<a.length;i++)
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