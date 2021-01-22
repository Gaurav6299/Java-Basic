//Find all permutation of a array
import java.util.*;
class permutation
{
static List<List<Integer>> findPermutation(int a[])
{
List<List<Integer>> l=new ArrayList<>();
boolean visited[]=new boolean[a.length];
backtrack(l,a,new ArrayList(),visited);
return l;
}

static void backtrack(List<List<Integer>> l,int a[],List<Integer> cur,boolean visited[])
{
if(cur.size()==a.length)
{
l.add(new ArrayList(cur));
return;
}
for(int i=0;i<a.length;i++)
{
if(visited[i]==true)
{
continue;
}

cur.add(a[i]);
visited[i]=true;
backtrack(l,a,cur,visited);
cur.remove(cur.size()-1);
visited[i]=false;

}
}
public static void main(String args[])
{
int a[]={1,2,3};
System.out.println(findPermutation(a));
}
}