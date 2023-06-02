package javaders.day37exceptionsenums;

public class IllegalAgeException extends RuntimeException{
    /*
    Eger Runtime Custom Exception üretmek istersek "RuntimeException Class" a extend etmeliyiz.
    */
    public IllegalAgeException(){
        super();//Bu sekilde yaparsak console a mesaj yazdirmayi düsünmüyoruz demektir.
    }
    public IllegalAgeException(String message){
        super(message);
    }
}
