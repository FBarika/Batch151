package practice.b151practices.day06practice;

import java.util.Scanner;

public class C01_Switch {
    public static void main(String[] args) {
        /*
       Kullanıcıdan yıl ve ay numarasını ayrı ayrı sisteme girmesini isteyiniz.
       Girilen ay numarasına göre ayin kaç gün çektigini yazdırınız.


       NOT: 1, 3, 5, 7, 8, 10, 12. aylar 31 gun çeker
            4, 6, 9, 11. aylar 30 gun çeker
            2. ay 4 yılda bir 29 gun ceker, diger yıllarda 28 gun ceker
        */
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen yil numarasi giriniz.");
        int yil =input.nextInt();
        System.out.println("Lütfen ay numarasi giriniz.");
        int ayNo =input.nextInt();

        switch(ayNo){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                int gün=31;
                System.out.println("Grdiginiz Ay "+ gün + " Gun Ceker");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                gün=30;
                System.out.println("Grdiginiz Ay "+ gün + " Gun Ceker");
                break;
            case 2:
                if(yil%4==0){
                    gün=29;
                    System.out.println("Grdiginiz Ay "+ gün + " Gun Ceker");
                }else{
                    gün=28;
                    System.out.println("Grdiginiz Ay "+ gün + " Gun Ceker");
                }
                break;
            default:
                System.out.println("Gecerli bir ay numarasi giriniz.");

        }

















    }//main
}//class
