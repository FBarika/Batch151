package practice.sorubankasi.loopslar;

public class Soru18 {
    //18) Bir String’ de benzersiz(tekrarsız) karakterler yazdırmak için kod yazınız.
    //Örneğin; Hello ==> Heo
    public static void main(String[] args) {
        String s = "Hello";

        for (int i = 0; i <s.length() ; i++) {
            if (s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i))){
                System.out.print(s.charAt(i));
            }
        }
    }
}
