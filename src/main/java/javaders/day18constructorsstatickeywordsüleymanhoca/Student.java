package javaders.day18constructorsstatickeywordsüleymanhoca;

public class Student {
   /*
            1) "static" "class member"lar(variable + method + constructor + code bloks) tum object'ler tarafindan paylasilir.
            2) "static" "class member"daki degisiklikler tum object'ler tarafindan otomatik olarak gorulur.
            3) "static" "class member"lar gokteki ayin dunyaya bagli oldugu gibi, class'a baglidirlar.
            Bu yuzden "static" variable'lara "class variable" da denir.
            4) "static" "class member"larin nasil calistigini anlamak icin cizim yapip static olanlari class'a olmayanlari object'e
            baglayarak dusunmek bu konuyu kolaylastirir.
            5)"static" "class member"lari cagirmak icin object olusturmak gerekmez ve tavsiye edilmez.class ismini kullanarak cagirabiliriz.
            "non-static" "class member"lari cagirmak icin object olusturmak sarttir.class  ismi ile static olmayanlari göremeyiz.

            non-static Variable= instance variable
    */


    public static int numOfRegisteredStd =0;

    public int num = 0;

    public Student() {
        numOfRegisteredStd++;
        num++;
    }

    public static void main(String[] args) {
        Student s1 = new Student ();
        System.out.println(numOfRegisteredStd);//1

        Student s2 = new Student();
        System.out.println(numOfRegisteredStd);//2

        Student s3 = new Student();
        System.out.println(numOfRegisteredStd);//3

        System.out.println(numOfRegisteredStd);//3
        System.out.println(s1.num);//1







    }//main
}//class
