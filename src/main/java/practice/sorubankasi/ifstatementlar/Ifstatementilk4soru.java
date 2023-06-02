package practice.sorubankasi.ifstatementlar;

import java.util.Scanner;

public class Ifstatementilk4soru {
    public static void main(String[] args) {
        /*
        1) Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
a) Aralık, Ocak, Şubat için "Kış"
b) Mart, Nisan, Mayıs için "İlkbahar"
c) Haziran, Temmuz, Ağustos için "Yaz"
d) Eylül, Ekim, Kasım için "Sonbahar"
e) Diğerleri için "Geçersiz ay adı"


         */
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir ay adi giriniz.");
        String s=input.next().toLowerCase();
        if(s.equals("aralik")||s.equals("ocak")||s.equals("subat")){
            System.out.println("Kis");

        } else if (s.equals("mart")||s.equals("nisan")||s.equals("mayis")) {
            System.out.println("Ilkbahar");
        } else if (s.equals("haziran")||s.equals("temmuz")||s.equals("agustos")) {
            System.out.println("Yaz");
        }else if (s.equals("eylül")||s.equals("ekim")||s.equals("kasim")) {
            System.out.println("Sonbahar");
        }else{
            System.out.println("Gecersiz Ay");
        }

/*
2) Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
a) Şifre boşluk karakterinden farklı en az 8 karakter içeriyorsa "Geçerli Şifre"
b) Herhangi bir pozisyonda şifrede boşluk karakteri varsa "Şifrede boşluk karakteri kullanmayınız"
c) a ve b koşullarının sağlanmaması durumunda "Geçersiz Şifre"
 */
        System.out.println("Lütfen sifrenizi giriniz.");
        input.nextLine();
        String sifre= input.nextLine();
        if(sifre.contains(" ")) {
            System.out.println("Sifrede bosluk karakteri kullanmayiniz.");
        }else if(sifre.replaceAll(" ","").length()>7){
           System.out.println("Gecerli sifre");
       }else{
           System.out.println("Gecersiz sifre");
       }

/*
3) Ayın numarasını girdiğinizde ayın adını yazdırmak için gereken kodu yazınız.
Örnek; 1 için çıktı: "Ocak", 2 için çıktı: "Şubat" vb.
 */
        System.out.println("lütfen bir ay numarasi giriniz 0<numara<13");
        int day =input.nextInt();
        if(day==1){
            System.out.println("Ocak");
        } else if (day==2) {
            System.out.println("Subat");
        }else if (day==3) {
            System.out.println("Mart");
        }else if (day==4) {
            System.out.println("Nisan");
        }else if (day==5) {
            System.out.println("Mayis");
        }else if (day==6) {
            System.out.println("Haziran");
        }else if (day==7) {
            System.out.println("Temmuz");
        }else if (day==8) {
            System.out.println("Agustos");
        }else if (day==9) {
            System.out.println("Eylul");
        }else if (day==10) {
            System.out.println("Ekim");
        }else if (day==11) {
            System.out.println("Kasim");
        }else if (day==12) {
            System.out.println("Aralik");
        }else{
            System.out.println("gecersiz numara");
        }

        /*
        4) Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
a) Son basamak 5 ‘e eşit ve 5 den büyükse, yuvarlama işlemi: “Son basamağı bir üst ondalığa yuvarla”
b) Son basamak 5 den küçükse, yuvarlama işlemi: “Son basamağı bir alt ondalığa yuvarla”

         */

        System.out.println("Lütfen bir sayi giriniz");
        int b=input.nextInt();
        if(b%10>=5){
            System.out.println("Son basamağı bir üst ondalığa yuvarla: "+((b/10)+1)*10);
        }else{
            System.out.println("Son basamağı bir alt ondalığa yuvarla: "+ (b/10)*10);
        }


    }
}

