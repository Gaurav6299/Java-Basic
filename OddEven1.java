class OddEven1
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

void findOddEven()
{
Node temp=head;
Node head1=null;
Node head2=null;
Node even=head1;
Node odd=head2;
while(temp!=null)
{
if(temp.data%2==0)
{
if(head1==null)
{
head1=temp;
even=head1;
}else
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
}

public static void main(String args[])
{
OddEven1 s=new OddEven1();
s.append(1);
s.append(2);
s.append(3);
s.append(4);
s.append(5);
s.print();
s.findOddEven();
s.print();
}
}