package javaders.day20methodoverloadingarraylistmehmethoca;


import java.util.ArrayList;

public class ArraysList01 {
    public static void main(String[] args) {

    //ArrayList nasil olusturulur?
        ArrayList<Integer> ages = new ArrayList<>();

    //ArrayList console nasil yazdirilir?
        System.out.println(ages);//[]

    //ArrayList lere nasil eleman eklenir?
    ages.add(9);
    ages.add(12);
    ages.add(10);
        System.out.println(ages);//[9, 12, 10]

    ages.add(1,656);
        System.out.println(ages);

    }//main
}//class
