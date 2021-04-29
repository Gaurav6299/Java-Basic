class Angram12
{
public static void main(String args[])
{
String a="gat";
String b="akb";
boolean visited[]=new boolean[a.length()];
boolean isAnagram=false;
if(a.length()==b.length())
{
for(int i=0;i<a.length();i++)
{
int c=a.charAt(i);
for(int j=0;j<b.length();j++)
{
if(b.charAt(j)==c && !visited[j])
{
visited[j]=true;
isAnagram=true;
break;
}
}
if(!isAnagram)
break;
}
}
if(isAnagram)
{
System.out.println("The String is Anagram");
}
else
{
System.out.println("Not Anagram");
}



}
}
