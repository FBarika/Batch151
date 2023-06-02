package practice.sorubankasi.loopslar;

public class Soru16 {
    public static void main(String[] args) {
        //16) Bir String de, ilk 'm' karakterinden önceki tüm karakterleri yazınız.

        String s = "Christmas";
        for (int i = 0; i <s.length() ; i++) {
            if(s.substring(i,i+1).equals("m")){
                System.out.print(s.substring(0,i));

            }
        }
        //2.Yol
        String result = "";
        for(int i=0; i<s.length(); i++){
            String c = s.substring(i,i+1);
            if(c.equals("m")){
                break;
            }
            result = result + c;
        }
        System.out.println(result);









    }
}
