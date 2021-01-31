class byteToHexa
{
static void convertHexa(byte a[])
{
for(byte i:a)
{
String k=String.format("%03X",i);
System.out.print(k);
}
}
public static void main(String args[])
{
byte a[]={1,2,3,4};
convertHexa(a);
}
}