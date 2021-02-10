class MergeLink
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


void merge(Node head1,Node head2)
{
Node temp1=head1;
Node temp2=head2;
Node head3=null;
if(temp1.data<temp2.data)
{
head3=temp1;
temp1=temp1.next;
}
else
{
head3=temp2;
temp2=temp2.next;
}

Node temp3=head3;

while(temp1!=null && temp2!=null)
{
if(temp1.data<temp2.data)
{
temp3.next=temp1;
temp1=temp1.next;
}
else
{
temp3.next=temp2;
temp2=temp2.next;
}
temp3=temp3.next;
}
temp3=head3;
while(temp3!=null)
{
System.out.print(temp3.data+"->");
temp3=temp3.next;
}
System.out.println("null");
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

public static void main(String args[])
{
MergeLink m1=new MergeLink();
m1.append(10);
m1.append(20);
m1.append(30);

MergeLink m2=new MergeLink();
m2.append(12);
m2.append(24);
m2.append(23);
//m2.print();

MergeLink m3=new MergeLink();
m3.merge(m1.head,m2.head);

}
}