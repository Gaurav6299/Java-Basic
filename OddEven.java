class OddEven
{
Node head;
class Node
{
int data;
Node next;
Node(int d)
{
data=d;
next= null;
}
}

void append(int data)
{
Node x=new Node(data);
if(head==null)
{
head =x;
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

Node findOddEven()
{
Node temp=head;
Node head1=null;
Node head2=null;
Node odd=null;
Node even=null;
while(temp!=null)
{
if(temp.data%2==0)
{
if(head1==null)
{
head1=temp;
even=head1;
}
else
{
even.next=temp;
even=even.next;
}

}
else
{
if(head2==null)
{
head2=temp;
odd=head2;
}
else
{
odd.next=temp;
odd=odd.next;
}
}

temp=temp.next;
}
even.next=head2;
odd.next=null;
head=head1;
return head;
}

public static void main(String args[])
{
OddEven o=new OddEven();
o.append(1);
o.append(2);
o.append(3);
o.append(4);
o.append(5);
o.print();
Node s=o.findOddEven();
o.print();
}
}