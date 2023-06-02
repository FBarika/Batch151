package practice.b151practices.day09practice;

public class C02_IncrementDecrement {
    public static void main(String[] args) {

        int a =15;
        int b=a++;
        System.out.println(b);//bu bize 15 döndürür cünkü önce esayn ediyor sonra artiriyor java
        System.out.println(a);//burada bize 16 döndürür a yi ++ ile bir artirdik cünkü

        int sayi1=10;
        int sayi2=20;
        int sayi3=30;

        sayi2=sayi1++;
        System.out.println(sayi2);//bu bize 10 u verir. Java soldan saga calisir önce esayn etti sonra sayi1 i yazdidir.
        System.out.println(sayi1);//bize 11 döndürür.

        sayi3=++sayi1;
        System.out.println(sayi3);//bu bize 12 döndürür cünkü burda önce artiracak sonra esayn edecek

        System.out.println(sayi1);//12 sayi1 en son 11 di bir arttirdik 12 oldu.

        System.out.println(sayi3++);//burda 12 yazdirir cünkü java önce yazdirir sonra artiracak
        System.out.println(sayi3);//burda 13 verir yukarida artirdi bize 13 verecek
        System.out.println(--sayi2);//burda bize 9 verir önce eksiltir sonra yazdirir.

        sayi2++;
        System.out.println(sayi2);//burda 10 vericek yukarida artirdi en son deger 9 du 10 oldu simdi yazdirdik.

        System.out.println(sayi2--);//burda 10 yazdirir yine önce yazdiracak.

        System.out.println(sayi2);//burda 9 verir yukarida eksilttikten sonra simdi yazdirdik

        System.out.println(sayi3++);//burada 13 verir bize en son degeri 13 tü yazdirdiktan sonra artiracak.

        System.out.println(sayi3);//burada 14 vericek bize yukarida artirdik simdi yazdiriyoruz.


    }
}
