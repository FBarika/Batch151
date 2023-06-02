package practice.smallstudygrup.multidimensionalarray;

public class C02_mda {
    public static void main(String[] args) {
        /*
        soru 2) verilen bir multi-dimensional array in
        tum elementlerini yazdiran bir method olusturun
        */
        String isimler[][]={{"Ali","Veli","Can","Ahmet"},{"Azra","Umut","Ayse","Zehra"},{"Ankara","Mardin"}};
        elementYazdir(isimler);


    }

    public static void elementYazdir(String[][] isimler) {
        for (String[]w:isimler
        ) {
            for (String a:w
            ) {
                System.out.println(a);
            }
            System.out.println("--------------------------------------");

        }


    }
}
