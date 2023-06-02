package javaders.day12switchincrementdecrementloopssüleymanhoca;

public class Loops01 {
    /*
    Code yazarken i)tekrarli kod yazmamaya dikkat ederiz
                  ii) Yazdigimiz kodun gerektiginde tamir edilebilmesi kolay olmasina
                  iii)yazdigimiz kodun gerektiginde gelistirilebilmesinin kolay olmasina dikkat ediniz
                  iv)yazdiginiz kodun farkli senaryolar icin de calistirilabilmesine dikkat ediniz.
     */
    public static void main(String[] args) {
     //Ekrana 5 kere "Hi" yazdiriniz
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println();
     //Yukaridaki gibi tekrar grektiren isleri yapmak icin "Loop" yapilarini kullaniriz.
     //4 tane Loop yapisi vardir.i)for-loop ii)while-loop iii)do-while-loopiv)for-each-loop

     //for-loop
     //  starting value    loop condition   increment/decrement
     for( int i=1       ;  i<6           ;    i++              ){
         System.out.println("Hi");

     }
     // 4 den 24 e kadar tüm tam sayilari ayni satirda aralarinda bosluk birakarak console a yazdiriniz.
        for(int i = 4; i<25 ;i++){
            System.out.print(i + " ");

        }
        System.out.println();
     //33 den 11 e kadar tüm cift tam sayilari ayni satirda aralarinda bosluk birakarak console a yazdiriniz.
        for(int i=33; i>10 ; i--){
            if(i%2==0){
                System.out.print(i+ " ");
            }
        }
        System.out.println();
     //20'den 74'e kadar tum tek tamsayilari ayni satirda, aralarina bosluk birakarak console'a yazdiriniz
        for(int i =20;i<75;i++){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        //"Massachusetts" kelimesindeki tum sesli harfleri console'a yazdiriniz
        String s ="Massachusetts";

        for(int i=0;i<s.length();i++){
          char c=  s.charAt(i);
          if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
              System.out.print(c+" ");

          }


        }






    }//main
}//class
