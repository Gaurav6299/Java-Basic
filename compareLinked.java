class compareLinked
{
static Node head;
static Node head1;
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
System.out.println("LinkedList is:"+temp.data);
temp=temp.next;
}
}

void print1()
{
Node temp=head1;
while(temp!=null)
{
System.out.println(temp.data);
temp=temp.next;
}
}

void insert(int data)
{
Node x=new Node(data);
if(head1==null)
{
head1=x;
return;
}
Node temp=head1;
while(temp.next!=null)
{
temp=temp.next;
}
temp.next=x;
}

static boolean compare(Node head,Node head1)
{
Node temp1=head;
Node temp2=head1;
while(temp1!=null && temp2!=null)
{
if(temp1.data!=temp2.data)
{
break;
}

if(temp1.next==null && temp2.next==null)
return true; 
}
return false;
}

public static void main(String args[])
{
compareLinked l=new compareLinked();
l.append(10);
l.append(20);
l.append(30);
System.out.println("First List l1 is:");
l.print();

compareLinked l1=new compareLinked();
System.out.println("\nSecond list is");
l1.insert(10);
l1.insert(20);
l1.insert(30);
l1.print1();

System.out.println(compare(head,head1));
}
}