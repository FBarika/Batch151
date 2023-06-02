package javaders.day12switchincrementdecrementloopssüleymanhoca;

public class Loops01tekrar {
    public static void main(String[] args) {

        //"Massachusetts" kelimesindeki tum sesli harfleri console'a yazdiriniz
        String s ="Massachusetts";
        String k ="";
        for (int i = 0; i <s.length() ; i++) {
            char ch = s.toLowerCase().charAt(i);

            if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u'){
                k=k+ch;
            }
        }
        System.out.println(k);//aaue bu yol yeni bir string in icine koyup yazdirma

        //2.yol
        for (int i = 0; i <s.length() ; i++) {
            char ch = s.toLowerCase().charAt(i);

            if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u'){
                System.out.print(ch+" ");//a a u e  bu yol yeni bir string sepeti olusturmadan direk var olan string deki sesli harfleri yazdirma yolu.
            }
        }













    }//main
}//class
