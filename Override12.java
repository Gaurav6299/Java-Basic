class vikash
{
void eat()
{
System.out.println("Vikash is eating something");
}

void play()
{
System.out.println("He is going to play");
}
}

class gaurav extends vikash
{
void eat()
{
System.out.println("I am eating in child");
}

void play()
{
System.out.println("I am going to play somewhere");
}

void sleep()
{
System.out.println("I am gonna to sleep");
}

}

class Override12
{
public static void main(String args[])
{
vikash v=new gaurav();
v.eat();
v.play();

gaurav a=new gaurav();
a.sleep();


}
}
