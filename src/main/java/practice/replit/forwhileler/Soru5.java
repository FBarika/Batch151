package practice.replit.forwhileler;

public class Soru5 {
    public static void main(String[] args) {
        /*
        100'den 0'a kadar çift sayıları yazdırın, ancak decrement(i--) kullanmayın.

OUTPUT  :
100 98 96 94 92 … … … … 2 0
         */
        int sayi=100;
        do{
            if(sayi%2==0){
                System.out.print(sayi+" ");
            }
            sayi=sayi-2;
            if(sayi==0){
                System.out.println(sayi);
                break;
            }

        }while(true);







    }
}
