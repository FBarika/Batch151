package practice.sorubankasi.stringmanipulationslar;

import java.util.Scanner;

public class Soru13 {
    /*
    13) Aşağıdaki koşullar için bir parolanın geçerli olup olmadığını kontrol etmek için kod yazınız;
Şifre boşluk karakterinden farklı olacak şekilde en az 8 karakter içermelidir. Şifrede en az 1
sembol olmalıdır.
Örnek:'A2b!' için kodunuz konsolda false yazdırmalıdır.
 'A2b3cdef' için kodunuz konsolda false yazdırmalıdır
 '!1a23b4' için kodunuz konsolda false yazdırmalıdır.
 '!1a23b4?es' için kodunuz konsolda true yazdırılmalıdır.
 '! a b 3 k' kodunuz konsolda false yazdırmalıdır.

    */
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
        System.out.println("Lütfen email adresinizi bosluk olmayacak sekilde en az 8 karakterli giriniz");
        String email=input.next();
        boolean r1= !email.contains(" ");
        boolean r2=email.replace(" ","").length()>7;
        boolean r3=email.replaceAll("[\\P{P}]","").length()>0;
        System.out.println(r1&&r2&&r3);
    }
}
