package practice.b151practices.day05looparrays;

public class MaymunAlive {
     /* INTERWIEW SORUSU


Adada yalnız bir maymun var
Her gün 4 muz yemesi gerekiyor
o adada sadece 165 muz var
Maymunun kac gun hayatta kalabilecegini hesaplayan kodu yaziniz.

*/
     public static void main(String[] args) {
         int numberOfBananas =165;
         int survivalDays =1;
         boolean monkeyAlive = true;
         do{
             numberOfBananas-=4;// toplam muz sayisindan her gün 4 muz eksilir.
             System.out.println("Kalan Muz Sayisi: "+numberOfBananas);
             survivalDays++;
             if(numberOfBananas<4){
                 monkeyAlive=false;
                 System.out.println("Bugun "+survivalDays+". gün.Yeterli muz kalmadi");
             }else{
                 System.out.println("Bugün "+survivalDays+". gün.Maymun hala yasiyor.");
             }

         }while(monkeyAlive);











     }//main
}//class
