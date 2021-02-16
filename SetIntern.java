import java.util.*;
enum gfg
{
JAVA,PYTHON,CSS,HTML,JAVASCRIPT;
}

class SetIntern
{
public static void main(String args[])
{
Set<gfg> s=EnumSet.of(gfg.JAVA,gfg.PYTHON,gfg.CSS,gfg.HTML);
System.out.println("The set is:"+s);
}
}