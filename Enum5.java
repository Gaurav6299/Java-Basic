import java.util.*;
enum gfg
{
KUMAR,SUJIT,KUSHAL,ANKIT;
}

class Enum5
{
public static void main(String args[])
{
Set<gfg> s=EnumSet.allOf(gfg.class);
System.out.println("the set is:"+s);

Set<gfg> s1=EnumSet.noneOf(gfg.class);
System.out.println("the value is:"+s1);

Set<gfg> s3=EnumSet.allOf(gfg.class);
System.out.println("the value is:"+s3);

Set<gfg> s4=EnumSet.allOf(gfg.class);
System.out.println(s4);
}
}