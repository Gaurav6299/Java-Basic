class searchCharacter
{
public static void main(String args[])
{
String s="Geeksforgeeks is computer science portal";
int x=s.indexOf("r");
System.out.println("Index="+x);
int y=s.lastIndexOf("r");
System.out.println("Index="+y);

int z=s.indexOf("r",10);
System.out.println("Index="+z);

int k=s.lastIndexOf("s",25);
System.out.println("Index="+k);
char q=s.charAt(10);
System.out.println("Char="+q);

boolean a=s.startsWith("Gee");
System.out.println(a);

boolean b=s.startsWith("for",5);
// here startsWith method check the given string is exist in the the given index
//if yes then returns true otherwise false
System.out.println(b);

boolean c=s.endsWith("tal");
System.out.println(c);
}
}