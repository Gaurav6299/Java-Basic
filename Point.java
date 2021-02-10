class Point
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
int l1=getCount(head1);
int l2=getCount(head2);
int d;
if(l1>l2)
{
d=l1-l2;
return Intersection(d,head1,head2);
}
else
{
d=l2-l1;
return Intersection(d,head1,head2);
}
}

int Intersection(int d,Node head1,Node head2)
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

int getCount(Node x)
{
int count=0;
Node temp=x;
while(temp!=null)
{
count+=1;
temp=temp.next;
}
return count;
}
public static void main(String args[])
{
Point p1=new Point();
p1.append(10);
p1.append(20);
p1.append(30);
p1.append(40);
p1.print();

Point p2=new Point();
p2.append(2);
p2.append(30);
p2.append(40);
p2.print();
Point p3=new Point();
System.out.println("The intersection point-->"+p3.getNode(p1.head,p2.head));
}
}