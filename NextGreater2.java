import java.util.*;
class NextGreater2
{
static int next(int n)
{
char c[]=(""+n).toCharArray();
int i=c.length-2;
while(i>=0 && c[i]>=c[i+1])
i--;

if(i==-1)
return -1;

int j=c.length-1;
while(j>i && c[j]<=c[i])
{
j--;
}

swap(c,i,j);
reverse(c,i+1);

try
{
return Integer.parseInt(new String(c));
}catch(Exception e)
{
return -1;
}
}

static void swap(char c[],int i,int j)
{
char temp=c[i];
c[i]=c[j];
c[j]=temp;
}

static void reverse(char c[],int l)
{
int r=c.length-1;
while(l<r)
{
swap(c,l,r);
l++;
r--;
}
}
public static void main(String args[])
{
int n=123;
System.out.println(next(n));
}
}