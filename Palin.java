class Palin
{
Node head;
static class Node
{
int data;
Node next;
Node(int d)
{
data=d;
next=null;
}
}
void print()
{
Node temp=head;
while(temp!=null)
{
System.out.println(temp.data);
temp=temp.next;
}
}
public static void main(String args[])
{
Palin p=new Palin();
p.head=new Node(5);

Node x=new Node(10);
Node y=new Node(20);
Node z=new Node(30);
p.head.next=x;
x.next=y;
y.next=z;

p.print();
}
}