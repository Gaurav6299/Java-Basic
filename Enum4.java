import java.util.*;
enum baba
{
KUMAR,ANKIT,GAURAV,SUJIT;
}

class Enum4
{
public static void main(String args[])
{
Set<baba> set=EnumSet.of(baba.KUMAR,baba.ANKIT,baba.GAURAV,baba.SUJIT);
System.out.println("The set is:"+set);
}
}