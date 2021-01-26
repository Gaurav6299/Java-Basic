import java.util.*;
class trap
{
public static void main(String args[])
{
int a[]={0,1,0,2,1,0,1,3,2,1,2,1};
int n=a.length;
int left[]=new int[n];
int right[]=new int[n];
int max=0;
int result=0;
for(int i=0;i<n;i++)
{
max=Math.max(max,a[i]);
left[i]=max;
}

max=0;
for(int i=n-1;i>=0;i--)
{
max=Math.max(max,a[i]);
right[i]=max;
}

for(int i=0;i<n;i++)
{
int total=Math.min(left[i],right[i])-a[i];
result+=total;
}

System.out.println(Arrays.toString(left));
System.out.println(Arrays.toString(right));
}
}