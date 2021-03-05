class Reorder
{
Node head;
class Node{
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


void order()
{
Node temp=head;
int len=0;
while(temp!=null)
{
len+=1;
temp=temp.next;
}
temp=head;
Node k=len;
Node prev=head.next;
while(temp!=null)
{
temp.next=k;
temp=temp.next;
temp.next=prev;
prev=prev.next;
k--;
}
             
}

public static void main(String args[])
{
Reorder r=new Reorder();
r.append(1);
r.append(2);
r.append(3);
r.append(4);
r.print();
r.order();
r.print();
}
}