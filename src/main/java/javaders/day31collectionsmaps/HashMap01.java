package javaders.day31collectionsmaps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap01 {
    /*
    Map deyince akliniza sozluk gelsin. Sozluklerde sol tarafta kelime, sag tarafta kelimenin anlami olur.
Ornek:
Cat=Evcil hayvan
Dog=Evcil hayvan
Su sozluk yapisi Java'daki map yapisina benzer. Kelimenin oldugu sirada ayni kelimeden birden fazla bulunmaz
bu kelimeler tekrarsizdir. Sol tarafta tekrarli kelimeler yani esanlamli kelimeler olabilir. Maplerde de boyle
iki bolum olur. Ilk bolum tekrarsiz, ikinci bolumde tekrarli bolum olabilir. Tekrarsiz kisim key, tekrarli kisim
value olarak tanimlanir. Key=Value
Maplar key=value yapisini kullanir. Maplerde birinci ve ikinci deger var. Maplerdeki elemanlara "Entry" denilir.
Elemanlari iceren yapinin tamamina "EntrySet" denir.
Java tekrarsizlara Set diyor.
     */
    /*
    MY NOTES:
Map'lerde sozluklerdeki gibi kelime ve manasi seklinde bir kullanim vardir.
"key" kismi tekrarsiz, "value tekrarli olabilir.
Mapler "key" ve "value" structure'ini kullanir.
Map'lerdeki elemanlara "Entry" denir.
Elemanlarin tamamina ise "EntrySet" denilir.
"Entry" ler tekrarsiz oldugu icin "EntrySet" denilir.
"Key"Key" ve "Value" lar ayri ayri data type larinda olabilirler.
Map ler collection degildir, farkli bir yapidir.Süslü parantezle siraliyor entry leri collectionlar köseli parantezle siraliyor.

HashMap ler entry leri rastgele siralar, bu yüzden en hizli map dir.



     */
    public static void main(String[] args) {

        HashMap<String,Integer> countryPopulation = new HashMap<>();
        countryPopulation.put("Germany",83000000);//Java burada add methodu kullanmamis cünkü add tekli data koyar put ta key ve value koyacagimiz icin farkli method olusturmus.
        countryPopulation.put("Albania",3000000);
        countryPopulation.put("USA",400000000);
        countryPopulation.put("Turkey",83000000);
        countryPopulation.put("Netherlad",3000000);//HashMap ler,HashSet lerde oldugu gibi girilen entry leri rastgele siralar hizli olmak icin.

        System.out.println(countryPopulation);//{USA=400000000, Turkey=83000000, Netherlad=18000000, Germany=83000000, Albania=30000000}

        //get() methodu "key" ile calisir ve "value" kismini verir.
        int usaPopulation =countryPopulation.get("USA");
        System.out.println(usaPopulation);

        //key ler tekrarsizdir Java da tekrarsiz seyler Set icine konulur.
        //Bütün "key" leri nasil alabiliriz?
        Set<String> keys = countryPopulation.keySet();
        System.out.println(keys);//[USA, Turkey, Netherlad, Germany, Albania]

        //Bütün value lari nasil alabilirim?Java bunu Set in icine koymaz cünkü value lar tekrarli olabilir.
        Collection<Integer> values = countryPopulation.values();
        System.out.println(values);//[400000000, 83000000, 18000000, 83000000, 30000000]

        //Ex 1: countryPopulation map indeki ülkelerin nüfuslarin ortalamasi nedir?
        Collection<Integer> value = countryPopulation.values();//Map ler Loop larda kullanilmaz. Bu yüzden burda Collection in icine koyduk.
        int sum=0;
        for (Integer w:value) {
            sum=sum+w;
        }
        System.out.println(sum/value.size());

        countryPopulation.size();//eleman sayisini veriyor.


        //entrySet(); entry leri kalip halinde Set in icine koyup verir bu method.Entry de tekrarsiz oldugu icin Set icine koyabiliyoruz.
        //Loop lar map ler ile kullanilmaz. Sadece entry ler arasinda gezmek istedigimizde loop kullaniriz.
        Set<Map.Entry<String,Integer>> entries =countryPopulation.entrySet();//Loop larda kullanmak icin Set icine koyduk.
        System.out.println(entries);//[USA=400000000, Turkey=83000000, Netherlad=3000000, Germany=83000000, Albania=3000000]

        //Example 2:countryPopulation Map indeki ülkelerin isimlerinin character sayisi ile nufuslarinin toplamini bulunuz.

        int toplam=0;
        for (Map.Entry<String,Integer> w:entries) {
           toplam= toplam+w.getKey().length() + w.getValue();
        }
        System.out.println(toplam);


























































    }//main
}//class
