package javaders.day35exceptions;

public class E01 {
    public static void main(String[] args) {

        System.out.println(convertStringToInt("123") + 2);//125


        System.out.println(convertStringToInt("12ab")+2);//14
    }
    //Bir String i int a  ceviren method olusturunuz.

    public static int convertStringToInt(String str){

      try{
          return Integer.valueOf(str);

      }catch(NumberFormatException e){// valueOf() method u non-digit character iceren bir String ile kullanildiginda atilir.

          str=str.replaceAll("[^0-9]","");//catch icinde sonuc almak icin mantik kurduk.
          return Integer.valueOf(str);
       }

    }

    //Java bir sayiyi 0 bölersen bu hatadan sonraki kodlarini calistirmam app kitlerim.
    // Exception atar ve mesaj atar hatayi söyler ve biz try catch block lar ile handle edebiliyoruz.


}
