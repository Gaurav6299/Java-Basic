import java.util.*;
class RotateArray
{
static void leftRotate(int a[],int d,int n)
{
for(int i=0;i<d;i++)
{
rotate(a,n);
}
}

static void rotate(int a[],int n)
{
int temp=a[0];
int i;
for(i=0;i<n-1;i++)
{
a[i]=a[i+1];
}
a[i]=temp;
}

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a[]={1,2,3,4,5};
System.out.println("Enter the number");
int k=sc.nextInt();
int n=a.length;
leftRotate(a,k,n);
System.out.println(Arrays.toString(a));
}
}