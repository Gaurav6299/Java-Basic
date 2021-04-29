import java.util.*;
class TopMaximum
{
public static void main(String args[])
{
int a[]={32,12,33,45,67,44};
int n=a.length;
int max=Integer.MIN_VALUE;
int smax=0;
int j=1;
for(int i=0;i<n;i++)
{
if(a[i]>max)
{
max=a[i];
}

if(a[j]<max)
{
smax=a[j];
j++;
}
}
System.out.println("First Maximum="+max);
System.out.println("Second Maximum="+smax);
}
}