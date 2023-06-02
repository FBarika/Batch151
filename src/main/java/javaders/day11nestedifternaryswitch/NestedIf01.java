package javaders.day11nestedifternaryswitch;

import java.util.Scanner;

public class NestedIf01 {
    /*
    Kullanicidan 0'dan kucuk 120'den buyuk deger giremiyecek sekilde datalari aldiktan sonra
    Eger calisan kadinsa 60 yasindan buyukse "Emekli Olabilir "yazdirin
    Eger calisan erkek ise 65 yasindan buyukse "Emekli Olabilir" yazdirin.
     */

    /*
    1)If icinde if kullanilirsa Nested If olusturmusuz demektir.
    2)Nested If Java yi yavaslatir bu yüzden mecbur kalmadikca kullanmayiz.
    3)Nested if gibi javayi yavaslatan kodlar "Time Consuming" olarak adlandirilir.
    */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age...");
        int age = input.nextInt();
        System.out.println("Please enter your gender");//male,female
        String gender =input.next();

        if (age < 0 || age>120 ) {
            System.out.println("Negative ages or ages greater than 120 are invalid...");

        }else if(gender.equalsIgnoreCase("male")){//equalsIgnoreCase() icin male=MALE=Male büyük kücük harf fark etmez
            if (age > 65) {
                System.out.println("Can be retired");
            }else{
                System.out.println("Should work");
            } // Kod yazarken if icine bir tane daha if koyulmasina Nested If denir.Ama tavsiye edilmez.Nested yapilar cok zaman harcarlar app yavaslar.

        }else if(gender.equals("female")){
            if(age>60){
                System.out.println("Can be retired");
            }else {
                System.out.println("Should work");
            }

        }else {
            System.out.println("Undefined gender");
        }



    }//main
}//class
