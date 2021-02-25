class DeleteAll2
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

Node Delete()
{
Node temp=head;
Node head1=new Node(-1);
Node prev=head1;
while(temp!=null)
{
Node start=temp;
int count=0;
while(temp!=null && start.data==temp.data)
{
temp=temp.next;
count++;
}
if(count>1)
{
start=temp;
}
else
{
prev.next=start;
prev=prev.next;
}
}
prev.next=null;
return head1.next;
}

public static void main(String args[])
{
DeleteAll2 s=new DeleteAll2();
s.append(1);
s.append(2);
s.append(2);
s.append(3);
s.append(4);
s.print();
Node x=s.Delete();
s.print();
}
}