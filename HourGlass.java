import java.util.*;
class HourGlass
{
static void maxSum(int a[])
{
int max=Integer.MIN_VALUE;
int sum=0;
int n=a.length;
for(int i=0;i<n;i++)
{
sum+=a[i];
if(sum>max)
max=sum;

if(sum<0)
sum=0;
}
int curSum=0;
int left=0;
int right=0;
int i=0;
int j=0;
List<Integer> l=new ArrayList<>();
while(left<a.length && right<a.length)
{
curSum+=a[right];
if(curSum<0)
{
curSum=0;
left++;
right++;
}
else if(curSum==max)
{
i=left;
j=right;
break;
}

else if(curSum<max)
right++;
else
left++;
}

for(int k=i;k<=j;k++)
{
l.add(a[k]);
}
System.out.println(l);
}
public static void main(String args[])
{
int a[]={2,1,3,-1,-3};
maxSum(a);

}
}

