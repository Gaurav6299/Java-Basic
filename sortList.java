class sortList
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

void sort()
{
Node temp=head;
while(temp!=null)
{
Node prev=temp;
while(prev!=null)
{
if(temp.data>prev.data)
{
int k=temp.data;
temp.data=prev.data;
prev.data=k;
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
sortList s=new sortList();
s.append(10);
s.append(3);
s.append(2);
s.append(1);
s.print();
s.sort();
s.print();
}
}