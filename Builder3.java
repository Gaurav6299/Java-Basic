class Builder3
{
public static void main(String args[])
{
StringBuilder str=new StringBuilder("kumar");
str.appendCodePoint(65);
System.out.println(str);
str.setCharAt(1,'G');
System.out.println(str);
}
}