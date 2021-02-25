import java.util.*;
enum sujit
{
GFG,JAVA,PYTHON,WATER,KUSHAL,BABU;
}

class enum6
{
public static void main(String arg[])
{
Set<sujit> s=EnumSet.range(sujit.GFG,sujit.KUSHAL);
System.out.println("the value is:"+s);

Set<sujit> set=EnumSet.range(sujit.GFG,sujit.WATER);
System.out.println("the set is:"+set);

Set<sujit> s3=EnumSet.range(sujit.JAVA,sujit.KUSHAL);	
System.out.println("the value is:"+s3);
Set<sujit> s4=EnumSet.of(sujit.GFG,sujit.JAVA,sujit.PYTHON,sujit.WATER);
System.out.println("the value is:"+s4);

}
}