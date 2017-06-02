package rybak.agata.Queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by asus on 2017-06-02.
 */
public class Main {
    public static void main(String[] args) {

        Queue<String> k1 = new LinkedList<>();

        k1.add("agata");
        k1.add("krzys");
        k1.add("stefan");
        k1.add("paulina");

        //System.out.println(k1.element());
        //System.out.println(k1.remove());


		/*while(!k1.isEmpty())
		{
			System.out.println(k1.remove());
		}
		k1.remove(); */

        while(!k1.isEmpty())
        {
            System.out.println(k1.poll());
        }
        k1.poll();

        Queue<String> pq = new PriorityQueue<>((o1, o2)->(o2.compareTo(o1)));

        pq.add("Wojtek");
        pq.add("Edward");
        pq.add("Szczepan");
        pq.add("Bronchilda");
        System.out.println("---------------------");

		/*for (String s : pq)
		{
			System.out.println(s);
		}*/
        System.out.println("---------------------");
		/*
		while(!pq.isEmpty())
		{
			System.out.println(pq.remove());
		}
		*/

        Deque<String> dq = new LinkedList<>();
        dq.addLast("Janusz");
        dq.addFirst("Kunegunda");
        dq.addLast("Telimena");
        dq.addFirst("Bogumil");

        while(!dq.isEmpty())
        {
            //System.out.println(dq.removeLast());
            System.out.println(dq.removeFirst());
        }
    }
}
