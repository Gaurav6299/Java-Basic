//find the missing number using BinarySerach java
class BinarySearch1
{
static int findMissing(int a[],int n)
{
int i=0;
int j=n-1;
int mid=0;
boolean k=true;
while((j-i)>1)
{
mid=(i+j)/2;

if((a[i]-i)!=(a[mid]-mid))
j=mid;

else if((a[j]-j)!=(a[mid]-mid))
i=mid;

else
{
i++;
j--;
k=false;
}
}

if(k==false)
{
return -1;
}
return a[mid]+1;
}
public static void main(String args[])
{
int a[]={1,2,3,4,5,10};
int n=a.length;
System.out.println(findMissing(a,n));
}
}