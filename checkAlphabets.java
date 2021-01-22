//check if a String contains only alphabets or not using regex
class checkAlphabets
{
static boolean isAlphabets(String s)
{
return((s!=null) && (s!="") &&(s.matches("^[a-zA-Z0-9]*$")));
}
public static void main(String args[])
{
String s="kumar12";
System.out.println(isAlphabets(s));
}
}