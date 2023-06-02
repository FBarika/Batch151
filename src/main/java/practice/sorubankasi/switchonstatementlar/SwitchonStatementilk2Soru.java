package practice.sorubankasi.switchonstatementlar;

import java.util.Scanner;

public class SwitchonStatementilk2Soru {
    public static void main(String[] args) {
        /*
        1) Yazdırmak için switch ifadesini kullanınız.
a) Aralık, Ocak, Şubat için "Kış"
b) Mart, Nisan, Mayıs için "Bahar"
c) Haziran, Temmuz, Ağustos için "Yaz"
d) Eylül, Ekim, Kasım için "Güz"
e) Diğerleri için "Geçersiz ay adı"
         */


        Scanner input=new Scanner(System.in);
        System.out.println("bir ay adi giriniz.");
        String mevsim=input.next().toLowerCase();
        switch(mevsim){
            case "aralik":
            case "ocak":
            case "subat":
                System.out.println("Kis");
            break;
            case "mart":
            case "nisan":
            case "mayis":
                System.out.println("ilkbahar");
                break;
            case "haziran":
            case "temmuz":
            case "agustos":
                System.out.println("yaz");
                break;
            case "eylul":
            case "ekim":
            case "kasim":
                System.out.println("sonbahar");
                break;
            default:
                System.out.println("gecersiz ay adi");

        }
       /*
        2) Ayın numarasını girdiğinizde ayın adını yazdırmak için bir switch ifadesi kullanınız.
        Örneğin;
        kullanıcı 1 girerse kodunuz "Ocak" yazmalıdır,
                kullanıcı 2 girerse kodunuz "Şubat" yazmalıdır vb.
        Kullanıcı geçersiz ay numarası girerse kodunuz "Geçersiz numara" yazmalıdır.

        */

        System.out.println("bir ay numarasi giriniz. 0<numara<13");
        int ay =input.nextInt();
        switch (ay){
            case 1:
                System.out.println("Ocak");
            break;
            case 2:
                System.out.println("Subat");
                break;
            case 3:
                System.out.println("Mart");
                break;
            case 4:
                System.out.println("Nisan");
                break;
            case 5:
                System.out.println("Mayis");
                break;
            case 6:
                System.out.println("Haziran");
                break;
            case 7:
                System.out.println("Temmuz");
                break;
            case 8:
                System.out.println("Agustos");
                break;
            case 9:
                System.out.println("Eylul");
                break;
            case 10:
                System.out.println("Ekim");
                break;
            case 11:
                System.out.println("Kasim");
                break;
            case 12:
                System.out.println("Aralik");
                break;
            default:
                System.out.println("gecersiz numara");

        }








    }
}
