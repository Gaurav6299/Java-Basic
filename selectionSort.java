//Selection sort
import java.util.*;
class selectionSort
{
public static void main(String args[])
{
int a[]={2,4,3,5,1};
for(int i=0;i<a.length;i++)
{
int min=i;
for(int j=i;j<a.length;j++)
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