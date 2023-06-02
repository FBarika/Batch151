package practice.b151practices.day09practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_List {
    public static void main(String[] args) {

        /*
    Bir list olusturunuz. 1'den 15'e kadar sayıları bu liste ekleyiniz.
    Daha sonra 10'dan buyuk olan tum elemanları 2 katına cıkarınız
    */

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15));
        //List<Integer> myList = new ArrayList<>(List.of(1, 2, 3, 4, 5.... bu sekilde eleman ekleme yaparsak set() methodunu kullanamiyoruz.
        /*2.yol eleman ekleme
        for (int i = 1; i <16 ; i++) {
            numbers.add(i);
        }

         */
        System.out.println(numbers);
        for (int j = 0; j <numbers.size() ; j++) {
            if(numbers.get(j)>10){
                numbers.set(j,numbers.get(j)*2);
            }
        }
        System.out.println(numbers);

        for (int w:numbers) {
            if(w>10){
                numbers.set(numbers.indexOf(w),w*2);
            }
        }
        System.out.println(numbers);//foreach ile cözüm































    }
}
