package javaders.day19passbyvaluemethodoverloadingmehmethoca;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PassByValue {
    public static void main(String[] args) {

        int shirtPrice =200;
     //burada passbyvalue sayesinde shirtprice degeri koruma altina alinir.
        System.out.println(discount("student",shirtPrice));
        //methoda degeri gönderirken degeri degil kopyasini gönderir ve degisen deger kopyasi olur.
        System.out.println(shirtPrice);//200 burasi hala 200orjinal fiyati java koruyor.
        shirtPrice=discount("veteran",shirtPrice);
        System.out.println(shirtPrice);//160
    }//main
    //Discount Methodu olusturunuz.
    public static int discount(String type,int price){
        switch(type){
            case "student":
                price=price-20;
                break;
            case "veteran":
                price=price-40;
                break;
            case "senior":
                price=price-30;
                break;
            default:
                price=price;
        }
        return price;
    }


    }


