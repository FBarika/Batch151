package practice.b151practices.day15practice;

public class Isci extends Muhasebe{

    protected String isciStatu="Sürekli Isci";
    protected void mesai(){
        System.out.println("Isciler günlük 8 saat ve hafatda 5 gün calisir.");
    }
    //bu class dan da obje olusturabiliriz.Bu class in child class larinin olmasi obje olusturmaya engel degil
    //fakat isciler icin, sürekli isci ve ustabasi olmaktan baska ihtimal olmadigi icin isci class indan isci üretmeye gerek yok.

}
