package javaders.day15loopsarrayssüleymanhoca;

import java.util.Arrays;

public class Arrays02 {

    /*
     1)Application larda "data" ile bu datalari isleyen kodlar(logic) birbirinden ayrilir.
     Yani; logic data ya bagimli olmamalidir.
     Dataya bagimli olarak yazilan kodlara "hard code" denir.
     "hard code" hatali kod demektir.

     Asagidaki grades array inde son elemani almak icin "4" veya "grades.lenght-1" kullanilabilir.
     "4" kullanirsaniz array'e bir eleman eklendiginde kodunuz yanlis cikti verir ama "grades.length-1"
     kullanirsaniz hep dogru sonucu alirsiniz.
     */
    public static void main(String[] args) {
        // Array leri kisa yoldan nasil olusturabiliriz?
        int grades[] = {67, 98, 100, 34, 76};
        System.out.println(Arrays.toString(grades));//[67, 98, 100, 34, 76]

        //Example 1 : grades array indeki en kucuk ve en büyük grade in toplamini ekrana yazdiran kodu yaziniz.
        Arrays.sort(grades);// sort methodu en kücükten en büyüge siralar.
        System.out.println(Arrays.toString(grades));//[34, 67, 76, 98, 100]
        System.out.println(grades[0] + grades[grades.length - 1]);//134

        //Example 2: Kullanicidan size verilen bir String Array deki isimlerden 5 character den az character icerenleri console a yazdiriniz

        String stdNames[] = new String[5];

        stdNames[0] = "Ajda";
        stdNames[3] = "Cuneyt";
        stdNames[2] = "Tom";
        stdNames[1] = "Ayhan";
        stdNames[4] = "Filiz";

        for (String w : stdNames) {
            if (w.length() < 5) {
                System.out.println(w);
            }
        }
        System.out.println();
        //Example 3: Kullanicidan size verilen bir String Array deki isimleri alfabetik siraya koyduktan sonra F ile baslayan ismlerden onceki isimleri console a yazdiriniz
        Arrays.sort(stdNames); //Arrays.sort(aileUyeleri); //sayilari kucukten buyuge, stringleri alfabetik siralar.
        for (String w : stdNames) {
            if (w.charAt(0) < 'F') {
                System.out.println(w);
            }
        }// 1.yol

        System.out.println();

        for (String w : stdNames) {
            if (w.startsWith("F")) {
                break;
            }
            System.out.println(w);
        }// 2.yol
        System.out.println();

        //Example 4: Kullanicidan size verilen bir String Array deki isimleri alfabetik siraya koyduktan sonra F ile baslayan ismlerden onceki isimleri ve "F" ile baslayanlari
        // console a yazdiriniz
        Arrays.sort(stdNames);
        for (String w : stdNames) {
            System.out.println(w);

            if (w.startsWith("F")) {
                break;
            }

        }
        System.out.println();
        //Example 5: Size verilen bir String array'deki isimleri alfabetik siraya koyduktan sonra "F" ile baslayan
        // isimler haric diger isimleri console'a yazdiriniz
        Arrays.sort(stdNames);//sort() method'u numeric data'lari kucukten buyuge(ascending) dizer,
                              // String'leri ise alfabetik sirada(alphabetically) dizer.
                              // ascending + alphabetically ==> Natural Order

        for(String w : stdNames){

            if(w.startsWith("F")){
                continue;
            }else{
                System.out.println(w);
            }

        }










    }
}







