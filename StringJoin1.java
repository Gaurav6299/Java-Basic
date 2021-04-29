import java.util.*;
class StringJoin1
{
public static void main(String args[])
{
ArrayList<String> a=new ArrayList<>();
a.add("gaurav");
a.add("kumar");
a.add("sujit");
a.add("kushal");
StringJoiner st=new StringJoiner(",");
st.add(a.get(0)).add(a.get(1));
System.out.println(st);
System.out.println(st.length());

StringJoiner st1=new StringJoiner(":");
st1.add(a.get(2)).add(a.get(3));
System.out.println(st1);
}
}