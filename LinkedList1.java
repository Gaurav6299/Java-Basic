class LinkedList1
{
static Node head;
static class Node
{
int data;
Node next=null;
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
LinkedList1 l=new LinkedList1();
l.head=new Node(30);
Node x=new Node(40);
Node y=new Node(90);
Node z=new Node(100);
l.head.next=x;;
x.next=y;
y.next=z;
l.printList();

}
}