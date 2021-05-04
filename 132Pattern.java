class 132Pattern
{
static boolean pattern(int a[])
{
int n=a.length;
int min[]=new int[n];
min[0]=a[0];
for(int i=1;i<n;i++)
{
min[i]=Math.min(min[i-1],a[i]);
}

Stack<Integer> st=new Stack<>();
for(int i=n-1;i>=0;i--)
{
if(nums[i]>min[i])
{
while(!st.isEmpty() && st.peek()<=min[i])
{
st.pop();
}

if(!st.isEmpty() && st.peek()<a[i])
{
return true;
}
st.push(a[i]);
}
}

return false;
}
public static void main(String args[])
{
int []={3,1,4,2};
pattern(a);
}
}