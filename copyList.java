class copyList
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
Node k=new Node(data);
if(head==null)
{
head=k;
return;
}

Node temp=head;
while(temp.next!=null)
{
temp=temp.next;
}
temp.next=k;
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

void Copy(int head1)
{
Node temp=head1;
Node k= new Node(-1)
}

public static void main(String args[])
{
copyList l=new copyList();
l.append(10);
l.append(20);
l.append(30);
l.append(40);
l.print();
l.Copy(l.head);
}
}