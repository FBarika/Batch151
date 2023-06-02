package practice.replit.forwhileler;

public class Soru3 {
    public static void main(String[] args) {
/*
Bir String icerisinde yinelenen karakterleri döndüren bir kod yazıniz.(mülakat Sorusu)

Input :

String str=“Javaisalsoeasy”

Output: a s
 */

        String str = "Javaisalsoeasy";
        String result="";
        for (int i = 0; i <str.length() ; i++) {
            String k=str.substring(i,i+1);
            if(str.indexOf(k)!=str.lastIndexOf(k) && !result.contains(k)){
               result+=k;
            }

        }
        System.out.println(result);










    }
}
