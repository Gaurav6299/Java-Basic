class Common1
{
public static void main(String args[])
{
int a[]={1,2,3,4,5,6};
int b[]={5,6,7,8,9,10};
int c[]={4,5,6,10,11,12,13};
int n1=a.length;
int n2=b.length;
int n3=c.length;
int i=0;
int j=0;
int k=0;
while(i<n1 && j<n2 && k<n3)
{
if(a[i]==b[j] && b[j]==c[k])
{
System.out.print(a[i]+" ");
i++;
j++;
k++;
}

else if(a[i]<b[j])
i++;


else if(b[j]<c[k])
j++;

else 
k++;
}

}
}