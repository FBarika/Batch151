package javaders.day11nestedifternaryswitch;

import java.util.Scanner;

public class Switch01tekrar {
    public static void main(String[] args) {
        /*
        Gün isimlerini kullanicidan aliniz, o gunun kacinci gun oldugunu ekrana yazdiriniz.
        Sunday==>1  Monday==>2 ...
        */
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen gün ismi giriniz");
        String day = input.next();
        //1) Yol
        if(day.equalsIgnoreCase("Sunday")){
            System.out.println("Sunday haftanin birinci günüdür.");
        } else if (day.equalsIgnoreCase("Monday")) {
            System.out.println("Monday haftanin ikinci günüdür.");
        }else if (day.equalsIgnoreCase("Tuesday")) {
            System.out.println("Tuesday haftanin ücüncü günüdür.");
        }else if (day.equalsIgnoreCase("Wednesday")) {
            System.out.println("Wednesday haftanin dördüncü günüdür.");
        }else if (day.equalsIgnoreCase("Thursday")) {
            System.out.println("Thursday haftanin besinci günüdür.");
        }else if (day.equalsIgnoreCase("Freiday")) {
            System.out.println("Freiday haftanin altinci günüdür.");
        }else if (day.equalsIgnoreCase("Saturday")) {
            System.out.println("Saturday haftanin yedinci günüdür.");
        }else{
            System.out.println("gecersiz gün ismi");
        }

        //2.yol
        switch(day.toLowerCase()){
            case "sunday":
                System.out.println("Sunday haftanin birinci günüdür.");
            break;
            case "monday":
                System.out.println("Monday haftanin ikinci günüdür.");
                break;
            case "tuesday":
                System.out.println("Tuesday haftanin ücüncü günüdür.");
                break;
            case "wednesday":
                System.out.println("Wednesday haftanin dördüncü günüdür.");
                break;
            case "thursday":
                System.out.println("Thursday haftanin besinci günüdür.");
                break;
            case "freiday":
                System.out.println("Freiday haftanin altinci günüdür.");
                break;
            case "saturday":
                System.out.println("Saturday haftanin yedinci günüdür.");
                break;
            default:
                System.out.println("gecersiz gun ismi");
        }

    }//main
}//class
