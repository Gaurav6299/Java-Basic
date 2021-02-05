interface car
{
public void drive();
}

interface motor
{
public void walk();
}

class kumar implements car,motor
{
public void drive()
{
System.out.println("Hello friend,how can i drive this");
}

public void walk()
{
System.out.println("Hello walk! what's the fuck");
}
}

class interf
{
public static void main(String args[])
{
kumar k=new kumar();
k.drive();
k.walk();
}
}