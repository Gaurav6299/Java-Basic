import java.util.*;
class StringJoiner1
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
System.out.println("The first StringJoiner is:"+st);
System.out.println("Lenght is:"+st.length());

StringJoiner st1=new StringJoiner(":");
st1.add(a.get(2)).add(a.get(3));

System.out.println("StringJoiner is:"+st1);
System.out.println("Length is:"+st1.length());
}
}
