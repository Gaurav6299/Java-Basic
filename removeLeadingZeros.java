class removeLeadingZeros
{
static void removeZero(String k)
{
int i=0;
while(i<k.length() && k.charAt(i)=='0')
{
i++;
}
StringBuffer sb=new StringBuffer(k);
sb.replace(0,i,"");
System.out.println(sb.toString());
}
public static void main(String args[])
{
String k="00000126388";
removeZero(k);
}
}