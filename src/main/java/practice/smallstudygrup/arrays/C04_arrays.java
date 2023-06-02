package practice.smallstudygrup.arrays;

public class C04_arrays {
    /*
    7.soru -Verilen bir array'in istenen bir elemani icerip icermedigini kontrol edip, bize
true veya false sonucu donen bir method olusturun.
     */
    public static void main(String[] args) {
        String isimler [] ={"Ali","Ayse","Veli"};

        varMi(isimler,"Ali");

        int sayilar [] ={1,2,3,4};

        boolean sonuc = yokMu(sayilar,4);
        System.out.println(sonuc);


    }

    public static void varMi(String s [] ,String k){

        int counter=0;
        for (String w:s) {
            if(w.equalsIgnoreCase(k)){
                counter++;
            }
        }
        if(counter>0){
            System.out.println(true);
        }else if (counter==0){
            System.out.println(false);
        }
    }

    public static boolean yokMu(int [] a, int b){
        for (int w:a) {
            if(w==b){
                return true;
            }
        }
        return false;
    }
}
