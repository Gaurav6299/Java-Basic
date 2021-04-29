class Gaurav
{
static final String branch;
static 
{
branch="CSE";
System.out.println(branch);
}

static 
{
System.out.println("This will run first before the main");
}
}

class Assign1
{
public static void main(String args[])
{
Gaurav g=new Gaurav();
g.branch="MECH";
System.out.println(g.branch);
System.out.println("Hello");

}
}