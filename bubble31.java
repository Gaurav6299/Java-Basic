import java.util.*;
class bubble31
{
public static void main(String args[])
{
int a[]={12,3,2,4,1};
int n=a.length;
for(int i=0;i<n;i++)
{
for(int j=0;j<n-1;j++)
{
if(a[j+1]<a[j])
{
int temp=a[j+1];
a[j+1]=a[i];
a[i]=temp;
}
}
}
System.out.println(Arrays.toString(a));
}
}