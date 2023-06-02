package javaders.day16arraysforeachloopsüleymanhoca;

import java.util.Scanner;

public class Arrays02tekrar {
    public static void main(String[] args) {
        //+,-,*,/,% islemlerini yapabilen bir hesap makinesi yapiniz.
        //Kullanici "q" ya basmadigi sürece islem secip yapabilsin.
        /*
        1)Kullanicidan data almak icin Scanner object olusur.
        2)Kullanicidan yapacagi islemi almaliyiz.
        3)Kullanicidan iki sayi almaliyiz.
        4)tekrar tekrar islem yapabilmek icin loop kullanmaliyim.
        */
        Scanner input=new Scanner(System.in);
        System.out.println("cikmak icin 'q' ya basiniz.");
        do{
            System.out.println("Lütfen bir islem giriniz ");
            char ch =input.next().toLowerCase().charAt(0);
            System.out.println("Lütfen birinci sayiyi giriniz");
            int number1 = input.nextInt();
            System.out.println("Lütfen ikinci sayiyi giriniz");
            int number2 = input.nextInt();
            if(ch=='q') {
                System.out.println("see you again");
                break;
            }
                boolean r = ch== '+' ||ch== '-' ||ch== '*' ||ch== '/' || ch == '%';
                if(!r){
                    System.out.println("Undefined operation");
                    break;

            }else{
            switch (ch) {
                case '+':
                    System.out.println(number1 + "+" + number2 + "=" + (number1 + number2));
                    break;
                case '-':
                    System.out.println(number1 + "-" + number2 + "=" + (number1 - number2));
                    break;
                case '*':
                    System.out.println(number1 + "*" + number2 + "=" + (number1 * number2));
                    break;
                case '/':
                    System.out.println(number1 + "/" + number2 + "=" + (number1 / number2));
                    break;
                case '%':
                    System.out.println(number1 + "%" + number2 + "=" + (number1 / number2) * 100);
                    break;

                 }
            }

        }while(true);


    }//main
}//class
