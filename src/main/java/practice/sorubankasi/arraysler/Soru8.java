package practice.sorubankasi.arraysler;

public class Soru8 {
    public static void main(String[] args) {

       /*
       8) İlk ve son karakterleri aynı olan array öğelerini bulmak için kod yazınız.

        */
        String[] arr = new String[]{"alabama", "pick", "sos", "sets", "pex"};

        for (String w:arr) {
            if(w.charAt(0)==w.charAt(w.length()-1)){
                System.out.println(w);
            }
        }
































    }
}
