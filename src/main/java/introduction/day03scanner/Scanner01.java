package introduction.day03scanner;

//java nin util kutuphanesinden scanner class import edildi demektir.alt+enter kisayolu
import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        //1. adim:Scanner Class tan bir obje olustur.
        Scanner input = new Scanner(System.in);
        // obje ismini input yaptik.Cünkü bu obje kullanicidan alinan datayi benim kodlarimin icine koyacak.

        //2.adim: Kullaniciya ne istediginize dair mesaj veriniz.
        System.out.println("Lütfen yasinizi giriniz...");

        //3.adim:Uygun methodu kullanarak kullanicinin verdigi datayi memory e yerlestiriniz.
        byte age = input.nextByte();
        System.out.println(age);


    }

}
