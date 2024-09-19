import java.util.ArrayList;

public class Library
{
    private ArrayList<Book> books = new ArrayList<Book>();

    public void addBook(Book book)
    {
        books.add(book);
    }

    public Book findBookByAuthor(String author)
    {
        for (Book book : books)
        {
            if(book.getAuthor().equals(author)) { return book; }
        }
        return new Book("","",0);
    }

    public Book findBookByYear(int year)
    {
        for (Book book : books)
        {
            if(book.getYear() == year) { return book; }
        }
        return new Book("","",0);
    }
}
