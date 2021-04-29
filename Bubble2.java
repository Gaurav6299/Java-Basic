import java.util.*;
class Bubble2
{
public static void main(String args[])
{
int a[]={12,3,2,1,3,4,6};
int n=a.length;
for(int i=0;i<n-1;i++)
{
for(int j=0;j<n-1;j++)
{
if(a[j+1]<a[j])
{
int temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
}
}
}
System.out.println(Arrays.toString(a));
}
}