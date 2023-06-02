package javaders.day44lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) throws IOException {
        //Example 1:Verilen text file icindeki text i console a yazdiran kodu yaziniz.
        //console da satir satir görmek icin foreach() kullandik en sonda.

        Files.lines(Paths.get("src/main/java/javaders/day44lambda/myTextFile.txt")).forEach(System.out::println);//ln olmasi lazim cünkü ilk satir yazdircak asagiya inecak ikinci satir yazdircak asagi inecek.
        //lines() methodu bize TextFile daki satirlari birer birer verir ve stream in icinde verecek.Bu sebeple stream'deki bütün methodları burada kullanabiliriz.
        //lines() methodunda adres Paths.get() methoduyla konulur!!!
        //lines() kizariyor sonra method signature exception ekledik.

        System.out.println();

        // Example 2 : Verilen text file icindeki text'i buyuk harflerle console' a yazdiran code u yaziniz.
        Files.lines(Paths.get("src/main/java/javaders/day44lambda/myTextFile.txt")).map(String::toUpperCase).forEach(System.out::println);

        //Example 3 : Verilen text file icindeki text'lerde "Java" kelimesinin olup olmadigini kontrol eden code u yaziniz.

        boolean r1 = Files.lines(Paths.get("src/main/java/javaders/day44lambda/myTextFile.txt")).anyMatch(t -> t.contains("Java"));
        System.out.println(r1);//true


        //Example 4 : Verilen text file icindeki text'lerde kullanilan farkli kelimeleri bir list icinde return ediniz.
        List<String> words = Files.lines(Paths.get("src/main/java/javaders/day44lambda/myTextFile.txt")).
                map(t -> t.replaceAll("\\p{Punct}", "").
                        split(" ")).//burada split() yaptiktan sonra birinci satir array in icinde olacak ikinci satir bir baska arry in icinde olacak ücüncü ve dördüncü de ayni sekilde.
                        flatMap(Arrays::stream).//Bunu kullanmadan önce yukarida 4 adet array var. flatMap() ile array duvarlari yikilacak sonra elemanlari stream in icine koyacak.Biz de kelimelerle calisma imkani bulucaz.
                        distinct().//kelimelerden tekrarli olanlardan bir taneisni alacak.
                        collect(Collectors.toList());//bu kelimeleri list in icine koyacak.

        System.out.println(words);//list i yazdirdik.
        //ister map() icinde birden fazla method kullanabiliriz.(burada replaceAll ve split kullandik)
        //ister map() i tekrarli kullanarak ayri ayri methodlari yazabiliriz.

        //Example 5: Verilen text file icindeki text'de toplam kac harf kullanildigini gosteren kodu yaziniz.
        List<String> letters = Files.lines(Paths.get("src/main/java/javaders/day44lambda/myTextFile.txt")).
                map(t -> t.replaceAll("[^a-zA-Z]", "").
                        split("")).
                flatMap(Arrays::stream).
                collect(Collectors.toList());
        System.out.println(letters);
        System.out.println(letters.size());

        /*2.yol
        long numOfLetters = Files.lines(Paths.get("src/day44lambda/myTextFile.txt")).
                map(t->t.replaceAll("[^A-Za-z]","")).
                map(t->t.split("")).
                flatMap(Arrays::stream).
                count();// count() methodu elemanlarin sayisini veriyor ve long data type döndürüyor.

        System.out.println(numOfLetters);
         */
//count() sonra . koydugumuzda hic method göstermiyor ama flatMap() den sonra bir sürü method görüyoruz.anyMatc() de count() gibi method yok
//count() gibi kendisinden sonra method kullanilmasina müsade etmeyen methodlara TERMINAL METHOD denir.


        //Example 5: Verilen text file icindeki text'de kullanilan tum harfleri alfabetik olarak ters sirada bir listin icinde return eden kodu yaziniz.

        List<String> kelimeler =   Files.
                lines(Paths.get("src/main/java/javaders/day44lambda/myTextFile.txt")).
                map(t->t.replaceAll("[^A-Za-z]","")).
                map(t->t.split("")).
                flatMap(Arrays::stream).
                sorted(Comparator.reverseOrder()).//bu arada alfabetik olarak ters siraladik.
                collect(Collectors.toList());
        System.out.println(kelimeler);




    }

}
