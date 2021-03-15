class Encapsulate
{
private String branch;
private int roll;
private int age;

public void setBranch(String branch)
{
this.branch=branch;
}

public void setRoll(int roll)
{
this.roll=roll;
}

public void setAge(int age)
{
this.age=age;
}

public String getBranch()
{
return branch;
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


class Encapsu1
{
public static void main(String args[])
{
Encapsulate e=new Encapsulate();
e.setBranch("CSE");
e.setRoll(120);
e.setAge(23);

System.out.println("Name="+e.getBranch());
System.out.println("Roll="+e.getRoll());
System.out.println("Age="+e.getAge());
}
}