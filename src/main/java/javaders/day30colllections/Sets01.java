package javaders.day30colllections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/*
    1)Set ler tekrarsiz eleman(unique) depolamak icin kullanilir.
    2)3 tane Set class vardir.
    i)HashSet Class:
         "Hash" demek benzersiz id olusturma teknigidir. Bu teknige "Hashing Technique" denir.
         "HashSet" elemanlari rastgele siralar.
         "HashSet" elemanlari siralamadigindan cok hizli calisir.
         "HashSet" ler "null" i eleman olarak kabul eder.(1 tane koyabiliriz tekrarsiz eleman depoladigi icin)
         "HashSet"ler tekrarsiz eleman depolamak icindir.

    ii)LinkedHashSet Class:
       "LinkedHashSet" ler elemanlari sizin verdiginiz siraya göre dizdiklerinden "HashSet" lere göre yavastirlar.(insertion order)
       "LinkedHashSet" tekrarsiz eleman depolamak icindir.
    iii)TreeSet Class:
       "TreeSet" ler elemanlari natural order a göre dizerler."TreeSet" ler elemanlari natural order a göre dizdiklerinden cooook yavastirlar.
       En yavas set TreeSet tir.
    3)TreeSet cok yavas oldugundan mümkün oldugu kadar TreeSet kullanmamaya calisiriz.
  */
public class Sets01 {
    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<>();
        hs.add("Ajda");
        hs.add("Cüneyt");
        hs.add("Esra");
        hs.add("Zeki");
        hs.add("Ezel");
        hs.add("Cüneyt");//tekrarli eleman ekledigimizde hata vermez ama tekrarli elemani sadece bir kere ekler.
        hs.add(null);//"null" i hashSet hep en basa koyar. null degeri 0 dir bu yüzden hep en basa koyar.
        hs.add(null);//tekrarli null koydugumuzda da null i bir kere yazdirir.
        System.out.println(hs);

        System.out.println(hs.hashCode());//Java her data icin tekrarsiz bir id üretir bu id yi görmek icin hashcode methodu ile görebiliriz.

        hs.clone();//aynisindan üretiyor
        hs.clear();//bütün elemanlari siler hashset i bosaltmak istiyorsak bunu kullaniriz.


        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(234);
        lhs.add(87);
        lhs.add(-32);
        lhs.add(124);
        lhs.add(null);//[234, 87, -32, 124, null] null ekledigimizde sona koyar biz sonda ekledigimiz icin.
        lhs.add(null);// 2 tane null ekledigimizde sadace bir tane yazdirir yine tekrarsiz eleman depoladigi icin
        System.out.println(lhs);//[234, 87, -32, 124]

        LinkedHashSet<Integer> ls = new LinkedHashSet<>();
        ls.add(451);
        ls.add(87);
        ls.add(231);
        ls.add(124);

        lhs.retainAll(ls);
        System.out.println(lhs);//[87, 124] ==> ilk LinkedHashSet teki farkli elemanlar silindi.Yani ilk LinkedHashSet teki ortak elemanlari bize verir.
        System.out.println(ls);//[451, 87, 231, 124]


        TreeSet<Character> ts = new TreeSet<>();
        ts.add('G');
        ts.add('A');
        ts.add('Z');
        ts.add('R');
        ts.add('U');
        ts.add('R');// tekrarli eleman koydugumuzda yine bir kere yazdirir.
        //ts.add(null); treeSet lere null eklenemez alfabetik siraya göre dizdiginden basa mi sona mi koyacagini bilemez.
        System.out.println(ts);//[A, G, R, U, Z]

        System.out.println(ts.first());//A
        System.out.println(ts.last());//Z

        System.out.println(ts.lower('R'));//G  Verilen eleman olan 'R' den bir önceki elemani verir.
        System.out.println(ts.lower('D'));//'A' verir. Olmayan elemanlar icin de kullanilir.'D' olsaydi listte de A dan sonra olacakti o yüzden A yi veriyor.

        System.out.println(ts.higher('K'));//R Verilen eleman 'K' dan sonraki elemani verir.(K olsaydi R den önce olacakti)

        System.out.println(ts.headSet('R'));//[A, G] 'R' ye kadar olan elemanlari verir.Parantez icindeki R dahil degildir.
        System.out.println(ts.headSet('R', true));//[A, G, R] bu method la 'R yi dahil ettik


        System.out.println(ts.tailSet('G'));//[G, R, U, Z] ==> Parantez icindeki 'G' de dahildir.G den baslayip ondan sonraki tüm elemanlari verecek.
        System.out.println(ts.tailSet('G', false));//[R, U, Z] burada parantez icindeki 'G' dahil degildir.

        System.out.println(ts.ceiling('R'));//R ==> eleman Set in icinde varsa elemanin kendisini return eder.Eleman Set in icinde yoksa sonraki eleman return eder.
        System.out.println(ts.ceiling('K'));//K==> burda 'K' setin icinde degil ama olsaydi 'K' dan sonraki 'R' yi verir.
        //Note higher her zaman sonraki elemani veriyor ama ceiling eleman varsa kendisini veriyor yoksa sonrakini veriyor.

        System.out.println(ts.floor('G'));//G ==> eleman Set in icinde varsa elemanin kendisini return eder.
        System.out.println(ts.floor('J'));//G ==> eleman Set in icinde yoksa önceki elemani return eder.

        System.out.println(ts.subSet('G', 'Z'));//[G, R, U] Z dahil degil 'U' almak icin illaki parametreye TreeSet teki elemani yazmak zorunda degiliz 'V' de yazabiliriz ikinci kisma.
        System.out.println(ts.subSet('G', false, 'Z', true));//[R, U, Z]



    }
}

