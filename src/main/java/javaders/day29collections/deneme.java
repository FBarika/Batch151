package javaders.day29collections;

import java.util.Collections;
import java.util.LinkedList;

public class deneme {
    public static void main(String[] args) {
        LinkedList<String> s = new LinkedList<>();
        s.add("Esra");//bunu sonradan ekledik.
        s.add("Steve");
        s.add("Ajda");
        s.add("Müge");
        s.add("Cüneyt");
        s.add("Esra");
        Collections.reverse(s);
        System.out.println(s);//[Esra, Cüneyt, Müge, Ajda, Steve, Esra]
        //reserve() methodu girilen siranin tersine göre yazdiriyor.
        System.out.println(s.removeAll(s));
    }
}
