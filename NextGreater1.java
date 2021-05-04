import java.util.*;
class NextGreater1
{
static void next(int a[])
{
int max=0;
int n=a.length;
int b[]=new int[n];
for(int k=0;k<a.length;k++)
{
max=Math.max(max,a[k]);
}
int i=0;
int j=1;
while(i<=j)
        {
            if(a[i]==max)
            {
                b[i]=-1;
            }
          else if(a[i]<a[i+1])
            {
             b[i]=a[i+1];
             i++;
              j++;
            }
            else if(a[i]<a[j])
            {
		b[i]=a[j];
                i++;
                j++;
            }
            else
                j++;
        }

System.out.println(Arrays.toString(b));
}
public static void main(String args[])
{
int a[]={1,2,1};
next(a);
}
}