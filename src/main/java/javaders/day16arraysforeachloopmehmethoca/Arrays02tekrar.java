package javaders.day16arraysforeachloopmehmethoca;

import java.util.Scanner;

public class Arrays02tekrar {
    public static void main(String[] args) {
        //+, -, *, /, % islemlerini yapabilen bir hesap makinasi yapiniz.
        //Kullanici "q" ya basmadigi surece islem secip yapabilsin
        //q ya basmasi durumunda "see you again" mesaji verilerek uygulama dursun
        //kullanici hesaplama operatoru disinda bir sey girmesi durumunda
        // "Undefined operation" mesaji verilerek uygulama dursun

         /*
            1)Kullanicidan data almak icin Scanner object olustur
            2)Kullanicidan yapacagi islemi almaliyiz
            3)Kullanicidan iki tane sayi almaliyiz
            4)Tekrar tekrar islem yapabilmek icin loop kullanmaliyim
         */
        Scanner input=new Scanner(System.in);
        System.out.println("cikmak icin 'q' ya basiniz.");

        do{


            System.out.println("Lütfen yapacaginiz islemi giriniz.");
            char ch =input.next().charAt(0);
            if(ch=='q'){
                System.out.println("see you again");
                break;
            }
            boolean r = ch== '+' ||ch== '-' ||ch== '*' ||ch== '/' ||ch== '%';
            if(!r){
                System.out.println("Undefined operation");
                break;// bunu yazdigimiz icin default kullanmadik asagida
            }
            System.out.println("Lütfen birinci sayiyi giriniz");
            int sayi1=input.nextInt();
            System.out.println("Lütfen ikinci sayiyi giriniz");
            int sayi2=input.nextInt();

                switch (ch){
                    case '+':
                    System.out.println(sayi1+ ch + sayi2 +"=" +(sayi1+sayi2));
                    break;
                    case '-':
                        System.out.println(sayi1+ ch + sayi2 +"=" +(sayi1-sayi2));
                        break;
                    case '*':
                        System.out.println(sayi1+ " * " + sayi2 +" = " +(sayi1*sayi2));
                        break;
                    case '/':
                        System.out.println(sayi1+ ch + sayi2 +"=" +(sayi1/sayi2));
                        break;
                    case '%':
                        System.out.println(sayi1+ ch + sayi2 +"=" +((sayi1/sayi2)*100));
                        break;
                    //buraya default la undefined operation yazarsak sistemden cikmiyor ve tekrar sayilari soruyor
                    // yukari ayri if icinde yapinca sayilari sormadan sistemden cikiyor.
                }



        }while(true);

    }//main
}//class
