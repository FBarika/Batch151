package javaders.day18constructorsstatickeywordsüleymanhoca;

import java.util.Arrays;

public class StudentRunner {
    public static void main(String[] args) {
        // static olan "numOfRegisteredStd" variable ini cagirmak icin sadece class ismini kullandik,object olusturmadik.
        System.out.println(Student.numOfRegisteredStd);//0

        //static olmayan "num" variable ini cagirmak icin object olusturduk.
        Student s1 = new Student();
        System.out.println(s1.num);

        //static olan numOfRegisteredStd variable ina object üzerinden de ulasabilirsiniz ama bu HATADIR.Ama java bu hataya müsade eder elle yazariz.
        System.out.println(s1.numOfRegisteredStd);

        // mesela Arrays class inda sort methodu static tir Arrays class i ile ulasabiliriz.
        //String class inda valueoff, join gibi methodlar statictir ama mesela uppercase fln static degildir
        //ona ulasmak icin once String s= "Ali" ; digerek obje olusturmamiz gerekiyor.





















    }//main
}//class
