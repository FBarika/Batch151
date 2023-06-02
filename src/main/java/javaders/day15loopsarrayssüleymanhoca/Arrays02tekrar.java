package javaders.day15loopsarrayssüleymanhoca;

import java.util.Arrays;

public class Arrays02tekrar {
    public static void main(String[] args) {
        //Example 1 : grades array indeki en kucuk ve en büyük grade in toplamini ekrana yazdiran kodu yaziniz.
        int grades[] = {67, 98, 100, 34, 76};//[67, 98, 100, 34, 76]
        Arrays.sort(grades);
        System.out.println(Arrays.toString(grades));//[34, 67, 76, 98, 100]
        System.out.println(grades[0]+grades[grades.length-1]);//

        System.out.println(Math.min(grades[0], grades[grades.length - 1]));// min bulma methodu.


        //Example 2: Kullanicidan size verilen bir String Array deki isimlerden 5 character den az character icerenleri console a yazdiriniz
        String stdNames []=new String [5];
        stdNames[0]="Ajda";
        stdNames[3]="Cuneyt";
        stdNames[2]="Kemal";
        stdNames[1]="Ayhan";
        stdNames[4]="Filiz";

        for (String w:stdNames) {
            if(w.length()<5){
                System.out.println(w);
            }
        }


        //Example 3: Kullanicidan size verilen bir String Array deki isimleri alfabetik siraya koyduktan sonra "f" ile baslayan
        // isimlerden önceki isimleri yazdiriniz.
        Arrays.sort(stdNames);
        System.out.println(Arrays.toString(stdNames));//[Ajda, Ayhan, Cuneyt, Filiz, Kemal]

        for (String w:stdNames) {
            if(w.toLowerCase().charAt(0)<'f'){
                System.out.print(w+" ");//Ajda Ayhan Cuneyt
            }
        }
        System.out.println();
        for (String w:stdNames) {
            if(w.toLowerCase().charAt(0)=='f'){
                break;
            }
            System.out.print(w+" ");
        }
        System.out.println();
        //Example 4: Kullanicidan size verilen bir String Array deki isimleri alfabetik siraya koyduktan sonra "f" ile baslayan ve
        //"f" ile baslayan isimlerden önceki isimleri yazdiriniz.
        //1.yol
        for (String w:stdNames) {
          if(w.toLowerCase().charAt(0)<='f'){
              System.out.print(w+" ");//Ajda Ayhan Cuneyt Filiz
          }
        }
        //2.yol
        System.out.println();
        for (String w : stdNames) {
            System.out.print(w+" ");

            if (w.startsWith("F")) {// burda önce yazdirip sonra break yaptigimizda f yi yazdirir
                // digerlerine gecemeden break yaptigimiz icin loop kirilir
                break;
            }

        }
        System.out.println();

        //Example 5: Size verilen bir String array'deki isimleri alfabetik siraya koyduktan sonra "F" ile baslayan
        // isimler haric diger isimleri console'a yazdiriniz
        for (String w:stdNames) {
            if(w.startsWith("F")){
                continue;
            }
            System.out.print(w+" ");//Ajda Ayhan Cuneyt Kemal  continue oldugu zaman yazdirmak istemedigimiz eleman icin
            // kullanip digerlerini yazdirabiliyoruz.
        }




















    }//main
}//class
