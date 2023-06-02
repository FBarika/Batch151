package javaders.day38enumsiterators;

import java.util.*;

public class Iterators01 {
    /*
    1)Iterator'lar loop larin yaptigi ayni isi yapar.Cünkü loop larda sonsuz loop tehlikesi var burada sonsuz loop olmadan loop yapabiliyor.
    2)Iterator larda sonsuz loop olusma ihtimali yok.
    3)Iterator ile loop lar arasinda performans farki yoktur ikisi de ayni hizda.
    4)Iteratorlar bir collectiondan eleman silme ve bir collectiondaki elemani degistirme konusunda daha basrilidir.
    5)Iki tip Iterator var.
    i)Iterator:Bu sadace eleman silmede kullanilir, eleman eklemek veya elemani degistirmek mümkün degildir.
    ii)ListIterator: Bu eleman silebilir, ekleyebilir ve degistirebilir.
    Note:"Iterator" sadece soldan saga calisir.(ilk elemandan son elemana)foreach loop gibi
         "ListIterator" ise iki yönlü calisabilir.
     */
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Angie");
        myList.add("Mark");
        System.out.println(myList);//[Tom, Jim, Clara, Angie, Mark]

        //biz hicbir elemanin degistirilmesini ve eklenmesini istemiyorsak iterator kullaniriz ve bu durumlari imkansiz hale getiririz.
        //Iterator kullanalim önce (iterator da 3 tane method var!!!!)
        //bunu yazinca java ayni elemanlari iterator yapisinin icine koydu. Ayni seyi görüyoruz ama bunlarin yapisi farkli.
        Iterator<String> myItr = myList.iterator();//bu method listi iterator a dönüstürüyor //[Tom, Jim, Clara, Angie, Mark]
        //obje olusturmak 2 türlü olur 1)yoktan var etmek 2) var olani degistirerek

        while(myItr.hasNext()){//hasNext() sonraki eleman var mi methodudur. burasi true sa asgaidaki next() methodu calisir.


                              //hasNext() pointer a senden sonra eleman var mi diye sorar; eleman varsa true, yoksa false döndürür.
            myItr.next();  //next() pointer i bir sonraki elemanin önüne tasir ve üstünden atladigi elemani return eder.

            myItr.remove();//next() methodunun return ettigi elemani siler.
            //eleman iterator da silindigi an list te de silinir.
        }
        System.out.println(myList);

        //ListIterator kullanalim.( ListIterator da iterator dan daha zengindir method acisindan)
        List<String> yourList = new ArrayList<>();
        yourList.add("Tom");
        yourList.add("Jim");
        yourList.add("Clara");

        System.out.println(yourList);// [ Tom,   Jim,   Clara ]

        ListIterator<String> yourListItr = yourList.listIterator();
        while (yourListItr.hasNext()){//hasnext() soldan saga gider hasPrevious() sagdan sola gider

            String el =yourListItr.next();
            yourListItr.set(el+"!");//set() methodu List i update etmeye yarar.


        }
        System.out.println(yourList);//[Tom!, Jim!, Clara!]

        //hasPrevious() ve previous() nasil kullanilir? pointer i en sona yollamadan hasPrevious() ve previous() kullanmanin manasi yoktur
        // yukarida hasNext ve next ile en sona yolladik zaten.
        while(yourListItr.hasPrevious()){// bu sonda duran pointer a soracak senden önce eleman var mi diye?
            //Eleman varsa "true" yoksa "false" return eder. Bu method sagdan sola dogru calisir

            String el = yourListItr.previous();//bu poiteri bir öncege atacak ve elemani bize verecek.
            System.out.println(el);
            yourListItr.set("?"+el);
        }
        System.out.println(yourList);//[?Tom!, ?Jim!, ?Clara!]

        //En sondan en basa nasil iterate edebiliriz?
        LinkedList<String> ourList = new LinkedList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Angie");
        myList.add("Mark");
        System.out.println(ourList);

        Iterator<String> ourListItr= ourList.descendingIterator();//descending demek tersten demektir.descending azalan siralama ascending artan siralama demektir.
        //descending methodu Iterator<String> döndürüyor.descendingIterator() ancak LinkedList ile kullanilabilir.
        while(ourListItr.hasNext()){
            String el = ourListItr.next();

            System.out.println(el);
        }
        //descending methodu ile elemanlari tersten almaya basliyoruz ve hasNext ve next le bir sonraki ver diyoruz loop göngüsü icinde.



    }
}
/*
iterator mekanizmasi nasil?baskasinin notlari!!!!!!
Main method icinde bir List olusturduk ve import ettik. Burada loop yerine Iterator kullandik.
Once List'i Iterator'a donusturmeliyiz ki Iterator icindeki methodlari kullanabilelim.
Listimizin ismini yazip nokta koyunca orada sirali methdolar icinde Iterator methodunu goruruz ve onu seceriz.
Bu method bize String Iterator verir. Oyle olunce String Iterator conteynarina ihtiyacimiz olur.
Biz de Iterator<String> myItr=myList.iterator() olarak conteynerimizi olusturduk. While loop kullandik.
While icine myItr.hasNext() yazarak iteratordaki sonraki eleman var mi diye soracagiz, varsa onu silmesini
isteyecegiz. Su sekilde devam ettik:
myItr.next();
myItr.remove();
Sonda sout icine myList yazarak elemanlari bir list icinde ekranda gorebildik. Iterator sayesinde sonsuz loop
tehlikesi ile karsilasmadik.
Biz bu kodu yazinca Java ayni elemanlari iterator yapisi icine koydu. Biz liste bakinca bir de iteratora bakinca
ayni seyi gorsek de yapi olarak farklidirlar. Fark: Ilk elemanin oncesine iterator bir pointer koyuyor.
Biz has.Next methodu kullaninca bu methodla ilk pointer'a gelip kendisinden sonra bir eleman var mi diye
sormus olduk. Pointer kendisinden sonra Tom olduguna isaret ediyor yani true oluyor. Daha sonra bir sonraki
elemanin onune java tarafindan konulan pointer'a gelip senden sonra eleman var mi diye methodumuz sormaya devam eder.
While loop condition'i true oldugu surece bir sonraki elemanin olup olmadigina bakilir.
Remove methodu ise gelip oldugu anlasilan ilk eleman silinir ve sonraki kisma gelir. Once has.Next sonra
remove methodu her eleman icin calisacak.
 */
