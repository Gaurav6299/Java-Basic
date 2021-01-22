class alphabets
{
static boolean isAlphabets(String s)
{
return((s!=null) && (s!="") &&(s.chars().allMatch(Character::isLetter)));
}
public static void main(String args[])
{
String s="kumar";
System.out.println(isAlphabets(s));

String k="gaurav12";
System.out.println(isAlphabets(k));
}
}