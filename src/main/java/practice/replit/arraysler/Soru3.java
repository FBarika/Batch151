package practice.replit.arraysler;

public class Soru3 {
    /*
    Arraydeki sayıların ortalamasını hesaplayan Java Kodunu yazınız.
Array =  [20, 30, 25, 35, -16, 60, -100 ]
Beklenen Çıktı:
Array Sayılarının ortalaması: 7.0
     */
    public static void main(String[] args) {
        int [] sayilar ={20, 30, 25, 35, -16, 60, -100};
        int sum=0;
        for (int w:sayilar) {
            sum=sum+w;
        }
        System.out.println(sum/sayilar.length);//7
    }
}
