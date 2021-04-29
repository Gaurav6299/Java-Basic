class Collage
{
void play()
{
System.out.println("Hello child i am playing there");
}
}

class Branch extends Collage
{
void play()
{
super.play();
System.out.println("Helllo branch! i can deserve in my life");
}
}

class Riding2
{
public static void main(String args[])
{
Branch b=new Branch();
b.play();
}
}