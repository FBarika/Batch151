package javaders.day08stringmanipulations;

import java.util.Scanner;

public class C02_StringManipulations {
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
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen mail adresinizi asagidaki kurallara uygun bir sekilde giriniz\n" +
                "       i)mail adresi \"gmail\" icermeli\n" +
                "       ii)Space characteri mail'de olmamali\n" +
                "       iii)mail adresinde buyuk harf olmamali\n" +
                "       iv)En az bir tane noktalama isareti bulunmali");// \\p{Punct} bu sembol ve noktalama isaretlerini kapsiyor.
        String s = input.nextLine();
        boolean a = s.contains("gmail");
        boolean b = !s.contains(" ");
        boolean c = s.replaceAll("[^A-Z]","").length()==0;
        boolean d = s.replaceAll("[^\\p{Punct}]","").length()>0;
        System.out.println(a && b && c && d);// benim cozumum







        System.out.println("Lütfen mail adresinizi asagidaki kurallara göre giriniz" +
                "Kullanicidan email adresini girmesini isteyin,\n" +
                "       Asagidaki kurallara gore kullanicinin\n" +
                "       girdigi email adresini kontrol ediniz.\n" +
                "       i)mail adresi \"gmail\" icermeli\n" +
                "       ii)Space characteri mail'de olmamali\n" +
                "       iii)mail adresinde buyuk harf olmamali\n" +
                "       iv)En az bir tane noktalama isareti bulunmali\n");
        String mail = input.nextLine();
        //i)mail adresi "gmail" icermeli
        boolean first = mail.contains("gmail");
        System.out.println("gmail icermeli = " + first);
        //ii)Space characteri mail'de olmamali
        boolean second = !mail.contains(" ");
        System.out.println("space olmamali = " + second);

        // iii)mail adresinde buyuk harf olmamali
        boolean third = mail.replaceAll("[a-z0-9]","")
                .replaceAll("[\\p{Punct}]","").replace(" ","").length()==0;
        System.out.println("büyük harf olmamali=" + third);
        //iv)En az bir tane noktalama isareti bulunmali
        boolean fourth = mail.replaceAll("[a-zA-Z0-9]","").replace(" ","").length()>0;
        System.out.println("noktalama isareti olmali = " + fourth);
        // baska yöntemler de var
        //1)
        boolean fourth1= mail.replaceAll("[^\\p{Punct}]","").length()>0;
        System.out.println("noktalama isareti olmali 2 = " + fourth1);
        //2)
        boolean fourth2= mail.replaceAll("[\\P{P}]","").length()>0; // [\\P{P}] semboller haric herseyi sil anlamina geliyor.
        System.out.println("noktalama isareti olmali 2 = " + fourth2);

        System.out.println(first && second && third && fourth);




    }//main
}//class
