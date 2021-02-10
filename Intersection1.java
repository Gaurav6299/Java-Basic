class Intersection1
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

int getNode(Node head1,Node head2)
{
int c1=getCount(head1);
int c2=getCount(head2);
int d;
if(c1>c2)
{
d=c1-c2;
return point(d,head1,head2);
}
else
{
d=c2-c1;
return point(d,head1,head2);
}
}

int getCount(Node node)
{
int count=0;
Node temp=node;
while(temp!=null)
{
count+=1;
temp=temp.next;
}
return count;
}

int point(int d,Node head1,Node head2)
{
Node temp1=head1;
Node temp2=head2;
for(int i=0;i<d;i++)
{
if(temp1==null)
{
return -1;
}
temp1=temp1.next;
}

while(temp1!=null && temp2!=null)
{
if(temp1.data==temp2.data)
{
return temp1.data;
}
temp1=temp1.next;
temp2=temp2.next;
}
return -1;
}

public static void main(String args[])
{
Intersection1 i=new Intersection1();
i.append(3);
i.append(6);
i.append(9);
i.append(15);
i.append(30);
i.print();

Intersection1 i1=new Intersection1();
i1.append(10);
i1.append(15);
i1.append(30);
System.out.println("Second LinkedList is:");
i1.print();

Intersection1 i3=new Intersection1();
System.out.println("The intersection point is:"+i3.getNode(i.head,i1.head));
}
}