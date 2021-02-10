class swapLast
{
Node head;
class Node
{
int data;
Node next;
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

void swapLast()
{
Node temp=head;
Node prev=null;
while(temp.next!=null)
{
prev=temp;
temp=temp.next;
}

Node y=new Node(temp.data);
y.next=head;
head=y;
prev.next=null;
}

public static void main(String args[])
{
swapLast l=new swapLast();
l.append(10);
l.append(20);
l.append(30);
l.append(40);
l.append(80);
l.print();
l.swapLast();
System.out.println("After the swap");
l.print();
}
}