package practice.sorubankasi.ternarystatementlar;

public class TernaryStatementilk2Soru {
    public static void main(String[] args) {
        /*
        1) Ternary kullanarak, aşağıdaki kodları konsolda yazdırınız.
Parola boşluk karakterinden farklı olarak en az 8 karakter içeriyorsa, "Geçerli Parola",
Parola boşluk karakterinden farklı olarak 8 karakterden daha az ise, "Geçersiz Parola"

*/
     String parola="123Hukuk?";
      String b = parola.replaceAll(" ","").length()>7 ? "Gecerli parola":"Gecrsiz parola";
        System.out.println(b);//Gecerli parola

  /*
2) Ternary kullanarak, aşağıdaki kodları konsolda yazdırınız.
a) Bir üçgenin iki kenarının uzunluğu eşitse "İkizkenar Üçgen".
b) Bir üçgenin tüm kenarlarının uzunluğu eşitse "Eşkenar Üçgen".
c) a ve b koşulları sağlanmıyorsa "Çeşit Kenar Üçgen "

 */
      int a=5;
      int d=5;
      int c=5;
     String l= (a==d && d!=c) || (a==c && d!=c) ||(c==d && a!=c) ? "Ikizkenar ucgen" : (a==d && d==c ? "eskenarücgen" : "cesit kenar ucgen");
        System.out.println(l);
    }//main
}//class
