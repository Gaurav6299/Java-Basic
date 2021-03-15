class Encapsulate
{
private String name;
private int roll;
private int age;

public void setName(String name)
{
this.name=name;
}

public void setRoll(int roll)
{
this.roll=roll;
}

public void setAge(int age)
{
this.age=age;
}

public String getName()
{
return name;
}

public int getRoll()
{
return roll;
}

public int getAge()
{
return age;
}
}


class Encapsu
{
public static void main(String args[])
{
Encapsulate e=new Encapsulate();
e.setName("gaurav");
e.setRoll(120);
e.setAge(20);

System.out.println("Name="+e.getName());
System.out.println("Age="+e.getAge());
System.out.println("Roll="+e.getRoll());
}
}