package practice.sorubankasi.arraysler;

public class Soru9 {
    public static void main(String[] args) {

       //9) Verilen bir String arraydeki belirli bir öğenin var olup olmadığını bulmak için kod yazınız.

        String[] arr ={"Apex", "is", "an", "object", "oriented", "programming", "language"};

        String k="Apex";
        int counter=0;
        for (String w:arr) {
            if(w.equalsIgnoreCase(k)){
                counter++;
            }
        }
        if(counter>0){
            System.out.println(k+" Array de vardir.");
        }else {
            System.out.println(k+" Array de yoktur.");
        }























    }
}
