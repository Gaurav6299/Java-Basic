class LinkedReverse
{
static Node head;
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
System.out.println(temp.data);
temp=temp.next;
}
}

void reverse(Node head)
{
if(head==null)
{
return ;
}
Node temp=head;
Node prev=null;
Node next=null;
while(temp!=null)
{
next=temp.next;
temp.next=prev;
prev=temp;
temp=next;
}
head=prev;
while(head!=null)
{
System.out.println("In Reverse Order:"+head.data);
head=head.next;
}
}

public static void main(String args[])
{
LinkedReverse l=new LinkedReverse();
l.append(10);
l.append(30);
l.append(40);
l.print();
l.reverse(head);
}
}