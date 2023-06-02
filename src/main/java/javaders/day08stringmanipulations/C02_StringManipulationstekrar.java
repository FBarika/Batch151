package javaders.day08stringmanipulations;

import java.util.Scanner;

public class C02_StringManipulationstekrar {
    public static void main(String[] args) {
     /*
       Kullanicidan email adresini girmesini isteyin,
       Asagidaki kurallara gore kullanicinin
       girdigi email adresini kontrol ediniz.
       i)mail adresi "gmail" icermeli
       ii)Space characteri mail'de olmamali
       iii)mail adresinde buyuk harf olmamali
       iv)En az bir tane noktalama isareti bulunmali
 */

        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen mail adresinizi giriniz.");
        String mail = input.next();

        boolean a =mail.contains("gmail");
        boolean b =!mail.contains(" ");
        boolean c=mail.replaceAll("[^A-Z]","").length()==0;
        boolean d =mail.replaceAll("[\\P{P}]","").length()>0;

        System.out.println(a && b && c && d);


    }//main
}//class
