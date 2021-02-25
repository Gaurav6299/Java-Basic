import java.util.*;
enum gfg
{
PYTHON,JAVA,CSS,HTML,PHP;
}

class AllOf
{
public static void main(String args[])
{
Set<gfg> g=EnumSet.allOf(gfg.class);
System.out.println(g);

Set<gfg> k1=EnumSet.allOf(gfg.class);
System.out.println("the value is:"+k1);

Set<gfg> k2=EnumSet.allOf(gfg.class);
System.out.println("the value is:"+k2);

Set<gfg> k3=EnumSet.allOf(gfg.class);
System.out.println(k3);
}
}