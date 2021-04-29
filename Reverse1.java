import java.util.*;
class Reverse1
{
static int[] reverse(int a[],int n)
{
int b[]=new int[n];
int j=0;
for(int i=n-1;i>=0;i--)
{
b[j]=a[i];
j++;
}
return b;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
int res[]=reverse(a,n);
System.out.println(Arrays.toString(res));
}
}