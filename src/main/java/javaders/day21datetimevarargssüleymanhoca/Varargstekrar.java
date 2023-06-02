package javaders.day21datetimevarargssüleymanhoca;

public class Varargstekrar {
    public static void main(String[] args) {


        System.out.println(add(5, 6, 9, 10, 69, 78));//177
        harf("Ali Can","Veli Can","Fatma Barika");

    }//main



    public static int add(int ...a){
        int sum=0;
        for (int w:a) {
            sum=sum+w;
        }
        return sum;

    }
    ////Ex 2 : Verilen isimlerin ilk harflerini console yazdiran methodu olusturunuz.
    //    //  Ali Can ==> AC      Kemal Han ==>KH

    public static void harf(String...s){
        String result="";
        for (String w:s) {
           result= result+w.charAt(0) + w.toUpperCase().split(" ")[1].charAt(0);
            System.out.print(result+" ");//AC VC FB
           result="";
        }
    }


















}//class
