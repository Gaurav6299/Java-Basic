class AddLinked1
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

AddLinked1 AddLinked(Node head1,Node head2)
{
Node temp1=head1;
Node temp2=head2;
int x=0;
int y=0;
int carry=0;
int sum=0;
AddLinked1 l1=new AddLinked1();
while(temp1!=null || temp2!=null)
{
if(temp1!=null)
{
x=temp1.data;
}
else
{
x=0;
}
if(temp2!=null)
{
y=temp2.data;
}
else
{
y=0;
}
sum=carry+x+y;
carry=sum/10;
l1.append(sum%10);
if(temp1!=null)
{
temp1=temp1.next;
}

if(temp2!=null)
{
temp2=temp2.next;
}
}
if(carry!=0)
{
l1.append(carry);
}
return l1;
}

public static void main(String args[])
{
AddLinked1 l1=new AddLinked1();
l1.append(9);
l1.append(9);
l1.append(9);
l1.append(9);
l1.append(9);
l1.append(9);
l1.append(9);
l1.print();

AddLinked1 l2=new AddLinked1();
l2.append(9);
l2.append(9);
l2.append(9);
l2.append(9);
l2.print();
AddLinked1 l3=new AddLinked1();
System.out.println("Addtion of two linkedList");
l3=l3.AddLinked(l1.head,l2.head);
l3.print();
}
}