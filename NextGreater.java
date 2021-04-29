import java.util.*;
class NextGreater
{
static int[] greater(int a[],int b[])
{
int j=0;
int i=0;
for(i=0;i<a.length;i++)
{
int x=a[i];
for(j=0;j<b.length-1;j++)
{
if(x==b[j] && b[j+1]>x)
{
a[i]=b[j+1];
break;
}
else{
a[i]=-1;
break;
}
}
if(b[j]>x)
{
a[i]=b[j];
}
}
return a;
}
public static void main(String args[])
{
int a[]={4,1,2};
int b[]={1,3,4,2};
int c[]=greater(a,b);
System.out.println(Arrays.toString(c));
}
}