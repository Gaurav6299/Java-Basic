class jagged
{
public static void main(String args[])
{
int a[][]=new int[2][];
a[0]=new int[2];
a[1]=new int[2];
int count=0;
for(int i=0;i<a.length;i++)
{
for(int j=0;j<a[i].length;j++)
{
a[i][j]=count;
count++;
}
}

System.out.println("Display the array is:");
for(int i=0;i<a.length;i++)
{
for(int j=0;j<a[i].length;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println();
}

}
}