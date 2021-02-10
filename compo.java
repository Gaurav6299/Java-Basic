import java.util.*;
class Book
{
String title;
String author;
Book(String title,String author)
{
this.title=title;
this.author=author;
}
}

class Library
{
List<Book> books;
Library(List<Book> books)
{
this.books=books;
}

List<Book> getBook()
{
return books;
}
}

class compo
{
public static void main(String args[])
{
Book b1=new Book("Ram chandra","gaurav");
Book b2=new Book("Sparks","Kushal");
Book b3=new Book("Thomar","kumar");

List<Book> l=new ArrayList<>();
l.add(b1);
l.add(b2);
l.add(b3);

Library l1=new Library(l);
List<Book> b=l1.getBook();
for(Book bo:b)
{
System.out.println("Title="+bo.title+" Author="+bo.author);
}
}
}