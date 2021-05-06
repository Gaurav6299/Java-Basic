class RemoveDup2
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

void removeDup()
{
Node temp=head;
while(temp!=null)
{
Node prev=temp;
while(prev!=null && temp.data==prev.data)
{
prev=prev.next;
}
temp.next=prev;
temp=temp.next;
}
}

public static void main(String args[])
{
RemoveDup2 r=new RemoveDup2();
r.append(10);
r.append(20);
r.append(30);
r.append(30);
r.append(40);
r.print();

r.removeDup();
System.out.println("After removeing...");
r.print();
}
}