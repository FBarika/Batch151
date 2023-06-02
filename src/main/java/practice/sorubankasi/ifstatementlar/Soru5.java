package practice.sorubankasi.ifstatementlar;

public class Soru5 {
    public static void main(String[] args) {
        /*
        5) Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
a) Bir üçgenin iki kenarının uzunluğu eşitse "İkizkenar Üçgen".
b) Bir üçgenin tüm kenarlarının uzunluğu eşitse "Eşkenar Üçgen".
c) a ve b koşulları sağlanmıyorsa "Çeşit Kenar Üçgen"

         */
        int a = 5;
        int b = 3;
        int c = 4;

        if(a==b && a==c && b==c){
            System.out.println("Eskenar ücgen");
        }else if(a==b || a==c || b==c){
            System.out.println("Ikizkenar ücgen");
        }else{
            System.out.println("cesit kenar ücgen");
        }



    }
}
