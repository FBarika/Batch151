package javaders.day37exceptionsenums;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomExceptionRunner {
    /*
     1)"try" kullandigimizda her senaryo icin calismasini istedigimiz kodlari "finally block" icine koyariz.try catchsiz finally ile birlikte kullanilabilir.
     try kullandigimizda, finally block, exception olsa da olmasa da calisir. Her senaryo icin calismasini istedigimiz
     kodlari finally block kullanarak saglamis oluruz. try catch'siz sadece finally ile kullanilabilir.
     Genelde try catch ve finally birlikte kullanilir.
     2)"final", "finally" ve "finalize" aciklar misiniz.
     "final" aciklandi
     "finally" aciklandi
     "finalize": "Garbage Collector" memory i temiz tutmak icin sürekli memory i tarar ve silinmesi gerenkenleri siler.
                 "Garbage Collector" silmeden önce silecegi datalari "finalize" eder(cöpleri posetlemek gibi) sonra siler.Silinmesi gerekiyorsa siler Java hata yapmaz.
                  Normalde finalize yapmak icin javada bir method avrdir. Biz o methodla Javadan finalize talep edebiliriz ama java dinlemez.
                  Biz talep ettigimiz halde java uygun görmeyip silmeyebilir.
     */
    public static void main(String[] args) throws IllegalGradeException {
        //System.out.println(getGrades());
        try{
            printAge(-45);
        }catch (IllegalAgeException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("I always work");//pozitif senaryoda bile calisir exception olsa da calisir olmasa da calisir.
        }

    }
    //Example 1; ögrenci notlarini bir List e ekleyen method u olusturunuz.

    public static List<String> getGrades() throws IllegalGradeException {

        List<String> grades = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        String grade = "";

        do {
            System.out.println("Please enter the grade.To stop entering press q");
            grade = input.next();
            int intGrade = 0;
            if (!grade.equals("q")) {
                intGrade = Integer.valueOf(grade);
            }
            if (grade.equals("q")) {
                break;
            } else if (intGrade >= 0 && intGrade <= 100) {
                grades.add(grade);
            } else {
                throw new IllegalGradeException("Grades less than zero and greater than 100 are not valid.");
            }
        } while (!grade.equals("q"));

        return grades;

    }
    //Ex 2: Kullanicinin yasini console a yazdiran methodu olusturunuz.
    public static void printAge(int age){
        if(age<0){
            throw new IllegalAgeException("Ages cannot be negative");
        }
        System.out.println(age);
    }
















}
