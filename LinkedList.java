class LinkedList
{
Node head;

static class Node
{
int data;
Node next;
Node(int d)
{
data=d;
next=null;
}
}
static void printList()
{
Node n=head;
while(n!=null)
{
System.out.println(n.data);
n=n.next;
}
}
public static void main(String args[])
{
LinkedList l=new LinkedList();
l.head=new Node(20);
Node second=new Node(30);
Node third=new Node(40);

l.head.next=second;
second.next=third;
l.printList();
}
}
