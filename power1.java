import java.util.*;
class power1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the first number:");
int a=sc.nextInt();
System.out.println("Enter the second number:");
int b=sc.nextInt();
int pow=1;
for(int i=0;i<b;i++)
{
pow=pow*a;
}
System.out.println("The pow of a number is:"+pow);
}
}