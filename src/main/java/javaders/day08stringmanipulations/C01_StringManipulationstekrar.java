package javaders.day08stringmanipulations;

public class C01_StringManipulationstekrar {
    public static void main(String[] args) {

        // Ex : Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz
        String tv = "599.99$";   String laptop = "299.99$";
        String tv1 =tv.replace("$","");
        String laptop1 =laptop.replace("$","");
        double toplam =Double.valueOf(tv1)+Double.valueOf(laptop1);
        System.out.println(toplam+"$");//899.98$

        String tamIsim = "  mehmet fatih  ";

        //Ex: Verilen tam isim String inin icindeki ilk ismin ilk harfi ile son ismin ilk harfini büyük harf olarak yan yana yazdiriniz. ==>MF

        char ilkHarf =tamIsim.trim().toUpperCase().charAt(0);
        char ikinciHarf =tamIsim.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println("sonuc= "+ilkHarf+ikinciHarf);//sonuc= MF








    }//main
}//class
