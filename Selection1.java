import java.util.*;
class Selection1
{
public static void main(String args[])
{
int a[]={10,2,1,3,5,4,6};
int n=a.length;
for(int i=0;i<n;i++)
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