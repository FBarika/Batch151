package javaders.day32maps;

import java.util.HashMap;

public class HashMap01 {
    public static void main(String[] args) {

        HashMap<String,Integer> stdAges =new HashMap<>();// ekledigimiz elemanlari rastgele dizer cok hizli calisir bu yüzden.Map ler bütün siralamalari key lere göre yapar.
        // Map lere entr ekelemek icin put() methodunu kullaniriz.
        stdAges.put("Ajda",77);
        stdAges.put("Ezel",38);
        stdAges.put("Tom",76);
        stdAges.put("Brad",58);
        stdAges.put("Angelina",58);//Mapler de key ler tekrarsiz olmalidir ama value lar tekrarli olabilir.
        stdAges.put("Tom",83);// tekrar eden key lerde son eklenen key yazdirilir.tekrarli koydugumuzda hata vermez ama son value yu verir.
        //"key" i tekrarli kullandigimizda hata vermez en son verilen entry i kabul eder.Bu yöntem value güncellemede kullanilabilir.Buna "overwrite" denir.

        //HashMap ler entry leri rastgele siralar bu yüzden cok hizli calisir.
        //Map ler entry leri siralarken "key" lere bakarak siralama yapar.
        System.out.println(stdAges);//{Tom=83, Angelina=58, Ajda=77, Brad=58, Ezel=38}

        stdAges.replace("Ezel",39);//replace() methodu "key" leri kullanarak value lari update icin kullanilir.
        System.out.println(stdAges);//{Tom=83, Angelina=58, Ajda=77, Brad=58, Ezel=39} value lari degistirmek icin
        // put() yerine replace() kullanmak mantiklidir ikisi de ayni isi yapsada methodlari kulanim amacina uygun kullanmaliyiz


        stdAges.replace("Angelina",58,61);//Angeleina 58 ise 61 yap demektir.Map in icinde angelina 58 ikisi birden varsa 61 yapar.
        System.out.println(stdAges);//{Tom=83, Angelina=61, Ajda=77, Brad=58, Ezel=39} mesela angelina 57 61 yap deseydik degismeyecektir.


        stdAges.putIfAbsent("Ali",60);//Ali Map in icinde yoksa Map e ekler ama Map icinde bir key i yazarsak eklemez.
        System.out.println(stdAges);//{Tom=83, Angelina=61, Ajda=77, Brad=58, Ezel=39, Ali=60}

        //getOrDefault() methodu Map de varolan "key" ler icin get() methodu ile ayni ciktigi verir.
        //getOrDefault() methodu Map de olmayan "key" ler icin ikinci parametreye koydugunuz degeri; get() methodu ise null verir.
        System.out.println(stdAges.get("Tom"));//83
        System.out.println(stdAges.getOrDefault("Tom", 0));//83

        System.out.println(stdAges.get("Ayse"));//null
        System.out.println(stdAges.getOrDefault("Ayse", 0));//0

        System.out.println(stdAges.containsValue(77));// Map in icinde value larin arasinda 77 nin olup olmadigini kontrol eder ve bize true döndürür.
        stdAges.containsValue(99);//bize false verecek

        //containsKey() methodu Map in icinde key in olup olmadigini kontrol eder.
        stdAges.containsKey("Ali");//burada bize true vericek cünkü key lerin arasinda "Ali" var


        //remove() methodu key kullanarak entry i silmeye yarar.
        stdAges.remove("Ali");
        System.out.println(stdAges);//{Tom=83, Angelina=61, Ajda=77, Brad=58, Ezel=39}

        //remove("Tom",81); methodu Map de key si "Tom" valeu su 81 olan bir entry varsa onu siler, yoksa silmez.
        stdAges.remove("Tom",81);
        System.out.println(stdAges);//{Tom=83, Angelina=61, Ajda=77, Brad=58, Ezel=39} burada Tom 83 oldugu icin silmez.

        /*stdAges.size();//methodu bize kac tane entry oldugunu bize verir
        stdAges.clear();;//methodu Map i bosaltir
        stdAges.isEmpty();//Map icinde entry var mi yok mu ona bakar.

        */


        // iki Map in bir araya konulabilmesi icin key ler value lar ayni data type ta olmalidir.
        HashMap<String,Integer> kidsAge = new HashMap<>();
        kidsAge.put("John",12);
        kidsAge.put("Jim",22);
        kidsAge.put("Jack",32);

        //stdAges.putAll(kidsAge) methodu stdAges Map ina kidsAge Map ini ekler.Dolayisiyla stdAges Map i degismis olur.
        //Ama kidsAges Map i degismez.
        stdAges.putAll(kidsAge);
        System.out.println(stdAges);//{Tom=83, Angelina=61, John=12, Ajda=77, Brad=58, Jack=32, Ezel=39, Jim=22}
        System.out.println(kidsAge);//{John=12, Jack=32, Jim=22}


    }
}
