package rybak.agata.Map.Books;

import java.util.*;

/**
 * Created by asus on 2017-06-02.
 */
public class BooksMap {
    private Map<Book, String> books;

    public BooksMap()
    {
        books = new TreeMap<>();
        books.put(new Book("ANIA Z ZIELONEGO WZGORZA", "POWIESC", 200, 1960), "KOPENHAGA");
        books.put(new Book("PIES KTORY JECHAL KOLEJA", "KOMEDIA", 250, 1980), "WARSZAWA");
        books.put(new Book("POTOP", "POWIESC", 300, 1970), "BERLIN");
        books.put(new Book("KRZYZACY", "POEMAT", 400, 1965), "WARSZAWA");
        books.put(new Book("ZBRODNIA I KARA", "DRAMAT", 100, 1860), "KOPENHAGA");
        books.put(new Book("OGNIEM I MIECZEM", "POEMAT", 600, 1260), "KRAKOW");
        books.put(new Book("QUO VADIS", "DRAMAT", 600, 1860), "BERLIN");
        books.put(new Book("PAN TADEUSZ", "KOMEDIA", 300, 1967), "WARSZAWA");
    }

    @Override
    public String toString() {
        String text = "";
        for (Map.Entry<Book, String> e : books.entrySet())
        {
            text += e.getKey() + " " + e.getValue() + "\n";
        }
        return text;
    }

    public List<String> cityByPriceArray(int pagesA, int pagesB)
    {
        List<String> cities = new ArrayList<>();

        for (Map.Entry<Book, String> e : books.entrySet())
        {
            if (e.getKey().getPages() >= pagesA && e.getKey().getPages() <= pagesB)
            {
                cities.add(e.getValue());
            }
        }
        return cities;
    }

    public double numberOfPagesAverage()
    {
        double sum = 0;
        for (Map.Entry<Book, String> e : books.entrySet())
        {
            sum += e.getKey().getPages();
        }
        return sum / books.size();
    }

    public Book oldestBook()
    {
        Map<Book, String> mapa = new TreeMap<>((k1,k2) -> (k2.getPublication_date() - k1.getPublication_date()));
        mapa.putAll(books);

        Iterator<Map.Entry<Book,String>> it = books.entrySet().iterator();
        if (it.hasNext())
        {
            return it.next().getKey();
        }
        return null;
    }

    public int booksFromTheCity(String city)
    {
        int counter = 0;
        for (Map.Entry<Book, String> e : books.entrySet())
        {
            if (e.getValue().equals(city))
            {
                counter++;
            }
        }
        return counter;
    }

}
