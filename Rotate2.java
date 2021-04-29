import java.util.*;
class Rotate2
{
public static void main(String args[])
{
Integer a[]={10,20,30,70};
System.out.println(Arrays.toString(a));
Collections.rotate(Arrays.asList(a),2);
System.out.println(Arrays.toString(a));
}
}