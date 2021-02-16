import java.util.*;
enum sujit
{
CSE,MECH,ECE,EEE,CIVIL;
}

class chutiya1
{
public static void main(String args[])
{
Set<sujit> s=EnumSet.of(sujit.CSE,sujit.MECH,sujit.ECE,sujit.CIVIL);
System.out.println("the set is:"+s);
}
}