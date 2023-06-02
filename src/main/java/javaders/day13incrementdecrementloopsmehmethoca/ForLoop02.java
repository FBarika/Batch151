package javaders.day13incrementdecrementloopsmehmethoca;

public class ForLoop02 {
    public static void main(String[] args) {
        //Ex 1: Verilen bir String de ilk 'a' önceki tüm karakterleri console a yazdiriniz.
        // "I love Java" ==> "I love J"

        String s = "I love Java";
        for(int i=0 ; i<s.length() ; i++){
            char ch= s.charAt(i);
            if(ch=='a'){
                break;
            }
            System.out.print(ch);
        }
     //Note: switch özel keyword "case" dir. "break" hem switch hem de loop da kullanilabilir.
        System.out.println();
        //Ex 2: Verilen bir String le son 'a' san sonraki tüm karakterleri ters sirada yazdiriniz.
        //"Germany"==>yn
        String t = "Germany";
        for(int i= t.length()-1;i>=0 ;i--){
            char ch1= t.charAt(i);
            if(ch1=='a'){
                break;
            }
            System.out.print(ch1);
        }


    }//main
}//class
