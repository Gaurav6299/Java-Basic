import java.util.*;
class mergeIntervals
{
static int[][] intervals(int a[][])
{
ArrayList<int[]> l=new ArrayList<>();
Arrays.sort(a,(l1,l2)->l1[0]-l2[0]);
int k[]=a[0];
int i=1;
while(i<a.length)
{
if(k[1]<a[i][0])
{
l.add(k);
k=a[i];
}
else
{
k[0]=Math.min(k[0],a[i][0]);
k[1]=Math.max(k[1],a[i][1]);
}
i++;
}
l.add(k);
return l.toArray(new int[l.size()][]);
}
public static void main(String args[])
{
int a[][]={{1,3},{2,6},{8,10},{15,18}};
int l[][]=intervals(a);
for(int i=0;i<l.length;i++)
{
for(int j=0;j<l[i].length;j++)
{
System.out.print(l[i][j]+" ");
}
System.out.println();
}
}
}