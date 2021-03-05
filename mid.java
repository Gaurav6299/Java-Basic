class mid
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

Node middle()
{
Node slow=head;
Node fast=head.next;
while(fast!=null && fast.next!=null)
{
slow=slow.next;
fast=fast.next.next;
}
Node mid=slow.next;
slow.next=null;
return mid;
}

public static void main(String args[])
{
mid s=new mid();
s.append(4);
s.append(3);
s.append(2);
s.append(1);
s.print();
Node k=s.middle();
System.out.println(k);
}
}                                                             