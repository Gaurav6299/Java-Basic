class MergeTwoLink
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


void merge(Node head1,Node head2)
{
Node slow=head1;
Node fast=head2;
Node temp=null;
if(slow.data<fast.data)
{
temp=slow;
slow=slow.next;
}
else
{
temp=fast;
fast=fast.next;
}

Node prev=temp;
while(slow!=null && fast!=null)
{
if(slow.data<fast.data)
{
prev.next=slow;
prev=prev.next;
slow=slow.next;
}
else
{
prev.next=fast;
prev=prev.next;
fast=fast.next;
}
}

if(slow!=null)
{
prev.next=slow;
}
if(fast!=null)
{
prev.next=fast;
}
Node head3=temp;
while(head3!=null)
{
System.out.print(head3.data+"->");
head3=head3.next;
}
System.out.println("null");
}
public static void main(String args[])
{
MergeTwoLink l=new MergeTwoLink();
l.append(1);
l.append(3);
l.append(5);
l.append(6);

l.print();
MergeTwoLink l1=new MergeTwoLink();
l1.append(2);
l1.append(4);
l1.append(7);
l1.append(8);
l1.print();

MergeTwoLink l2=new MergeTwoLink();
l1.merge(l.head,l1.head);
}
}