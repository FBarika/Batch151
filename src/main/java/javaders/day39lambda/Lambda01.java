package javaders.day39lambda;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {
        List<String> myList =new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Tom");
        myList.add("Clara");
        myList.add("Angelina");

        printElements(myList);
        System.out.println();
        printEl(myList);
        System.out.println();
        printElExceptStartsWithT(myList);
        System.out.println();
        printElLenghtLessThanFour(myList);
        System.out.println();
        printElLenghtMoreThanFourWithUpper(myList);
        System.out.println();
        printElLenghtMoreThanFourUniqueLowerCase(myList);
        System.out.println();
        printElUniqueToUpperCaseSorted(myList);
        System.out.println();
        printElUniqueLowerCaseSortWithLenght(myList);


    }
    //Ex 1: Bir List teki elemanlari console a yazdiran methodu olusturunuz.
    //1.Yol
    public static void printElements(List<String> myList){
        for (String w:myList) {  // bu koda yapisal kod(Structured Programming) denir

            System.out.print(w+" ");

        }
    }

    //2.Yol
    public static void printEl(List<String> myList){
        myList.stream().forEach(t-> System.out.print(t+" ")); //Functional programming(sadece methodlarin kullanildigi, yapinin ve mimarinin önemsiz oldugu proglamadir.)
        //stream() List'in yapisini yukaridan asagiya olacak sekilde degistirir.
        // stream e dönüstürdügümüzde daha cok method kullanabiliriz.
    }

    //Ex 2: Bir List teki t ile baslayanlar haric tüm elemanlari console a yazdiran methodu olusturunuz.
    public static  void printElExceptStartsWithT(List<String> myList){
        myList.stream().filter(t-> !t.startsWith("T")).forEach(t-> System.out.print(t+" "));//Jim Clara
        //filter() methodu eleme anlamina gelir burada ! isareti koyarak "T" ile baslayanlari eleme dedik.
        //Datayi azaltan method'lar en basta kullanilmalidir; filter() methodu gibi
    }
    // Ex 3:Bir List te karakter sayisi 4 den az olan tüm elemanlari console a yazdiriniz.
    public static void printElLenghtLessThanFour (List<String> myList){
        myList.stream().filter(t-> t.length()<4).forEach(t-> System.out.print(t+" "));//Tom Jim
    }

    //Ex 4: Bir List te karakter sayisi 4 den cok olan tüm elemanlari büyük harflerle console a yazdiran methodu yaziniz.

    public static void printElLenghtMoreThanFourWithUpper(List<String> myList){
        myList.stream().filter(t-> t.length()>4).map(t-> t.toUpperCase()).forEach(t-> System.out.println(t+" "));//CLARA
        //map() methodu var olan elemani degistiriyor.Burada toUpperCase() methodu kullanmak icin önce map() methodunu kullanmak gerekti.
        //map() var olan elemanin yapisini degistirir.
    }

    //Ex 5: Bir List te karakter sayisi 4 den cok olan tüm elemanlari tekrarsiz olarak kücük harflerle console a yazdiran methodu yaziniz.
    public static void printElLenghtMoreThanFourUniqueLowerCase(List<String> myList){
        myList.     //Functional programming de her noktadan sonra asagi ineriz o zaman kodumuz cok okunur hale gelir.
                stream().
                distinct().//distinct() methodu tekrarli elemanlari bir kere gosterir.
                filter(t-> t.length()>4).
                map(t-> t.toLowerCase()).
                forEach(t-> System.out.print(t+" "));//clara angelina
        //distinct() methodu tekrarli elemanlari bir kere yazdiran method
        //bazen filtrelemenin kurali cok komplike olur ve az elemanla calismak gerekir o zaman
        // distinct() methodu en önce kullaniriz eleman sayisini bastan azaltiriz.
        //özet olarak lambda da elemanlari azaltan methodlar %90 önce kullanilir.(bazen önce elemanlari update edip sonra eleman azaltmak gerekebilir istisna olarak)
        // Lazim olan elemanlar elimize geldikten sonra biz onu istedgimiz formata sokariz.
    }

    //Ex 6: Bir List teki elemanlari  tekrarsiz olarak büyük harflerle alfabetik sirada console a yazdiran methodu yaziniz.

    public static void printElUniqueToUpperCaseSorted(List<String> myList){
        myList.
                stream().
                distinct().
                map(t-> t.toUpperCase()).
                sorted(). // bu method alfabetik siraya göre burada siralar.genel olarak natural order a göre siralar.
                forEach(t-> System.out.print(t+" "));//ANGELINA CLARA JIM TOM
    }
    //sorted() methodu natural order olarak calisir.String datalar icin A-Z integer 1-9999
    //tersten siralamada reverse order dir.

    //Lmbda collectionlarda, arraylerde,bizim olusturcagimiz araliktaki datalarda da kullanilir,file larda da kullanilir,..
    //Lambda collection ve listlerde kullanilabilir fakat map'lerde kullanilamaz
    //Ex 7: Bir List teki elemanlari  tekrarsiz olarak kücük harflerle uzunluklarina göre kücükten büyüge siralayarak  console a yazdiran methodu yaziniz.
      public static void printElUniqueLowerCaseSortWithLenght(List<String> myList){
        myList.stream(). //stream() List'in yapisini yukaridan asagiya olacak sekilde degistirir.
                distinct().
                map(t-> t.toLowerCase()).
                sorted(Comparator.comparing(t-> t.length())).//Eger siralamanin kuralini biz belirleyeceksek ikinciyi kullaniriz iki tane var sorted.
                forEach(t-> System.out.print(t+" "));//tom jim clara angelina

      }






































}
