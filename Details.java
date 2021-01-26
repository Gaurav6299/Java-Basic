class Collage
{
String branch;
int age;
Collage(String branch,int age)
{
this.branch=branch;
this.age=age;
}
}

class Details
{
public static void main(String args[])
{
Collage s[]=new Collage[3];
s[0]=new Collage("CSE",20);
s[1]=new Collage("MECH",21);
s[2]=new Collage("ECE",32);
for(int i=0;i<s.length;i++)
{
System.out.println(s[i].branch+":"+s[i].age);
}

}
}