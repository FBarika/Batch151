package javaders.day19arraylistssüleymanhoca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ArrayList02 {
    /*
    Bir methodu ögrenirken asagidaki3 seyi ögrenin
     //O method ne iş yapar?
    //O method nasıl kullanılır?
    //O method size neyi verir?
     */
    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("Giresun");
        cities.add("Giresun");
        cities.add("Yozgat");
        cities.add("Yozgat");
        cities.add("Barcelona");
        cities.add("Miami");
        cities.add("Giresun");

        //ArrayList te bir elemanin ilk görünümü nasil silinir?

        System.out.println(cities.remove("Miami"));//sout la yazdirirsak boolean döndürür ve true der.
        // remove non-static bir method. cittie bir object oldugu icin.
        System.out.println(cities);//[Giresun, Giresun, Yozgat, Yozgat, Barcelona, Miami, Giresun]

        //ArrayList te bir eleman index i kullanarak nasil silinir?

        System.out.println(cities.remove(4));//burda sout la yazdirdiktan sonra String döndürecek ve bana Barcelona diyecek.
        // Barcelona silinecek yukaridaki örnekten sonra.Cünkü en bastaki Miami yi sildik ondan sonra index i saydik.
        System.out.println(cities);//[Giresun, Giresun, Yozgat, Yozgat, Miami, Giresun]

        // ArrayList olustururken en basa Arraylist yerine List de yazabiliriz.Sebebini Collections konusunda görecegiz.
        List<Integer> ages = new ArrayList<>();
        ages.add(23);
        ages.add(12);
        ages.add(7);
        ages.add(4);

        //Example: 12 elemanini ages List ten siliniz.
        ages.remove((Integer)12);//burda primitive int olur. Primitie int remove() method icinde kullaninca Java onu index kabul eder.
        // Java ya 12 nin index olmadigini söylemek icin primitive int yerine wrapper class integer kullanmaliyiz.
        System.out.println(ages);//[23, 7, 4] int list lerde elemani silmek istiyorsak onu wrapper Integer a cevirmemiz gerekiyor.

        //Bir ArrayList teki bir elemanin tüm görünümlerini nasil sileriz?

        List<String> citiesToRemove = new ArrayList<>();
        citiesToRemove.add("Giresun");//removeAll list le kullanilir önce silmek istedigimizi bir Listte koyacagiz ondan sonra removeAll la silecegiz.
        citiesToRemove.add("Yozgat");

        System.out.println(cities.removeAll(citiesToRemove));//true
        System.out.println(cities);//[Miami]


        // Kisa yoldan bir List olusturmak icin asadaki List.of() methodu kullanilabilir.
        List<Character> initials = List.of('a','k','c','d','k');// kisa yoldan eleman eklemeyi List.of() ile yapabiliriz.burda ArrrayListi kabul etmez.
        System.out.println(initials);//[a, k, c, d,k]

        List<Character> letters = List.of('a','k','c','d','k');
        System.out.println(letters);//[a, k, c, d,k]

        //iki ArrayList in birbirine esit olup olmadigini nasil anlariz?
        //equals() methodu ayni elemanlar ayni index te oldugu sürece true verir, farkli index lerde olursa false verir.
        boolean r1 =initials.equals(letters);
        System.out.println(r1);//true

        //indexOf() yazarsak 'k' nin ilk görünümünün indexini verir.
        int r2 =initials.indexOf('k');
        System.out.println(r2);//1

        //lastIndexOf() yazarsak 'k' nin son görünümünün indexini verir.
        int r3 =initials.lastIndexOf('k');
        System.out.println(r3);//4


        //Ex: Bir listteki tekrarsiz elemanlari console a yazdiran kodu yaziniz.
        List<Double> prices = List.of(2.5,1.25,2.5,3.75,1.25,4.0);

        for (Double w :prices) {
            if(prices.indexOf(w)==prices.lastIndexOf(w)){
                System.out.print(w+" ");//3.75 4.0
            }
        }
        System.out.println();
        //Example 2: Bir listte tekrarli elaman olup olmadigini gösteren kodu yaziniz.
        List<Double> heights = List.of(2.5,1.25,2.5,3.75,1.25,4.0);
        int counter =0;
        for (Double w :heights) {

            if(heights.indexOf(w)!=heights.lastIndexOf(w) ){
                counter++;
            }

        }
        if(counter==0){
            System.out.println("All elements are unique in the List");
        }else {
            System.out.println("At least one element is not unique in the List");


        }
        System.out.println("counter: " +counter);

        //2.yol benim cözümüm.
        List<Double> newheights = new ArrayList<>();
        int sayac=0;
        for (Double w :prices) {
            if(heights.indexOf(w)!=heights.lastIndexOf(w) && !newheights.contains(w) ){
              newheights.add(w);
              sayac++;
            }

        }
        System.out.println("sayac: "+sayac);
        System.out.println(newheights);//[2.5, 1.25]
        if(newheights.isEmpty()==false){
            System.out.println("eleman var");//eleman var
        }else{
            System.out.println("eleman yok");
        }






    }//main
}//class
