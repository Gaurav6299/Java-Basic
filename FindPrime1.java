import java.util.*;
class FindPrime1
{
static ArrayList<Integer> l=new ArrayList<>();
static void findPrime(int a,int b)
{
if(a==1)
{
a++;
}
if(b>=2)
{
l.add(a);
a++;
}

if(a==2)
l.add(a);

if(a%2==0)
a++;

for(int i=a;i<=b;i+=2)
{
int flag=1;
for(int j=2;j*j<=i;j++)
{
if(i%j==0)
{
flag=0;
break;
}
}

if(flag==1)
{
l.add(i);
}
}
System.out.println(l);
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
findPrime(a,b);
}
}