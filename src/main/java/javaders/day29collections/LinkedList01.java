package javaders.day29collections;
/*
Java daki collectionlar da ayni tipteki datalari depolayan yapilardir. Simdiye kadar collectionlardan List leri ögrendik.
Array ler de coklu yapida datadir ama collection degildir.
Array lerin yapisi ilkeldir.En basta belirttigimiz sayida eleman alabilirler esnek degillerdir.

En tepede Collection diye bir interface var.Collection in altinda 3 tane daha interface var;1)List 2)Queue 3)Set
List lerin altinda class larak arryList ve LinkedList var. Queue ve Deque interface ama Queue altinda class Priority class var.
Set bir interface. SortedSet de bir interface Set in altinda ama. Set altinda HashSet ve LinkedSet classlari var; Sorted Set in altinda TreeSet clas

LinkedList lerin Yapisi:
LinkedList lerin icinde iki bölmeden olusan kutular var.Bu kutularin ilk bölümünde data var.Ikinci bölümünde bir sonraki elemani gösteren pointer i iceriyor.
En sondaki elemanin pointer i null i gösterir.Ilk elemani gösteren "Head" ismi verilen data bölümünü icermeyen sadece pointer bölümünü icerir bir yapi var.
en sondaki null i gösterene tail denir.bu kutucuklarin herbirine eleman degil  "node" diyecegiz.head ve null node degildir onlar node olarak sayilmaz.
LinkedList hakkinda konusurken node diye konusacagiz.eleman diye degil.Bu yapida eleman silerken silinecek elemandan önceki oku ve sonraki oku silip yeni bir ok olusturup
o okla diger elemanlari birbirine baglar.LinkedListler index kullanmaz.yeniden indexleme yapmaz.
Eleman eklemede iki elemanin arasindaki ok siler ve oraya yeni elemeni koyup diger elemanlarla oklarla birlestirir pointer lerden.


Note:ArrayList ler eleman silme ve eklemede tekrar indexleme yapmak zorunda olduklarindan eleman ekleme ve silmede basarisizdirlar.
Ama ArrayListler elemen bulmada index kullanarak direk bulurlar.LinkedList ler eleman bulmada basarisiz.
Java bunun icin yeni bir yapi olusturmus:LinkedList; bu yapi tekrar indexleme yapmak zorunda kalmiyor
ve elemen ekleme ve silmeyi cok kolay yapiyor.
1)LinkedList ler index kullanmiyor.Bu yüzden node ekleme ve silme islmelerinde tekrar indexleme yapilmaz.
2)LinkedList lerde node ekleme ve silme islemleri yaparken sadace pointerlari degistirir.
 */

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

/*
1)LinkedListler node silme ve eklemede cok basarili olduklari icin,silme ve ekleme islemlerini coklukla yapacaginiz zaman LinkedList kullaniniz.
2)ArrayList ler indexleri adres gibi kullanir bu yüzden ArrayList ler search islemlerde cok basarilidirlar.
Note:Ihtiyaciniz olan collection cogunlukla silme ve ekleme islemleri yapacaksa (müze ziyaretcileri gibi)LinkedList;
 search islemleri yapacaksa (amerika eyaletleri gibi) ArrayList kullaniniz.

 Bütün collection lar non-primitive data taype kullanir.!!!LinkedListler de non-primitive kullanir.
*/
public class LinkedList01 {
    public static void main(String[] args) {


        LinkedList<String> s = new LinkedList<>();
        s.add("Esra");//bunu sonradan ekledik.
        s.add("Steve");
        s.add("Ajda");
        s.add("Müge");
        s.add("Cüneyt");
        s.add("Esra");
        s.add(2,"Esen");
        s.addFirst("Kemal");
        s.addLast("Ajdar");
        System.out.println(s);

        s.remove(2);//2. index dekini siliyor.
        System.out.println(s);

        s.remove("Ajdar");
        System.out.println(s);//verilen objedekini siliyor.

        s.remove();//ilk elemani siler.removeFirst de ilk elemani siler.removeLast son elemani siler.
        System.out.println(s);

        s.removeFirstOccurrence("Esra");// ayni olan elemanlardan ilkini siliyor bu method.
        System.out.println(s);//[Kemal, Steve, Esen, Ajda, Müge, Cüneyt, Esra, Ajdar]

        s.removeLastOccurrence("Esra");// ayni olan elemanlardan sondakini silen method.
        System.out.println(s);

        /*
        Retrieves, but does not remove, the head (first element) of this list.
        @return the head of this list, or {@code null} if this list is empty
        */

        String r1=s.peek();//ilk elemani bize getirir ama silmez.(copy+paste)
        System.out.println(r1);//Esen
        System.out.println(s);//[Esen, Ajda, Müge, Cüneyt]

        String r2=s.poll();//ilk elemani bize verir ama elemani List ten siler.
        System.out.println(r2);//Esen
        System.out.println(s);//[Ajda, Müge, Cüneyt]

        /*
        Retrieves, but does not remove, the head (first element) of this list.
        throws NoSuchElementException if this list is empty
        Note:peek() ile element() ikisi de ilk elemani silmeden size verir.
            Ama peek() list bos oldugunda size "null" verir,element() ise "hata" verir.
        */

        String r3=s.element();//ilk elemani silmeden size verir(copy+paste)
        System.out.println(r3);
        System.out.println(s);


       /*
       Removes and returns the first element of this list.
       @throws NoSuchElementException if this list is empty
       Note:poll() ile pop() ikisi de ilk elemani siler ve size verir.
            Ama poll() list bos oldugunda size "null" verir,pop() ise "hata" verir.
       */
        String r4=s.pop();//ilk elemani siler size verir(cut+paste)
        System.out.println(r4);
        System.out.println(s);



        /*
        Note:Set tekrarsiz elemanlar ornegin email adresleri, tel no, kimlik nolarini depolamak icin Set kullanilir.
        HashSet ve devami ne zaman kullanilir?
        HashSet setlerin en hizlisi olup hiz ihtiyaci olunca bunu kullanin. HashSet siralama yapmaz.
        LinkedHashSet elemanlarin girilen siraya gore dizilmesi icin kullanilir.LinkedHashSet HashSet ten hizli olamaz cünkü siralama zaman ister.
        TreeSet elemanlari natural order'a gore dizmek icin kullanilir.
        */





























    }


}
