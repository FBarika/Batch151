package javaders.day09stringmanipulationsifstatement;

public class C01_StringManipulations {
    public static void main(String[] args) {

        //Ex: Bir String in hic karakter icerip icermedigini kontrol eden kodu yaziniz.
        String str= "";
        //1.Yol lenght() methodu ile
        boolean result1 = str.length()==0;// Javaya 2 islem yaptirdim 1. length () 2. ==0 kullandim
        System.out.println("String bos mu=" + result1);

        //2.Yol isEmpty() methodu ile
        //*****************isEmpty()***************\\
        /*
        isEmpty () methodu String datanin icerisinde hicbir sey yoksa true döndürür.
        Javada space de bir karakter oldugu icin false döndürür.Bos mu dolu mu diye bakar.
        */
        boolean result2 = str.isEmpty();// Javaya sadece 1 is yaptirildi isEmpty()
        System.out.println("String Bosmu = " + result2);

        // Ex: Bir String'in bosluk haric hicbir karakter
        // icermedigini gösteren  kodu yaziniz
        String t = "  ";
        // 1.Yol

        boolean result3 = t.replace(" ","").length() ==0;//javaya 3 islem yaptirdik.
        System.out.println("result3 t = " + result3);// true

        // 2. Yol
        boolean result4 = t.replace(" ","").isEmpty();// javaya 2 islem yaptirdik.
        System.out.println("result4 t= " + result4);//true
        /*

        // 3.Yol
        //***************isBlank**********************\\
        /*
        isBlank() ==> space+hiclik ise True döndürür.
        String bir datanin bos mu dolu mu olduguna bakar.isEmpty den farkli space varsa yine true döndürür.
         */
        boolean result5=t.isBlank();// javaya 1 islem yaptirdik.
        System.out.println("result5 t = " + result5);

        //*******************indexOf() ***********************\\
        /*
        Verilen karakter veya karakterlerin ilk görünümünün indexini verir.
        int bir deger döndürür.
        Coklu data icin kullanildiginda ilk gördügü datanin ilk gördugü karakterin indexini verir.
        Olmayan bir karakterin index i sorulursa bize -1 döndürür.

        */
        // Ex: Bir String de a,i,e karakterlerinin ilk görünümünün indexleri toplamini ekrana yazdiriniz.

        String s="Java is easy to learn ";// 1+5+8=14
        int k =s.indexOf("a",2);
        System.out.println("sonuc =" +k);// cümledeki 2. 'a' nin index ini veriyor.
        int aIdx =s.indexOf('a');
        System.out.println("aIdx = " + aIdx);//aIdx =1

        int iIdx=s.indexOf('i');
        System.out.println("iIdx = " + iIdx);//iIdx = 5

        int eIdx=s.indexOf('e');
        System.out.println("eIdx = " + eIdx);//eIdx = 8
        System.out.println("indexler toplami="+(aIdx+iIdx+eIdx));//indexler toplami=14

        int pIdx =s.indexOf('p');
        System.out.println("pIdx = " + pIdx);// pIdx = -1 olmayan karakterler icin -1 döndürür.
        String s2 ="Java is easy to learn to easy to";
        
        int toIdx = s2.indexOf("to");//// ilk gördugü kelimenin ilk karakterini "to" yu döndürüyor.Yani t nin indexini verir.
        System.out.println("toIdx = " + toIdx);//13

        // Ex: Bir String de "Java" kelimesinin ilk olarak kacinci index'de oldugunu gösteren kodu yaziniz.
        String cumle = "Ah Java vah Java sen ne güzel seysin Java";
        int indexJava =cumle.indexOf("Java");
        System.out.println("indexJava = " + indexJava);//indexJava = 3
        
        int indexQYX = cumle.indexOf("indexQYX");
        System.out.println("indexQYX = " + indexQYX);//indexQYX = -1

        //*********************lastIndexOf()*****************\\
        /*
        lastIndexOf() Verilen String bir datada istenilen degerin son görünümünün index ini verir.
         Olmayan bir karakter sorgulanirsa -1 döndürür.

         */
        // Ex: Bir String de a,i,e karakterlerinin son görünümünün indexleri toplamini ekrana yazdiriniz.
        String c ="Java is easy to learn ";

        int aLidx =c.lastIndexOf('a');
        System.out.println("aLidx = " + aLidx);//aLidx = 18
        int eLidx = c.lastIndexOf('e');
        System.out.println("eLidx = " + eLidx);//eLidx = 17
        int iLidx = c.lastIndexOf('i');
        System.out.println("iLidx = " + iLidx);//iLidx = 5
        System.out.println("Son indexler Toplami="+(aLidx+eLidx+iLidx));//Son indexler Toplami=40













    }//main
}//class
