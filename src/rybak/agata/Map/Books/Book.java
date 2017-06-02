package rybak.agata.Map.Books;

/**
 * Created by asus on 2017-06-02.
 */
public class Book implements Comparable<Book> {
    private String title;
    private String genre;
    private int pages;
    private int publication_date;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPublication_date() {
        return publication_date;
    }

    public void setPublication_date(int publication_date) {
        this.publication_date = publication_date;
    }

    public Book(){

    }

    public Book(String title, String genre, int pages, int publication_date) {
        setTitle(title);
        setGenre(genre);
        setPages(pages);
        setPublication_date(publication_date);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", pages=" + pages +
                ", publication_date=" + publication_date +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;

        Book book = (Book) o;

        if (pages != book.pages) return false;
        if (publication_date != book.publication_date) return false;
        if (!title.equals(book.title)) return false;
        return genre.equals(book.genre);
    }

    @Override
    public int hashCode() {
        int result = title.hashCode();
        result = 31 * result + genre.hashCode();
        result = 31 * result + pages;
        result = 31 * result + publication_date;
        return result;
    }

    @Override
    public int compareTo(Book b) {
        return this.getTitle().compareTo(b.getTitle());
    }
}
