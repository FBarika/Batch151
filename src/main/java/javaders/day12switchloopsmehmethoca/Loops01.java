package javaders.day12switchloopsmehmethoca;

public class Loops01 {
    public static void main(String[] args) {

        //Ex 1: Ekrana 5 kere "Hi" yazdiriniz.
        //1.Yol tavsiye edilmez
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");

        /*
        Clean Code Standarts
        1) Tekrar(Repetition) olmamalidir
        2) Dynamic olmali
        3) Tamir (Fix) ve update kolay yapilabilmelidir.
        */

        //2.yol
        /* Ayni adimlar tekrar tekar yapilmasi gerektiginde looplar kullanir.
        4 tane loop cesidi vardir
        1)for-loop
        2)while-loop
        3)do-while loop
        4)for-each loop
        */

        //1)for loop
        /*
        for (Baslangic Degeri ;Loop calisma sarti ; Artirma/Eksiltme ){

        }
         */
        //Baslangic Degeri  ;   Loop calisma sarti   ;   Artirma/Eksiltme
        for(    int i =1    ;   i<61                 ;      i++              ){
            System.out.println("Hi");
        }
        //i++ i nin degerini 1 tane artir demek
        // 60 tane yazdirmak icin 61 yaziyoruz
        //Ex 2 : 11 den 14 e kadar tüm sayilari ekrana yazdiriniz.
         for(int i =11  ; i<15 ; i++ ){
             System.out.println(i);

         }
         //Ex 3: 40 dan 23 e kadar tüm cift sayilari ekrana yazdiriniz.
        for(int i =40; i>22 ; i-- ){
            if(i%2==0){
                System.out.println(i);
            }
            // azaltarak gitmek icin i-- diyoruz.

        }

        //Ex 4: 18 den 56 ya kadar tüm tek sayilari ekrana yazdiriniz.
        for(int i =18; i<57; i++){
            if(i%2==1){
                System.out.print(i+" ");// yan yana ve arada bosluk var
                System.out.println(i); // alt alta yazdiriyoruz.
            }
        }

        //Massachusetts kelimesindeki tüm sesli harfleri console a yazdiriniz.

        String s = "Massachusetts";
        for(int i=0;i<s.length();i++){
            char c =s.charAt(i);

            if(c=='a' || c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='0'||c=='U'){
                System.out.print(c +" ");

            }

        }


    }//main
}//class
