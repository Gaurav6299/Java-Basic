class AddLink
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

void push(int data)
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

AddLink AddTwoLink(Node head1,Node head2)
{
Node temp1=head1;
Node temp2=head2;
int x=0;
int y=0;
int sum=0;
int carry=0;
AddLink l=new AddLink();
while(temp1!=null|| temp2!=null)
{
if(temp1!=null)
{
x=temp1.data;
}else{
x=0;
}

if(temp2!=null)
{
y=temp2.data;
}else
{
y=0;
}

sum=carry+x+y;
carry=sum/10;
l.push(sum%10);

if(temp1!=null)
temp1=temp1.next;

if(temp2!=null)
temp2=temp2.next;

}
if(carry!=0)
{
l.push(carry);
}
return l;
}

public static void main(String args[])
{
AddLink a=new AddLink();
a.push(9);
a.push(9);
a.push(9);
a.push(9);
a.push(9);
a.push(9);
a.push(9);
a.print();

AddLink a1=new AddLink();
a1.push(9);
a1.push(9);
a1.push(9);
a1.push(9);
a1.print();
AddLink a2=new AddLink();
a2=a2.AddTwoLink(a.head,a1.head);
a2.print();
}
}