package javaders.day13loopssüleymanhoca;

public class Loops02tekrar {
    public static void main(String[] args) {
        // Verilen bir String de kücük harfleri yazmayiniz.
        //"Pwd12?Ab"==>P12?A
        //1.yol
        String k ="Pwd12?Ab";
        for (int i = 0; i <k.length() ; i++) {
           String m = k.substring(i,i+1);
           if(m.replaceAll("[a-z]","").length()>0){
               System.out.print(m);//P12?A
           }

        }
        System.out.println();
        //2.yol
        for (int i = 0; i <k.length() ; i++) {
            char ch = k.charAt(i);
            if(ch>='a' && ch<='z'){
                continue;// devam et bosver demek loopu kirmadan loop un icinden devam eder okumaya
            }else{
                System.out.print(ch);//P12?A

            }

        }
        System.out.println();
        //Bir String i tersten yazdiran kodu yaziniz
        String x = "Barika";
        String z="";
        for (int i = x.length()-1; i>=0 ; i--) {
            String y =x.substring(i,i+1);
            z=z+y;
        }
        System.out.print(z);//akiraB

        System.out.println();

        //Bir tamsayinin rakamlarinin toplamini veren kodu yaziniz
        //578==> 5+7+8 =20

        int a =578;
        int sum=0;
        for (int i =578; i >0 ; i=i/10) {
           int p=i%10;
           sum=sum+p;

        }

        System.out.println(sum);//20












    }//main
}//class
