package practice.smallstudygrup.datetime;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class C04_period {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Dogum gunu tarihini giriniz yil,ay,gun seklinde giriniz");
        int yil= scan.nextInt();
        int ay= scan.nextInt();
        int gun= scan.nextInt();
        LocalDate dogumGunu=LocalDate.of(yil,ay,gun);
        LocalDate bugun=LocalDate.now();
        Period period=Period.between(bugun,dogumGunu); //iki tarih arasindaki farki aliyor.
        System.out.println(period);


    }
}

