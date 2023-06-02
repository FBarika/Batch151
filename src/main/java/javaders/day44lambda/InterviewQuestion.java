package javaders.day44lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class InterviewQuestion {
    public static void main(String[] args) {
        //Example 1 : Size verilen bir array'in "Mountain Array" olup olmadigini gosteren kodu yaziniz.
        //            [0, 2, 5, 3, 1, -2]

        int [] arr = { 0, 2, 5, 8, 1};

//Array'i list'e cevirelim cunku List'i kullanmak daha kolay

        List<Integer> myList = new ArrayList<>();//Array den List e gecis yaptik cünkü List i kullanmak daha kolay.
        Arrays.stream(arr).forEach(t->myList.add(t));//Array class inda stream methodu arr arrayi stream e ceviriyor.foreach() methodu ile elemanlari List e ekledik.
        System.out.println(myList);//[0, 2, 5, 3, 1, -2]

        //List teki max elemani bulalim
        int max= myList.stream().reduce(Math ::max).get();
        System.out.println(max);
        int idxOfMax=myList.indexOf(max);//2

        //Maximum elemana kadarki tüm elemanlari bir List in icine koy
        List<Integer> firstList = new ArrayList<>();
        myList.stream().filter(t-> myList.indexOf(t)<=idxOfMax).forEach(t-> firstList.add(t));
        System.out.println(firstList);
        //Copy olusturalim
        List<Integer> firstListCopy = new ArrayList<>();
        firstList.stream().forEach(t->firstListCopy.add(t));
        System.out.println(firstListCopy);

        Collections.sort(firstListCopy);

        boolean rule1=firstList.equals(firstListCopy);

        System.out.println(rule1);

        //Maximum elemandan sonraki tum elemanlari bir List'in icine koy
        List<Integer> secondList = new ArrayList<>();
        myList.stream().filter(t->myList.indexOf(t)>=idxOfMax).forEach(t->secondList.add(t));
        System.out.println(secondList);

        //secondList'in copy'sini olustur
        List<Integer> secondListCopy = new ArrayList<>();
        secondList.stream().forEach(t->secondListCopy.add(t));
        System.out.println(secondListCopy);

        //secondListCopy'i ters olarak sirala
        Collections.sort(secondListCopy);
        Collections.reverse(secondListCopy);
        System.out.println(secondListCopy);

        //secondList ile secondListCopy ayni mi diye kontrol et
        boolean rule2 = secondList.equals(secondListCopy);
        System.out.println(rule2);

        System.out.println("Is the array mountain array? " + (rule1&&rule2));




    }
}
