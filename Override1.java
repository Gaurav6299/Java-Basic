class sujit
{
private void play()
{
System.out.println("I gonna play");
}

protected void dance()
{
System.out.println("I am doing dance");
}
}

class kumar extends sujit
{
private void play()
{
System.out.println("I can do this things very fast");
}

public void dance()
{
super.dance();
System.out.println("I can do dance better rather than you");
}
}

class Override1
{
public static void main(String args[])
{
sujit s=new kumar();
s.dance();
kumar k=new kumar();
//k.play();
}
}