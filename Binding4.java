class Binding4
{
static class student
{
void show()
{
System.out.println("I gonna show you something");
}
}

static class teacher extends student
{
void show()
{
System.out.println("Hello Teacher");
}
}

public static void main(String args[])
{
student s=new student();
s.show();
student s2=new teacher();
s2.show();

}
}