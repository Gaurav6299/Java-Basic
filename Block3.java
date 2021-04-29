class Block3
{
static 
{
System.out.println("This  will execute first");
}

static 
{
System.out.println("This will execute after the first static block");
}
public static void main(String args[])
{
System.out.println("This will execute after the static block");
}

static{
System.out.println("Hello How are you");
}
}