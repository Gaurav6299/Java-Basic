class revers
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

Node reverse(int left,int right)
{
Node head1=new Node(-1);
Node prev=head1;
prev.next=head;
for(int i=0;i<left-1;i++)
{
prev=prev.next;
}
Node cur=prev.next;
while(left<right)
{
Node temp=cur.next;
cur.next=temp.next;
temp.next=prev.next;
prev.next=temp;
left++;
}
return head1.next;
}

public static void main(String args[])
{
revers r=new revers();
r.append(1);
r.append(2);
r.append(3);
r.append(4);
r.append(5);
r.print();
Node x=r.reverse(2,4);
r.print();
}
}