import java.util.regex.*;
class substring
{
public static void main(String args[])
{
String s="Hello kumar how 'can i help for you'";
Pattern p=Pattern.compile(".*'([^']*)'.*");
Matcher m=p.matcher(s);
if(m.matches())
{
System.out.println("Single Quates:"+m.group(1));
}
}
}
