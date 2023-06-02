package javaders.day33maps;

import java.util.HashMap;
import java.util.TreeMap;

public class HashMap01 {
    public static void main(String[] args) {
        //Example 1: Verilen bir String'de hangi harfin kac defa kullanildigini veren method olusturunuz.
        //"Hello Henry!"==> H=2, e=2, l=2, o=1, n=1, r=1, y=1

        String s= "Hello Henry!";
        System.out.println(getTheNumOfOccurenceOfLetters(s));//{H=2, e=2, l=2, n=1, o=1, r=1, y=1} // Java büyük harfler kücük harflerden önce gelir(ascii den dolayi) o yüzden önce treeMap büyük harfi birinci siraya koydu


    }
    public static TreeMap<String,Integer> getTheNumOfOccurenceOfLetters(String s){

        //String deki harf disi karakterleri sil
        s=s.replaceAll("[^A-Za-z]","");

        //Görünüm sayilarini depolamak icin Map olustur.
        TreeMap<String, Integer> numOfOccurence = new TreeMap<>();// harfleri alfabetik siraya göre görmek istersek TreeMap e cevirmeliyiz.

        //Harfleri almamiz gerekiyor

        String letters[] =s.split("");
        for (String w:letters) {
            Integer numOfOcc=numOfOccurence.get(w);
            if(numOfOcc==null){
                numOfOccurence.put(w,1);
            }else{
                numOfOccurence.replace(w,numOfOcc+1);//var olan degeri degistirmek icin replace kullandik put() da olur ama okunurlugu azaltir.
            }

        }
        return numOfOccurence;
    }
}
