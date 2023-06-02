package javaders.day34exceptions;

public class E03 {



    public static void main(String[] args) {

        System.out.println(getNumOfChars("Java"));
        System.out.println(getNumOfChars("Money"));
        System.out.println(getNumOfChars(""));

        System.out.println(getNumOfChars(null));



    }

  //Bir String teki karakter sayisini veren method olusturunuz.

  public static int getNumOfChars(String s){
        int result=0;
        try{

            result = s.length();

        }catch(NullPointerException e){//NullPointerException String class ta null ile uyumlu olmayan method lar kullanildiginda atilir.

            System.out.println("Some String methods do not work with null...");

            System.out.println(e.getMessage());//null ==> Java nin exception icin ürettigi teknik mesaji varsa verir.
        }
        return result;
  }
  //e.getMessage Java nin exception icin urettigi teknik mesaji varsa verir.



}
