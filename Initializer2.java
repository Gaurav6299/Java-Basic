class Collage
{
Collage()
{
System.out.println("Hello Collage");
}

{
System.out.println("Hello Instance Initializer block");
}
}

class Sujit extends Collage
{

{
System.out.println("Intance Initializer Block");
}

Sujit()
{
super();
System.out.println("Called Sujit");
}


}


class Initializer2
{
public static void main(String args[])
{
//Collage c=new Collage();
Sujit s=new Sujit();
}
}