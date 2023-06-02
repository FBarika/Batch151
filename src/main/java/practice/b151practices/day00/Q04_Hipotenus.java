package practice.b151practices.day00;

public class Q04_Hipotenus {
    //Hipotenüs hesaplayan bir kod yazınız
    public static void main(String[] args) {
        System.out.println(hipotenusHesapla(3,4)*2);

    }
    public static double hipotenusHesapla(double dikKenar1, double dikkenar2){

       return Math.sqrt(dikKenar1*dikKenar1 + dikkenar2*dikkenar2);
        // bir variable ismini degistirmek istiyorsak sag tiklayip refactor sonra rename diyoruz.

    }
}
