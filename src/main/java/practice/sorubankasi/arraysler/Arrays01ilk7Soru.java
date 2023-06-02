package practice.sorubankasi.arraysler;


import java.util.Arrays;

public class Arrays01ilk7Soru {


    public static void main(String[] args) {
       /* 1) Tamsayılardan oluşan bir arrayde ortadaki elemanı bulunuz.
         Örnek: (12, 5, 8) ==> (5, 8, 12) ==> Çıktı =8
        (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Çıktı =(8+12)/2 = 10
        */
        int num []={5, 8, 12, 13};

        Arrays.sort(num);
        if(num.length%2==1){
            System.out.println(num[num.length/2]);

        }else{
            System.out.println((num[num.length/2]+num[num.length/2-1])/2);
        }


        /*
        2) String’ lerden oluşan bir arrayde uzunluğu en küçük olan elemanları bulunuz.
Örnek: ( Kemal, Jonathan, Mark, Angie, Veli ) ==> Output is Mark, Veli
        */

        String isimler []= {"Kemal","Jonathan","Mark","Angie","Veli"};
        int small= isimler [0].length();
        for (String w:isimler) {
            small=Math.min(w.length(),small);
            if(w.length()==4){
                System.out.println(w);
            }
        }
        System.out.println(small);

        /*
        3) Tamsayılardan oluşan bir arrayde en küçük pozitif elemanı ve en büyük negatif elemanı
         bulunuz.
         Örnek:(-12, 18, -5, 23, -2) ==> En küçük pozitif 18, en büyük negatif -2
         */

        int sayilar []={-12, 18, -5, 23, -2};
        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));//[-12, -5, -2, 18, 23]
        int minPositive=sayilar[sayilar.length-1];
        int maxNegatif=sayilar[0];
        for (int w:sayilar) {
            if(w<0){
                maxNegatif= Math.max(maxNegatif,w);


            }else if(w>=0){
             minPositive=Math.min(minPositive,w);

            }
        }
        System.out.println(minPositive);//18
        System.out.println(maxNegatif);//-2

        /*
        4) String’ lerden oluşan bir arrayde öğeler 'n' veya 'k' ile bitiyorsa, o öğelerin baş harflerini
        alınız.
        Örnek: { “Kemal”, “Jonathan”, “Mark”, “Jackson”, “Ali” } ==> Çıktı JJM

         */

        String s []={"Kemal", "Jonathan", "Mark", "Jackson", "Ali" };
        for (String w:s) {
            if(w.charAt(w.length()-1)=='n' || w.charAt(w.length()-1)=='k'){
                System.out.println(w.charAt(0));
            }
        }

        /*
        5) String’ lerden oluşan bir arrayde kullanılan öğelerin toplam karakter sayısını bulunuz.
        Örnek: { "Kemal", "Jonathan", "Mark", "Angie", "Veli" } ==> Çıktı 26

         */
        String j []={"Kemal", "Jonathan", "Mark", "Angie", "Veli"};
        int sum=0;
        for (String w:j) {
            sum=sum+w.length();
        }
        System.out.println(sum);//26

        /*
        6) Verilen bir String'de 'a' veya 'A' ile başlayan kelimeyi sayısını bulunuz.
String s = "Apex is an object oriented programming language";

         */
        String s1 = "Apex is an object oriented programming language";
        String s1Array []=s1.split(" ");
        int counter=0;
        for (String w:s1Array) {
            if(w.charAt(0)=='a' || w.charAt(0)=='A'){
                System.out.println(w);
                counter++;
            }
        }
        System.out.println(counter);

        /*
        7) Verilen bir String'deki sesli harf sayısını bulunuz.

         */
        String s2 = "Apex is an object oriented programming language";
        String newArr [] = s2.trim().toLowerCase().replaceAll("[^a-zA-Z]","").split("");

        int sayac=0;
        for (String w:newArr) {
           char ch=w.charAt(0);

           if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u'){
              sayac++;
           }
        }
        System.out.println();
        System.out.println(sayac);//17











    }
}
