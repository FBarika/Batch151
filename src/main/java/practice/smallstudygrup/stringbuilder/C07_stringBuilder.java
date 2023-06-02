package practice.smallstudygrup.stringbuilder;

public class C07_stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Java Bugun Cok Guzeldi");
        System.out.println(sb.substring(15));
        System.out.println(sb.substring(0,4));//bu String döndürürken asagidaki charSequence döndürüyor.
        System.out.println(sb.subSequence(0, 4));
        String str=sb.substring(0,4);
        System.out.println(str);
        String str1=sb.subSequence(0, 4).toString();
        System.out.println(str1);


    }
}