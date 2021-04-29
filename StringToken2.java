import java.util.*;
class StringToken2
{
public static void main(String args[])
{
StringTokenizer st=new StringTokenizer("My name is kumar gaurav"," ");
while(st.hasMoreElements())
{
System.out.println(st.nextElement());
}

}
}