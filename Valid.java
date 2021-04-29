import java.util.*;
class Valid
{
static boolean validParen(String s)
{
Stack<Character> st=new Stack<>();
char c[]=s.charArray();
for(char k:c)
{
if(k=='(' || k=='[' || k=='{')
{
st.push(k);
}
else
{
if(st.isEmpty())
return false;

if(k==')' && st.peek()!='(' )
return false;

if(k==']' && st.peek()!='[' )
return false;

if(k=='}' && st.peek()!='{')
return false;

st.pop();
}
}
return st.isEmpty();
}
public static void main(String args[])
{
String s="()";
System.out.println(validParen(s));
}
}