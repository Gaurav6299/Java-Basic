class Multi
{
private int i=0;
public void increment()
{
i++;
}

int getValue()
{
return i;
}
}
class ThreadValue
{
public static void main(String args[])
{
Multi m=new Multi();
m.increment();
System.out.println(m.getValue());
}
}