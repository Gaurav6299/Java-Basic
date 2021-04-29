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
List<Book> book;
Library(List<Book> book)
{
this.book=book;
}

List<Book> getAllBooks()
{
return book;
}
}

class Composite
{
public static void main(String args[])
{
Book b1=new Book("Love","Gaurav");
Book b2=new Book("Hate","vikash");
Book b3=new Book("PremKatha","Arjun");

List<Book> book=new ArrayList<>();
book.add(b1);
book.add(b2);
book.add(b3);

Library l=new Library(book);
List<Book> s=l.getAllBooks();
for(Book b:s)
{
System.out.println("Title="+b.title+" Author="+b.author);
}
}
}