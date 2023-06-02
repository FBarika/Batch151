package introduction.day03scanner;

import java.util.Scanner;

public class Scanner02 {
    //Kullanicidan ilk ismini ve soyismini alip ikisini ayni satirda ekrana yazdiriniz.
    public static void main(String[] args) {

        //1.Adim: Scanner Class dan object olustur.
        Scanner input = new Scanner(System.in);
        System.out.println("ilk isminizi giriniz");
        String firstName = input.next();
        System.out.println("son isminizi giriniz");
        String lastName = input.next();

        System.out.println(firstName+"\n"+lastName);
        // isim arasinda bosluk icin +" "+ yapmamaiz lazim, alt alta icin \n yapiyoruz tirnak icine


    }
}
