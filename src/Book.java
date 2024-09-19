public class Book
{
    private String title;
    private String author;
    private int year;

    Book(String title, String author, int year)
    {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getAuthor() { return author; }
    public String getTitle() { return title; }
    public int getYear() { return year; }
}
