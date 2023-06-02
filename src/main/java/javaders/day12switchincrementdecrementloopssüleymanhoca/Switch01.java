package javaders.day12switchincrementdecrementloopssüleymanhoca;

public class Switch01 {
    public static void main(String[] args) {
        /*
        Ay numarasi verildiginde numarasi verilen ayin ve December a kadarki tüm aylarin isimlerini console yazdiran kodu yazdiriniz
        */
        /*
        Note: switch parantezi icinde "String" "int" "byte" "short" ve "char" kullanilabilir.
        "boolean" "float"  "double" ve " long" kullanilmaz!!!!!!!!!!!!!!!!!

         */
        int monthNumber =3;
        switch(monthNumber){// numara girdigimiz icin string olmadigi icin lowercase fln kullanmayacagiz.
            case 1 :
                System.out.println("January");
            //break;
            case 2 :
                System.out.println("February");
            //    break;
            case 3 :
                System.out.println("March");
            //    break;// break switch in disina atar böylece diger aylar okunmayacak Javaya zaman kazandirir.
            case 4 :
                System.out.println("April");
            //    break;
            case 5 :
                System.out.println("May");
            //    break;
            case 6 :
                System.out.println("June");
            //    break;
            case 7 :
                System.out.println("July");
            //    break;
            case 8 :
                System.out.println("August");
            //    break;
            case 9 :
                System.out.println("September");
            //    break;
            case 10 :
                System.out.println("October");
            //    break;
            case 11 :
                System.out.println("December");
            //    break;
            case 12 :
                System.out.println("January");
                break;// bunu kaldirmayacagiz cünkü invalid yazmasini istemiyoruz.
            default:
                System.out.println("Invalid month number");

        }

    }//main
}//class
