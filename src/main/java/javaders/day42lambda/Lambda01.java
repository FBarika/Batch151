package javaders.day42lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Alex");
        names.add("Jim");
        names.add("Michael");
        names.add("Mary");
        names.add("Alexander");
        names.add("Alex");


        System.out.println(sortWithLastCharDistinctUpperInList(names));//[MICHAEL, TOM, JIM, ALEXANDER, ALEX, MARY]
        System.out.println();
        System.out.println(sortWithLenghtReversedSameLenghtInNaturalOrderLowerInList(names));//[alexander, michael, alex, alex, mary, jim, tom]
        System.out.println();
        System.out.println(isLenghtMoreThanTwo(names));//true
        System.out.println();
        System.out.println(noLenghtLessThanThree(names));//true
        System.out.println();
        System.out.println(atLeastOneLenghtLessThanFour(names));//true
        System.out.println();


    }
   // Example 1 :List elemanlarini son harflerine göre natural order da tekrarsiz olarak büyük harfle bir List in return ediniz.

   public static List<String> sortWithLastCharDistinctUpperInList(List<String> names){
      return names.stream().
               distinct().
               map(String ::toUpperCase).
               sorted(Comparator.comparing(t-> t.charAt(t.length()-1))).
               collect(Collectors.toList());//normalde distinct elemanlari depolamak icin "Set" kullanilir.
                                            // Ama lambdadaki collect(Collectors.toSet()) methodu elemanlari rastgele siralar,
                                            // halbuki bu soruda rastgele siralama kabul edilmiyor.Bu yüzden mecburen toList kullandik.
//collect(Collectors.toList()) methodu bir araya getir List in icine koy demektir.
//collect(Collectors.toSet()) methodu bir araya getir Set in icine koy demektir
   }
   //Example 2: List elemanlarini karakter sayilarina göre ters sirada kücük harfle bir List in icinde return ediniz,
   //Ayni karakter sayisina sahip elemanlar ilk karakterine göre siralansin.

   public static List<String> sortWithLenghtReversedSameLenghtInNaturalOrderLowerInList(List<String> names){
       return names.
               stream().
               map(String ::toLowerCase).
               sorted(Comparator.comparing(String ::length).reversed().thenComparing(t->t.charAt(0))).
               collect(Collectors.toList());

        //Comparator.reserveorder sadece alfabetik olarak tersten siralasa deseydik bunu sececektik
   }

   //Example 3:List elemanlarinin tamaminin karakter sayisinin 2'den büyük olup olmadigini kontrol eden methodu olusturunuz.
    public static boolean isLenghtMoreThanTwo(List<String> names){
       return names.stream().allMatch(t-> t.length()>2);
        //Bu soruda yeni olan seyler: allMatch methodu, elemanlarin karakter sayilarina bakip 2'den buyuk mu diye kontrol edecegiz.
        //Bunu normalde for each loop ile yapabiliriz. Ancak simdi Lambda ile cozecegiz.
        //Methodun return type'nin boolean olmasi mantikli. Parnatezi icine listimizi koyduk.
        //Sirasiyla names.stream().allMatch(t->t.length()>2)
        //Sorumuzda elemanlarin tamami dendiginden allMatch methodunu sectik. Herbir elaman alinacak ve karakter sayilarina
        //bakacak, 2'den buyukse true verecek aksi halde false verecek.
    }

    //Example 4: List elemanlarinin hicbirisinin kaakter sayisinin 3 den kücük olmadigini kontrol eden methodu olusturunuz.

    public static boolean noLenghtLessThanThree(List<String> names){
       return names.stream().noneMatch(t->t.length()<3);
    }
    //nonMatch() allMatch() tersidir.

    //Example 5:List elemanlarinin en az birinin karakter sayisinin 4 den kücük olup olmadigini kontrol eden methodu olusturunuz.

    public static boolean atLeastOneLenghtLessThanFour(List<String> names){
       return names.stream().anyMatch(t-> t.length()<4);
       //anyMatch() sarta bir tanesi bile uyarsa true döndürür.
    }
    /* Match
allMatch() ==> tum elemanlar sarti saglarsa true dondurur
anyMatch() ==>bir yada birden daha fazla eleman sarti saglarsa true dondurur
noneMatch() ==>hic bir eleman sarti saglamazsa true dondurur
    */

















}

