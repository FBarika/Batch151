package practice.sorubankasi.ifstatementlar;

public class Soru7 {
    public static void main(String[] args) {
        /*
        7) Tam isim için dilbilgisi kurallarını kontrol etmek için kodu yazınız.
a) Kodunuz "ali Can", "Ali can", "ali can" için "Baş harflerinde hata" yazmalıdır.
b) Kodunuz, aşağıdaki gibi tek kelimeler için "Ad veya soyadı eksik" yazmalıdır.
c) "Ali" veya "Can" veya "ali"Kodunuz "ALI CAN" gibi tüm formatlar için "Format hatası" yazmalıdır.
d) Kodunuz bir veya daha fazla boşluk (" " veya " " gibi karakterler) için " Isim girilmedi"
yazmalıdır.
e) Ad, harfler ve boşluktan başka herhangi bir karakteri içeriyorsa, kodunuz "Geçersiz Ad"
yazmalıdır.
Not : Kısaltmada 1'den fazla hata varsa, ilgili tüm hata mesajları çıktı olarak konsolda
görünmelidir. Örneğin; "ali3" için kodunuz "Baş harflerinde hata", "Ad veya soyadı eksik" ve
"Geçersiz Ad"

         */
        String s = "ali3";
        String str=s.trim();

        if(!((str.charAt(0)>='A' && str.charAt(0)<='Z')&&(str.split(" ")[1].charAt(0)>='A'&&str.split(" ")[1].charAt(0)>='A'))){
            System.out.println("Bas harflerinde hata");
        }
        if(str.split(" ").length<2){
            System.out.println("Ad veya soyadı eksik");
        }
        if(str.equals(str.toUpperCase())){
            System.out.println("Format hatasi");
        }
        if(s.substring(0,1).contains(" ") || s.substring(s.length()-1).contains(" ")){
            System.out.println("Isim girilmedi");
        }
        if(str.replaceAll(" ","").replaceAll("[a-zA-Z]","").length()>0){
            System.out.println("Gecersiz ad");
        }









    }//main
}
