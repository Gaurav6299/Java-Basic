class RemoveDup1
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

void remove()
{
Node temp=head;
Node prev=head;

while(temp!=null && prev!=null)
{
if(temp.data==prev.data)
{
prev=prev.next;
}
else
{
temp.next=prev;
temp=temp.next;
prev=prev.next;
}
if(temp!=null)
{
temp.next=prev;
}
}
}

public static void main(String args[])
{
RemoveDup1 r=new RemoveDup1();
r.append(10);
r.append(20);
r.append(20);
r.append(30);
r.print();
r.remove();
r.print();
}
}