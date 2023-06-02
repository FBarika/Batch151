package practice.smallstudygrup.stringbuilder;

public class C01_stringBuilder {
    public static void main(String[] args) {

        //soru 1) StringBuilder olusturma yontemlerine bakiniz.
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder("Ahmet");
        StringBuilder sb3=new StringBuilder(6);
        System.out.println(sb1.capacity()); // capatiy 16
        System.out.println(sb2.capacity()); // capatiy string deger girilince string deger+capatiy =21
        System.out.println(sb3.capacity());//6 bunu zaten biz belirledik.

        System.out.println(sb1.length());//0
        System.out.println(sb2.length());//5
        System.out.println(sb3.length());//0
        sb1.append("Java cok Guzel");
        System.out.println(sb1.capacity());
        System.out.println(sb1);
        System.out.println(sb2.append(" furkan"));
        System.out.println(sb2.capacity());
        System.out.println(sb2);
        sb3.append("Kirklareli");
        System.out.println(sb3.capacity()); // 2 katinin 2 fazlasi seklinde artiyor.




        // StringBuilder sb1=new StringBuilder();
        // System.out.println(sb1.capacity());//16
        // System.out.println(sb1.length());//0
        // sb1.append("?");
        // System.out.println(sb1);
        // System.out.println(sb1.length());//1
        // System.out.println(sb1.capacity());//16
        // sb1.append("1234567890123456");
        // System.out.println(sb1.capacity());
        // System.out.println(sb1.length());


        //  StringBuilder sb2=new StringBuilder("TechProEd");
        // System.out.println(sb2.capacity());//25
        // System.out.println(sb2.length());//9
        //  sb2.append(" cok guzel bir kurum");
        //  System.out.println(sb2.capacity());
        //  System.out.println(sb2.length());





/*
        StringBuilder sb5=new StringBuilder(7);
        System.out.println(sb3.capacity());//7
        System.out.println(sb3.length());//0
        sb3.append("hava bugun cok soguk");
        System.out.println(sb3);
        System.out.println(sb3.capacity());//20
        System.out.println(sb3.length());//20
        //sb3.append("cok soguk");
        //System.out.println(sb3.capacity());//34


 */
    }
}

