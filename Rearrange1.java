import java.util.*;
class Rearrange1
{
public static void main(String args[])
{
int a[]={1,2,3,-3,-4,5};
int n=a.length;
int i=0;
int j=n-1;
while(i<=j)
{
if(a[i]>0 && a[j]<0)
{
int temp=a[i];
a[i]=a[j];
a[j]=temp;
i++;
j--;
}
else if(a[i]<0 && a[j]>0)
{
i++;
j--;
}

else if(a[i]<0)
i++;
else if(a[j]>0)
j--;
}
int k=0;
while(k<n && i<n)
{
int temp=a[k];
a[k]=a[i];
a[i]=temp;
k+=2;
i++;
}

System.out.println(Arrays.toString(a));
}
}