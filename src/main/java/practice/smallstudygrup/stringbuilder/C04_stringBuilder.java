package practice.smallstudygrup.stringbuilder;

public class C04_stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Hava bugun cok cok cok soguk");
        System.out.println(sb);
        sb.delete(11,15); //index e göre 11 dahil 15 dahil degil.
        /*
        System.out.println(sb);
        sb.deleteCharAt(sb.indexOf("o"));//burada o yu siler.
        System.out.println(sb);
        sb.delete(0,sb.length());//burada hepsini siliyor.
        System.out.println(sb);
        sb.append("1");


         */

        sb.deleteCharAt(sb.indexOf("o",sb.indexOf("o")+1));
        System.out.println(sb);//2. "o" yu sildi

    }
}
