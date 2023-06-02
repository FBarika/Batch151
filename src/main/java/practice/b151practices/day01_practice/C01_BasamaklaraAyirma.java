package practice.b151practices.day01_practice;

public class C01_BasamaklaraAyirma {
    public static void main(String[] args) {

        //12345 sayisinin rakamlarini toplamini bulunuz.
        int number = 12345;
        int number1 = number%10;
        int number2 = (number%100)/10;
        int number3 = (number%1000)/100;
        int number4 = (number%10000)/1000;
        int number5 = (number%100000)/10000;
        System.out.println("toplam="+(number1+number2+number3+number4+number5));

        // ya da
        int num = 12345;
        int a = num%10;
        int b= (num/10)%10;
        int c= (num/100)%10;
        int d= (num/1000)%10;
        int e= (num/10000)%10;

        System.out.println(a+b+c+d+e);



    }//main
}//class
