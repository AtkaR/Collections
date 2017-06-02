package rybak.agata.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by asus on 2017-06-02.
 */
public class Main {

    public static void main(String[] args) {
        List<Book> books = new ArrayList<Book>();

        books.add(new Book("TYTUL1", "AUTOR1", 13));
        books.add(new Book("TYTUL2", "AUTOR2", 13));
        books.add(new Book("TYTUL3", "AUTOR3", 13));
        books.add(new Book("TYTUL4", "AUTOR4", 13));

        Book k = new Book("QWERTY", "AAA", 43);
        books.add(2, k);

        books.remove(3);
        books.remove(k);

        Book[] tab = new Book[]{
                new Book("tyt1", "aut1", 12),
                new Book("tyt2", "aut2", 11),
                new Book("tyt3", "aut3", 15),
                new Book("tyt4", "aut4", 16)
        };


        List<Book> books2 = Arrays.asList(tab);
        //books2.add(new Book());


		/*List<Book> books3 = Arrays.asList(new Book[]{
				new Book("tyt1", "aut1", 12),
				new Book("tyt2", "aut2", 11),
				new Book("tyt3", "aut3", 15),
				new Book("tyt4", "aut4", 16)
			});*/


        List<Book> books3 = new ArrayList<Book>(Arrays.asList(tab));
        books3.add(new Book());

        books3.set(1, new Book("tyt2", "aut1", 20));

        for (int i = 0; i < books3.size(); i++)
        {
            System.out.println(books3.get(i));
            books3.get(i).getAuthor();
        }
        System.out.println("======================================");
        System.out.println(books3.size());
        System.out.println(books3.get(1));
        System.out.println("======================================");

        for(Book k1 : books3)
        {
            System.out.println(k1);
            k1.getAuthor();
        }

        Consumer c = new Consumer<Book>() {

            @Override
            public void accept(Book t) {
                // TODO Auto-generated method stub

            }
        };

        books3.forEach((t) -> {System.out.println(t);});

        if (books3.contains(new Book("tyt1", "aut1", 12)))
        {
            System.out.println("THERE IS SUCH A BOOK");
        }


        List<Book> l2 = new ArrayList<Book>();
        l2.add(new Book("tyt1", "aut1", 12));
        l2.add(new Book("tyt2", "aut2", 11));

        if (books3.containsAll(l2))
        {
            System.out.println("books3 contains every el. from l2");
        }

        List<Book> kk = books3.subList(0, 2);

        books3.removeAll(l2);

		/*
		UnaryOperator<Book> uo = new UnaryOperator<Book>() {

			@Override
			public Book apply(Book arg0) {
				// TODO Auto-generated method stub
				return null;
			}
		};*/
        books3.remove(books3.size()-1);
        books3.replaceAll(k1 -> (new Book(k1.getTitle().toUpperCase(), k1.getAuthor().toLowerCase(), k1.getPrice()-10)));

        books3.forEach(o -> {System.out.println(o);});

		/*
		Predicate<Book> p = new Predicate<Book>() {

			@Override
			public boolean test(Book t) {
				// TODO Auto-generated method stub
				return false;
			}
		};*/

        //books3.removeIf(o -> (o.getPrice() > 5));

        System.out.println("--------------------");
        //books3.forEach(o -> {System.out.println(o);});

        books3.sort((c1, c2) -> {
            if (c1.getPrice() > c2.getPrice())
            {
                return -1;
            }
            else if (c1.getPrice() < c2.getPrice())
            {
                return 1;
            }
            return 0;
        });

        books3.forEach(o -> {System.out.println(o);});

    }

}
