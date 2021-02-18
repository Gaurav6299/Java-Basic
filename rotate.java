class rotate
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

Node rotate(int k)
{
Node temp=head;
int len=0;
if(head==null || k==0)
return head;
while(temp.next!=null)
{
len++;
temp=temp.next;
}
len++;
temp.next=head;

temp=head;
int rotatePoint=len-k%len;
while(rotatePoint>1)
{
temp=temp.next;
rotatePoint--;
}

head=temp.next;
temp.next=null;
return head;

}

public static void main(String args[])
{
rotate r=new rotate();
r.append(1);
r.append(2);
r.append(3);
r.append(4);
r.append(5);
r.print();
Node x=r.rotate(2);
r.print();
}
}