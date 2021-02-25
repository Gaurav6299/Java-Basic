class Sort
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

void sortList()
{
Node temp=head;
while(temp!=null)
{
Node prev=temp;
while(prev!=null)
{
if(temp.data>prev.data)
{
int x=temp.data;
temp.data=prev.data;
prev.data=x;
prev=prev.next;
}
else
{
prev=prev.next;
}
}
temp=temp.next;
}
}

public static void main(String args[])
{
Sort s=new Sort();
s.append(4);
s.append(2);
s.append(1);
s.append(3);
s.print();
s.sortList();
s.print();
}
}