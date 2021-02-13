class RemoveNth
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
x.next=head;
head=x;
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

Node remove(int n)
{
Node prev=head;
Node temp=head;
for(int i=1;i<=n;i++)
{
temp=temp.next;
}
if(temp==null)
{
head=head.next;
return head;
}

while(temp.next!=null)
{
temp=temp.next;
prev=prev.next;
}
prev.next=prev.next.next;
return head;

}

public static void main(String args[])
{
RemoveNth r=new RemoveNth();
r.push(10);
r.push(20);
r.print();
Node k=r.remove(2);
r.print();
}
}