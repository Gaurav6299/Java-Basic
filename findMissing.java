//Find the missing number in a sorted array in java

import java.util.*;
class findMissing
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
int j=0;
String sum="";
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}

for(int i=0;i<n;i++)
{
if(a[i]==j)
{
j++;
}
else
{
sum+=j+" ";
j++;
}
}
System.out.println("The missing number is:"+sum);
}
}