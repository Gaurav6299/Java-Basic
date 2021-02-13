class FinalValue1
{
static final int i;
static
{
i=20;
}

static 
{
System.out.println("Hello how are you");
}
public static void main(String args[])
{
FinalValue1 f=new FinalValue1();
System.out.println("The value is:"+f.i);
}
static 
{
System.out.println("hello");
}
}