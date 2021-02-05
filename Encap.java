class Encap
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

public static void main(String args[])
{
Encap e=new Encap();
e.setName("gaurav");
e.setRoll(10);
e.setAge(20);

System.out.println("Name="+e.getName()+" Roll="+e.getRoll()+" Age="+e.getAge());
}
}