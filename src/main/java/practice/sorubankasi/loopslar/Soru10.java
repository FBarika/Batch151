package practice.sorubankasi.loopslar;

public class Soru10 {
    public static void main(String[] args) {
        /*
        10) Verilen ondalık sayının sadece ondalık kısmındaki rakamlarını, kendisinden önce bir yıldız
işaretiyle yazdırmak için gereken kodu yazınız.
Örneğin; 75.4238 ´ *4*2*3*8
         */
        String sayi= "75.4238";
        int idx=sayi.indexOf(".");
        String str=sayi.substring(idx+1);
        String result="";
        for (int i = 0; i <str.length() ; i++) {
            String r=str.substring(i,i+1);
            result=result+"*"+r;
        }
        System.out.println(result);//*4*2*3*8
        
















































    }
}
