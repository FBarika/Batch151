package practice.smallstudygrup.datetime;

import java.time.LocalDate;

public class C01_dateTime {
    /*
        soru 1)
        -bugunun tarihini obje olusturarak yazdirin//
        -bugun yilin kacinci gunu oldugunu yazdirin
        -hangi gunde oldugumuzu yazdirin
        -bugunden itibaren 3yil 5 ay 7gun sonraki tarihi yazdirin
        sout(tarih.plusYears(3).plus.Months(5).plusDays(7))
        -bugunden itibaren 3yil 5 ay 7 gun sonraki tarihin ayin kacinci gunu oldugunu yazdirin
        -bugunden itibaren 3yil 5 ay 7 gun sonraki tarihin haftanin hangi gunu oldugunu yazdirin
        -ikinci bir tarih objesi olusturun ve iki tarihi karsilastirin ve bize eski olan tarihi dondurun
 */
    public static void main(String[] args) {

        LocalDate bugun=LocalDate.now();
        System.out.println(bugun);//2023-04-28

        System.out.println(bugun.getDayOfYear());//118 yilin 118. günü
        System.out.println(365-bugun.getDayOfYear());//247 bir sonraki yila 247 gün kaldi.

        System.out.println(bugun.getDayOfWeek());//FRIDAY  bugünün hangi gün oldugunu yazdirir.

        System.out.println(bugun.plusYears(3).plusMonths(5).plusDays(7));//2026-10-05

        System.out.println(bugun.plusYears(3).plusMonths(5).plusDays(7).getDayOfMonth());//5 ayin kacinci gün oldugunu veriyor.
        System.out.println(bugun.plusYears(3).plusMonths(5).plusDays(7).getDayOfWeek());//MONDAY haftanin hangi günü oldugunu veriyor.
        System.out.println(bugun.plusYears(3).plusMonths(5).minusWeeks(6).minusDays(15));//2026-08-02
        System.out.println(bugun.plusYears(3).plusMonths(5).minusWeeks(6).minusDays(15).getDayOfWeek());//2026-08-02

        LocalDate tarih=LocalDate.of(2023,4,28);
        System.out.println(tarih.isBefore(bugun));//true
        if (tarih.isBefore(bugun)){
            System.out.println(tarih);
        } else if (tarih.isAfter(bugun)) {
            System.out.println(bugun);
        }else System.out.println("iki tarih birbirinin aynisi ve tarih : "+tarih);


    }
}
