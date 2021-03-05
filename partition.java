class partition
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

Node partition(int x)
{
Node s=new Node(-1);
Node head1=new Node(-1);
Node b=head1;
Node temp=head;
while(temp!=null)
{
if(temp.data>=x)
{
b.next=temp;
b=b.next;
}
else
{
s.next=temp;
s=s.next;
}
temp=temp.next;
}
b.next=null;
s.next=head1.next;
return s.next;
}

public static void main(String args[])
{
partition p=new partition();
p.append(1);
p.append(4);
p.append(3);
p.append(2);
p.append(5);
p.append(2);
p.print();
Node i=p.partition(3);
p.print();
}
}