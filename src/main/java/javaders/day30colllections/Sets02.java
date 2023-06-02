package javaders.day30colllections;

import java.util.HashSet;
import java.util.TreeSet;

public class Sets02 {
    public static void main(String[] args) {
        //Example:Ögrenci email adreslerini Natural Order da siralanmis olarak depolayiniz.

        //1.Yol
        long t1=System.nanoTime();

        TreeSet<String> email =new TreeSet<>();
        email.add("abc@gmail.com");
        email.add("abd@gmail.com");
        email.add("abe@gmail.com");
        email.add("abf@gmail.com");
        email.add("abg@gmail.com");
        email.add("abh@gmail.com");
        email.add("abi@gmail.com");
        email.add("abj@gmail.com");
        email.add("abk@gmail.com");
        email.add("abl@gmail.com");
        System.out.println(email);

        long t2=System.nanoTime();

        //2.yol  bu yol daha hizli calisir. 1. yol da biz eleman ekledikce siralama yapar sürekli ama bu yolda sadece bir kere siralama yapar.
        HashSet<String> emailsHs= new HashSet<>();
        emailsHs.add("abc@gmail.com");
        emailsHs.add("abd@gmail.com");
        emailsHs.add("abe@gmail.com");
        emailsHs.add("abf@gmail.com");
        emailsHs.add("abg@gmail.com");
        emailsHs.add("abh@gmail.com");
        emailsHs.add("abi@gmail.com");
        emailsHs.add("abj@gmail.com");
        emailsHs.add("abk@gmail.com");
        emailsHs.add("abl@gmail.com");

        TreeSet<String> emailsHsTs = new TreeSet<>(emailsHs);
        System.out.println(emailsHsTs);

        long t3=System.nanoTime();

        System.out.println(t2-t1);//TreeSet 1238100
        System.out.println(t3-t2);//HashSet 489000









































    }
}
