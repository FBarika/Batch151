package javaders.day17multidimensionalarraypassbyvaluesüleymanhoca;

public class PassByValue01tekrar {
    public static void main(String[] args) {
      int shirtprice=100;
        System.out.println(discount("student", shirtprice));
        System.out.println(shirtprice);
        shirtprice=discount("veteran",shirtprice);
        System.out.println(shirtprice);


    }//main
    public static int discount(String type,int price) {
        switch (type){
            case "student":
                price = price - 20;
                break;
            case "veteran":
                price = price - 40;
                break;


        }
        return price;
    }

}//class
