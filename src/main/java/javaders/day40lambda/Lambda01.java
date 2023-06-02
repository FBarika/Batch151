package javaders.day40lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {
        List<String > iller = new ArrayList<>(Arrays.asList("Van","MUS","Gumushane","Kutahya","Ankara","MUS","Ordu","Gaziantep","Hatay","Edirne"));
        bykHrfLenghtArtanDistinct(iller);
        System.out.println();
        bykHrfSonHarfArtanDistinct(iller);
        System.out.println();
        bykHrfLenghtArtanDistinctLenghtAlfabetik(iller);
        System.out.println();
        System.out.println(krktrSysBesFzlOlanlariSil(iller));//[Van, MUS, MUS, Ordu, Hatay]
        System.out.println();
        System.out.println(hIleBaslayanOruileBitenElSil(iller));//[Van, MUS, MUS]
        System.out.println();
        System.out.println(elKarakterSayilarininKareleriniAl(iller));//[9, 9, 9]
        System.out.println();
        System.out.println(karakterSayisiCiftOlanlariListYazdir(iller));
        System.out.println();


    }
    // 1) Tum list elemanlarini buyuk harfle, uzunluklarina gore, artan sirada ,tekrarsiz olarak yazdiriniz
     public static void bykHrfLenghtArtanDistinct(List<String > iller){
        iller.stream().
                distinct().
                map(t-> t.toUpperCase()).
                sorted(Comparator.comparing(t->t.length())).
                forEach(t-> System.out.print(t+" "));//VAN MUS ORDU HATAY ANKARA EDIRNE KUTAHYA GUMUSHANE GAZIANTEP

     }

    // 2) Tum list elemanlarini buyuk harfle, son harflerine gore, artan sirada ,tekrarsiz olarak yazdiriniz
    public static void bykHrfSonHarfArtanDistinct(List<String> iller){
        iller.stream().
                distinct().
                map(t->t.toUpperCase()).//Lambda Expression
                sorted(Comparator.comparing(t->t.charAt(t.length()-1))).// son harfe göre siralama
                forEach(t -> System.out.print(t + " "));//KUTAHYA ANKARA GUMUSHANE EDIRNE VAN GAZIANTEP MUS ORDU HATAY

    }


    // 3) Tum list elemanlarini buyuk harfle, uzunluklarina gore artan sirada ,tekrarsiz olarak yazdiriniz.
    // Uzunluklari ayni olan elemanlar alfabetik sirada olsunlar
    public static void bykHrfLenghtArtanDistinctLenghtAlfabetik(List<String> iller){
        iller.stream().distinct().
                map(String :: toUpperCase).//bu yönteme method refence yöntemi denir.
                sorted(Comparator.comparing(String :: length).thenComparing(Comparator.naturalOrder())).
                forEach(System.out ::println);//Method Reference da bu sekilde yaziliyor.
                // Burada alt alta yazdiriyor print ve bosluk yapida method refence da yazamiyoruz burada.println icin özel bir method olusturmak zorundayiz.
                // forEach(t -> System.out.print(t + " ")) ==> Lambda expressionda bu sekildeydi.

    }

    // 4) Karakter sayisi 5 ten fazla olanelemanlari siliniz
    public static List<String> krktrSysBesFzlOlanlariSil(List<String> iller){
        iller.removeIf(t-> t.length()>5);//burada stream() yapinca silme methodu bulamayinca stream yapmayip önce removeIf() methodunu sildik.
        //bazen stream() methodunu cagirdigimizda bazi methodlara ulasamayabiliriz.
        //removeIf() methodu silme islemi bir sarta bagli ise kullaniriz
        //illaki stream() methodu ile baslamak zorunda degiliz.
        return iller;
    }



    // 5)"H" ile baslayan veya "r" ile biten elemanlari siliniz
    public static List<String> hIleBaslayanOruileBitenElSil(List<String> iller){
      iller.removeIf(t-> t.startsWith("H") || t.endsWith("u"));
      return iller;
    }


    // 6) List elemanlarini karakter sayilarinin karelerini aliniz Ve bir list olarak ekrana yazdirin
    public static List<Integer> elKarakterSayilarininKareleriniAl(List<String> iller ){
        return iller.
                stream().
                map(t->t.length() * t.length()).
                        collect(Collectors.toList());
    }



    //  7) List elemanlarindan karakter sayisi cift sayi olanlari bir list icinde ekrana yazdiriniz.
    public static List<String> karakterSayisiCiftOlanlariListYazdir(List<String> iller ) {
        System.out.print("7) ");
        return  iller.
                stream().
                filter(t->t.length() %2 ==0).
                        collect(Collectors.toList());
    }
}
