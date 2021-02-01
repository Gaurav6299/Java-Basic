//compare two Array
class compare
{
static boolean compareArray(float a[],float b[],float c[])
{
if(a.length!=c.length)
return false;

for(int i=0;i<a.length;i++)
{
if(a[i]!=c[i])
{
return false;
}
}
return true;
}
public static void main(String args[])
{
float a[]=new float[]{1.2f,3.2f,4.2f};
float b[]=new float[]{2.2f,2.1f,12f};
float c[]=new float[]{1.2f,3.2f,4.2f};

System.out.println(compareArray(a,b,c));
}
}