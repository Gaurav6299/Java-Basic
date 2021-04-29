class OverLoadMain
{
public static void main(String args[])
{
System.out.println("Hello i am main");
OverLoadMain.main("hello, My love");
}

public static void main(String a)
{
System.out.println(a+ " Payal");
OverLoadMain.main("kumar","Gaurav");
}

public static void main(String s1,String s2)
{
System.out.println("Hello "+s1+" and "+s2 );
OverLoadMain.main(12);
}

public static void main(int a)
{
System.out.println("Value is:"+a);
}
}


