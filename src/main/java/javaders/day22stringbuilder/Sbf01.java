package javaders.day22stringbuilder;


public class Sbf01 {
    /*
    1)StringBuffer Java da String üreten bir class tir.
    2)StringBuffer , StringBuilder e cok benzer, yani iksi de "mutable"(degistirilebilir) String üretir.
    3)StringBuffer "multi-thread" dir ama StringBuilder "multi-thread"(coklu is) degildir.
    4)Java StringBuffer i, StringBuilder dan önce olusturdu.
    5)StringBuilder "multi-thread" olmadigi icin StringBuffer dan daha hizli calisir.
    6) "multi-thread" yapilirken yapilan islerin siralamasi önem arz eeder.
    mantikli bir siraya koymak "synchronization" olarak adlandirilir.
    StringBuffer "multi-thread" oldugu icin ayni zamanda "synchronized" dir.

    3 tane String olusturan class ögrendik
    1)immutable String lazimsa; String Class
    2)mutable String lazimsa; StringBuilder veya StringBuffer
                       i)StringBuilder i multi-thread gerekmezse kullaniriz.
                       ii)StringBuffer i multi-thread gerekirse kullaniriz.
     */
    public static void main(String[] args) {

         StringBuffer sbf1= new StringBuffer("Java");





    }//main
}//class
