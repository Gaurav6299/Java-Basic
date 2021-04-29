class MiddleElement1
{
Node head;
class Node
{
Node next;
int data;
Node(int d)
{
data=d;
next=null;
}
}

void append(int data)
{
Node x=new Node(data);
if(head==null)
{
head=x;
return;
}

Node temp=head;
while(temp.next!=null)
{
temp=temp.next;
}
temp.next=x;
}

void print()
{
Node temp=head;
while(temp!=null)
{
System.out.print(temp.data+"->");
temp=temp.next;
}
System.out.println("null");
}

void middle()
{
Node low=head;
Node fast=head;
while(fast!=null && fast.next!=null)
{
low=low.next;
fast=fast.next.next;
}
System.out.println("Middle Element is:"+low.data);
}

public static void main(String args[])
{
MiddleElement1 l=new MiddleElement1();
l.append(10);
l.append(20);
l.append(30);
l.append(40);
l.print();
l.middle();
}
}
