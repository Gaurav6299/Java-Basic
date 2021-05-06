import java.util.*;
class SelectionSort1
{
public static void main(String args[])
{
int a[]={5,4,3,1,2};
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
int temp=a[min];
a[min]=a[i];
a[i]=temp;
}
System.out.println(Arrays.toString(a));
}
}