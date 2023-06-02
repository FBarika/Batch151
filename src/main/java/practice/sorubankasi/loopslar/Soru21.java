package practice.sorubankasi.loopslar;

public class Soru21 {
    public static void main(String[] args) {
        /*
        21) Bir tamsayının benzersiz(tekrarsız) basamaklarının toplamını bulmak için kodu yazınız.
Örnek:12133455 ´ 2+4=6
        */
        int a =12133455;
        String s=a+"";
        int sum=0;
        for (int i = 0; i <s.length() ; i++) {
            if(s.indexOf(s.substring(i,i+1))==s.lastIndexOf(s.substring(i,i+1))){
                sum=sum+Integer.valueOf(s.substring(i,i+1));
            }
        }
        System.out.println(sum);//6
    }
}
