import java.util.*;
class Star
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int n=sc.nextInt();

for(int i=1;i<=n;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print("*");
}
System.out.println(" ");
System.out.println();
}
}
}