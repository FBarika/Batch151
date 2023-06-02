package practice.sorubankasi.switchonstatementlar;

public class Soru4 {
    public static void main(String[] args) {
        /*
        4) Cinsiyet "Erkek" ise "Erkek" yazdırınız.
Cinsiyet "Kadın" ise "Kız" yazdırınız.
Cinsiyet "Erkek" ve "Kadın"dan farklıysa "Diğerleri" yazdırınız.
Not : Bu seçenekler dışındakilerini yoksayınız.

         */
        String cinsiyet = "Farkli";
        switch(cinsiyet.toLowerCase()){
            case "kadin" :
                System.out.println("Kiz");
            break;
            case "erkek" :
                System.out.println("Erkek");
            break;
            case "farkli" :
                System.out.println("Digerleri");
            break;
            default:
                System.out.println("Gecersiz");
        }
    }
}
