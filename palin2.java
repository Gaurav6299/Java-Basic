class palin2
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

void remove()
{
Node temp=head;
while(temp!=null)
{
Node prev=temp;
while(prev!=null && temp.data==prev.data)
{
prev=prev.next;
}
temp.next=prev;
temp=temp.next;
}
}

void print()
{
Node temp=head;
while(temp!=null)
{
System.out.print(temp.data+"->");
temp=temp.next;
}
}

public static void main(String args[])
{
palin2 p=new palin2();
p.append(10);
p.append(10);
p.append(10);
p.append(20);
p.append(30);
p.print();
p.remove();
System.out.println("\nremoveing duplicate elements");
p.print();
}
}