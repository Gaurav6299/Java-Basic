class collage
{
{
System.out.println("This will execute first before the every constructor");

}

collage()
{
System.out.println("Hello Default Constructor");
}

collage(int a)
{
System.out.println("helo parameter");
}
}

class Initializer1
{
public static void main(String args[])
{
collage c1=new collage();
collage c2=new collage(10);

}
}