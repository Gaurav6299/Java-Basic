class MergeLinked
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

void mergeNode(Node head1,Node head2)
{
Node head3=null;
Node fast=head1;
Node slow=head2;

if(fast.data<slow.data)
{
head3=fast;
fast=fast.next;
}
else
{
head3=slow;
slow=slow.next;
}
Node temp=head3;
while(fast!=null && slow!=null)
{
if(fast.data<slow.data)
{
temp.next=fast;
fast=fast.next;
}
else
{
temp.next=slow;
slow=slow.next;
}
temp=temp.next;
}
if(fast!=null)
{
temp.next=fast;
}
if(slow!=null)
{
temp.next=slow;
}
temp=head3;
while(temp!=null)
{
System.out.print(temp.data+"->");
temp=temp.next;
}
System.out.println("null");
}
public static void main(String args[])
{
MergeLinked l1=new MergeLinked();
l1.append(4);
l1.append(5);
l1.append(7);
l1.append(9);
l1.print();

MergeLinked l2=new MergeLinked();
l2.append(1);
l2.append(2);
l2.append(3);
l2.append(6);
l2.print();

MergeLinked l3=new MergeLinked();
l3.mergeNode(l1.head,l2.head);
}
}