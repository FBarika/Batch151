package javaders.day31collectionsmaps;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queues02 {
    public static void main(String[] args) {

        Queue<String> line = new PriorityQueue<>();//Constructor LinkedList olmadigi icin bizim yazdigimiz siraya göre degil
        // priority nin mantigina göre dizilecekler.Priority öncelik demektir .Öncelige göre siralama olacak.Kod yazan bu önceligi belirler.
        //Biz belirlemezsek Java rkada kendine göre bir kural belirler ona göre dizer ama bize söylemez.
        line.add("Milk");
        line.add("Meat");
        line.add("Egg");
        line.add("Orange");
        line.add("Tomatoes");
        System.out.println(line);//[Egg, Milk, Meat, Orange, Tomatoes]

        // Deque => Double ended Queue==> iki uclu  queue iki uclu senaryolar icin deque kullaniriz.
        //Deque'daki add(), get(), peek(), poll() remove() methodlari first-last seklinde iki uclu olarak bulunur.
        //mesela queue kullandigimizda sondaki elemani almak icin kod yazmak gerekir ama deque ile lastget ile kolayca aliriz.
        Deque<String> d=new LinkedList<>();
        d.add("Milk");
        d.add("Meat");
        d.add("Egg");
        d.add("Orange");
        d.add("Tomatoes");




























































































    }//main
}//class
