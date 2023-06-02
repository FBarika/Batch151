package practice.b151practices.day02_practice;

import java.util.Scanner;

public class C04_SwitchCase {
    public static void main(String[] args) {
        /*

Bir restoranda, müşteriler menüden yemeklerini seçerler.
Restoran, müşterilerin seçtiği yemeği pişirmek için bir
program yazilmasini ister. Örneğin, müşteriler menuden hangi yemegi
secerse  o menunun musteriye hazirlanip sunuldugu ve ucretin
belirlendigi bir program yaziniz

hamburger=200 Tl
pizza=500Tl
tavuk=700Tl
*/

        String yemek="hamburger";
        switch (yemek){
            case "hamburger":
                System.out.println("Hamburger menusu 200 Tl");
            break;
            case "pizza":
                System.out.println("pizza menusu 500 Tl");
            break;
            case "tavuk":
                System.out.println("tavuk menusu 700 Tl");
                break;
            default:
                System.out.println("öyle bir secenegimiz mevcut degil");

        }

        /*
        Bir arac kiralama sitesinde secilen araba markasina göre degisen kiralama ücreti ve kiralanacak gün sayisina göre
        Toplam ödenecek fiyati gösteren kodu yaziniz.

        SUV==>500.0
        SEDAN==>400.0
        HATCBACK==>350.0
        geriye kalanlar ==>300.0
        */

        String aracTuru ="SUV";
        int kiralanacakGünSayisi=5;
        double kiralamaÜcreti;

        switch (aracTuru){
            case "SUV":
                kiralamaÜcreti=500.0;
            break;
            case "SEDAN":
                kiralamaÜcreti=400.0;
                break;
            case "HATCBACK":
                kiralamaÜcreti=350.0;
                break;
            default:
                kiralamaÜcreti=300.0;
            break;

        }
        double toplamUcret=kiralanacakGünSayisi*kiralamaÜcreti;
        System.out.println("Toplam Ücret = "+ toplamUcret);

        /*
Hayvanat bahçesinde ziyaretçilere yemek vermek için bir robot kullanılıyor.
Ziyaretciler hangi hayvani beslemek istiyorsa onun ismini yazsin  ve Robotta
gidip o hayvani beslesin.Örneğin, ziyaretçilerin "fil" hayvanını beslemek
istediklerini söylediklerinde, robot fil hayvanının yanına gider ve
onlara yemek verir.Ziyaretçilerin hangi hayvanları beslemek istediklerini
kontrol eden bir program yaziniz
elephant lion giraffe
default==> belirtilen hayvan bulunamadi.
 */
        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen bir hayvan ismi giriniz");
        String hayvan =input.next().toLowerCase();
        switch (hayvan){
            case "elephant":
                System.out.println("File yemek verildi");
            break;
            case "lion":
                System.out.println("Aslana yemek verildi");
                break;
            case "giraffe":
                System.out.println("Zürafaya yemek verildi");
                break;
            default:
                System.out.println("belirtilen hayvan bulunamadi");

        }













    }//main
}//class
