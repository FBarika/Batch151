package javaders.day13incrementdecrementloopsmehmethoca;

public class ForLoop01 {
    public static void main(String[] args) {
        //Example 1 : 21 den 180 e kadar hem 4 hem de 6 ile bölünebilen tam sayilari ekrana yazdiriniz.

        for(int i=21 ; i<181 ;i++ ){
            if(i%4==0 && i%6==0){
                System.out.println(i+" ");
            }

            }

        //Ex 2: Size verilen kücük harfle yazilmis String in Index i cift sayi olan character lerini büyük harfe dönüstürünüz.
        // ankara==>AKR
        // Note: Bir string de son index her zaman lenght()-1
        //Note: yazdiginiz kod belli seneryolar icin calisiyor ancak tüm senaryolar icin calismiyorsa
        // bu tarz koda ==> hard-code denir==> ve mutlaka düteltilmelidir.

        String s ="ankara";
        for(int i=0 ; i<s.length(); i++){
            if(i%2==0){
                System.out.println(s.toUpperCase().charAt(i));
                // ya da
                char ch=s.toUpperCase().charAt(i);
                System.out.println(ch);
            }

        }// 1.yol

        for(int i=0 ; i<s.length(); i++){
             String ch=s.substring(i,i+1);
             if(i%2==0){
                 System.out.println(ch.toUpperCase());
             }
            }//2.yol



    }
}
