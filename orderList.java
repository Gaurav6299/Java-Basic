class orderList
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

void arrange()
{
Node head1=head;
Node head2=head.next;
Node odd=head1;
Node even=head2;
while(even!=null && even.next!=null)
{
odd.next=odd.next.next;
even.next=even.next.next;
odd=odd.next;
even=even.next;
}
odd.next=head2;
}

public static void main(String args[])
{
orderList l=new orderList();
l.append(1);
l.append(4);
l.append(5);
l.append(6);
l.append(7);
l.append(9);
l.print();
l.arrange();
l.print();
}
}