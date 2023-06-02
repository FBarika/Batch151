package practice.b151practices.day01_practice;

public class C02_Ascii {
    public static void main(String[] args) {

        // Rakam kullanmadan 65, 66, 67, 68, 69, 70 sayilarinin toplamını bulunuz

        char büyükA ='A';
        char büyükB ='B';
        char büyükC ='C';
        char büyükD ='D';
        char büyükE ='E';
        char büyükF ='F';
        System.out.println("Ascii toplam ="+(büyükA+büyükB+büyükC+büyükD+büyükE+büyükF));//405
        // ya da
        int asciiA = 'A';
        int asciiB = 'B';
        int asciiC = 'C';
        int asciiD = 'D';
        int asciiE = 'E';
        int asciiF = 'F';
        System.out.println(asciiA+asciiB+asciiC+asciiD+asciiE+asciiF);//405

        //ya da

        System.out.println((int)'A'+(int)'B'+(int)'C'+(int)'D'+(int)'E'+(int)'F');//405









    }//main
}//class
