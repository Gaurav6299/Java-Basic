import java.util.*;
enum gaurav
{
JAVA,PYTHON,PHP,CSS,HTML;
}

class Enum3
{
public static void main(String args[])
{
Set<gaurav> s=EnumSet.of(gaurav.JAVA,gaurav.PYTHON,gaurav.PHP);
System.out.println("the set is:"+s);
}
}