package practice.gruppractice;

import java.util.Scanner;

public class bankaSorusu {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Adinizi giriniz");
        String name = input.next().toUpperCase();
        System.out.println("Soyadinizi giriniz");
        String surname = input.next().toUpperCase();
        System.out.print("Kredi karti numarasini giriniz:");
        String CCN = input.next();

        String ilkharf = name.substring(0, 1);
        name = name.substring(1).replaceAll("[a-zA-Z]", "*");
        System.out.print(ilkharf.concat(name) + " ");

        String ilkharfsurname = surname.substring(0, 1);
        surname = surname.substring(1).replaceAll("[a-zA-Z]", "*");
        System.out.println(ilkharfsurname.concat(surname));
        for (int i = 0; i < CCN.length(); i++) {
            if (CCN.charAt(i) == ' ') {
                continue;
            }
            if (i < CCN.length() - 4) {
                System.out.print("*");

            } else {
                String lastFour = CCN.substring(CCN.length() - 4);
                System.out.print(lastFour);
                break;
            }

        }

    }
}
