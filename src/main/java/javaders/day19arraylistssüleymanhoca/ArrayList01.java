package javaders.day19arraylistssüleymanhoca;

import java.util.ArrayList;

public class ArrayList01 {
    /*
    1)Ayni data type indeki coklu datalari depolamak icin Array kullaniriz.
    2)Array lerin bir negatif yönü var;icine koyacagimiz eleman sayisini en basta belirlemek zorundayiz.
    3)Array ler eleman sayisinda esnek degildirler bu yüzden java ArrayList adli yeni bir yapi olusturdu.
     bu yapi eleman sayisinda esnektir.Hic eleman koymazsak eleman sayisini 0 olarak ayarlar,
     1000 eleman koyarsak eleman sayisini 1000 olarak ayarlar.
     4)"ArrayList" yerine sadece "List" de diyebiliriz.
     5)Java ArrayList leri olusturduktan sonra array leri iptal etmedi.
     i)Array le süper hizlidir.
     ii)Array ler memory de coook az yer kaplar.
     6)Array le primitive data type lari ve refence lari depolayabiliriz ama ArrayList ler non-primitive data type larini depolar.
     Bu yüzden ArrayList ler array lerden daha cok yer kaplar.
    */
    public static void main(String[] args) {
       //ArrayList nasil olusturulur?
        ArrayList<Integer> ages = new ArrayList<>();
        //ArrayList console a nasil yazdirilir.
        System.out.println(ages);//[]
        //ArrayList e nasil eleman eklenir?

        //1.Way
        ages.add(12);//ad methodu yeni elemani en sona ekler.add methodu elemanalri "giris sirasina(insertion order)" göre list e yerlestirir.
        ages.add(24);
        ages.add(9);
        System.out.println(ages);//[12, 24,9]

        //2.Way
        ages.add(1,99);//yukaridakinin eleman sayisina uygun index yazmaliyiz.
        System.out.println(ages);//[12, 99, 24, 9]

        ArrayList<Integer>price =new ArrayList<>();
        price.add(23);
        price.add(33);

        //3.Way addAll() methodu bir List i deiger List in icine yerlestirir.
        ages.addAll(price);
        System.out.println(ages);//[12, 99, 24, 9, 23, 33] burda en sona yerlestirdi.

        //4.Way
        ages.addAll(3,price);
        System.out.println(ages);//[12, 99, 24, 23, 33, 9, 23, 33]

        //ArraysList eleman sayisi nasil bulunur?
        int numOfElement =ages.size();//size() methodu bir List deki eleman sayisini verir.
        System.out.println(numOfElement);//8

        //ArrayList te specific bir eleman nasil alinir?

        int el1=ages.get(3);//get() methodu index kullanarak istedigini almaya yarar.
        System.out.println(el1);//23

        //ArrayList de specific bir eleman nasil degistirilir?
        ages.set(6,111);//bir elemani index ini yazarak degistirmye yarar.
        System.out.println(ages);//[12, 99, 24, 23, 33, 9, 111, 33]

        //ArrayList te bir elemanin olup olmadigina nasil bakariz?
        boolean r1= ages.contains(99);
        System.out.println(r1);//true

        //ArrayList te bos olup olmadigini nasil kontrol ederiz?
        boolean r2 =ages.isEmpty();
        System.out.println(r2);//false

        // Bir ArrayList teki tüm elemanlari nasil sileriz?
        ages.clear();
        System.out.println(ages);//[]
        boolean r3 =ages.isEmpty();
        System.out.println(r3);//true

        //Example 1: Bir List in bos olup olmadigini kontrol eden kodu yaziniz.
        ArrayList<String> names = new ArrayList<>();
        names.add("Ajda");
        names.add("Cünayt");
        names.add("Angelina");
        names.add("Brad");

        //1.Way
        if(names.size()==0){
            System.out.println("List is empty");
        }else{
            System.out.println("List has at least 1 element");//list te en az bir eleman vardir.
        }

        //2.Way
        if(names.isEmpty()){// bu yol tavsiye edilir. daha az is yapildigi icin.
            System.out.println("List is empty");
        }else{
            System.out.println("List has at least 1 element");//list te en az bir eleman vardir.
        }

















    }//main
}//class
