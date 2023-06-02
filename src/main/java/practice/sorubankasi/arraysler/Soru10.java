package practice.sorubankasi.arraysler;

public class Soru10 {
    public static void main(String[] args) {
    /*
    10) Verilen bir String arraydeki öğelerin karakter sayilarinin toplamını bulmak için kod yazınız.

     */
        String[] arr = new String[]{"alabama", "pick", "sos", "sets", "pex"};
        int sum=0;
        for (String w:arr) {
            sum+=w.length();

            }
        System.out.println(sum);

    }
}
