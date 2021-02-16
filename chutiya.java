import java.util.*;
enum gaurav
{
JAVA,PYTHON,HTML,CSS,JAVASCRIPT;
}

class chutiya
{
public static void main(String args[])
{
Set<gaurav> s1=EnumSet.of(gaurav.JAVA,gaurav.PYTHON,gaurav.HTML,gaurav.CSS);
System.out.println("Set is:"+s1);
}
}