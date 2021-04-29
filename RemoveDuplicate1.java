import java.util.*;
class RemoveDuplicate1
{
static int remove(int a[])
{
int i=0;
int j=1;
while(i<a.length && j<a.length)
{
if(a[i]==a[j])
{
j++;
}
else
{
i++;
a[i]=a[j];
}
}
return i+1;
}

public static void main(String args[])
{
int a[]={1,2,2,3,4,5,5};
int k=remove(a);
System.out.println(k);
}
}