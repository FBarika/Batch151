package javaders.day43lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {
       Course turkishDay = new Course("Turkish Daytime QA",213,"Spring",97);
       Course turkishNight = new Course("Turkish Nighttime QA",245,"Winter",98);
       Course englishDay = new Course("English Daytime Java Dev",121,"Spring",91);
       Course englishNight = new Course("English Nighttime Java Dev",137,"Winter",95);

        List<Course> courseList= new ArrayList<>();

        courseList.add(turkishDay);
        courseList.add(turkishNight);
        courseList.add(englishDay);
        courseList.add(englishNight);

        System.out.println(isAvgScoreGreaterThanANumber(courseList,90));//true
        System.out.println(isAnyCourseNameContainsQa(courseList, "QA"));
        System.out.println(getCourseNamesWhoseAvgMax(courseList));//Turkish Nighttime QA
        System.out.println(getCourseBetterThanLastTwo(courseList));//[Course{courseName='Turkish Daytime QA', numOfStudents=213, season='Spring', averageScore=97.0}, Course{courseName='Turkish Nighttime QA', numOfStudents=245, season='Winter', averageScore=98.0}]
        System.out.println(getCourseWhoseRegisteredStdLessThanANumber(courseList, 150));//[Course{courseName='English Daytime Java Dev', numOfStudents=121, season='Spring', averageScore=91.0}, Course{courseName='English Nighttime Java Dev', numOfStudents=137, season='Winter', averageScore=95.0}]

    }
    //Example 1: Tüm average score'larin 90 dan büyük olup olmadigini kontrol eden methodu olusturunuz.
    public static boolean isAvgScoreGreaterThanANumber(List<Course> courseList,int avg){
       return courseList.stream().allMatch(t->t.getAverageScore()>avg);
    }

    //Example 2: En az bir kurs isminin QA icerip icermedigini kontrol eden methodu olusturunuz.
    public static boolean isAnyCourseNameContainsQa(List<Course> courseList, String word){
      return  courseList.stream().anyMatch(t->t.getCourseName().contains(word));

    }
    //Example 3: En yüksek average score a sahip kurs ismini veren code u yaziniz.
    public static String getCourseNamesWhoseAvgMax(List<Course> courseList){
     Course course= courseList.stream().sorted(Comparator.comparing(Course::getAverageScore).reversed()).findFirst().get();
     return course.getCourseName();//burada sadece isim istedigi icin getCourseName ile ismi cagirdik.
    }

    //Example 4: Average score'u en düsük olan ilk iki course disindaki tüm kurslari return eden methodu olusturunuz.
    public static List<Course> getCourseBetterThanLastTwo(List<Course> courseList){
      return  courseList.stream().sorted(Comparator.comparing(Course ::getAverageScore)).skip(2).collect(Collectors.toList());
      //skip() methodu ile istedigimiz kadari es gecebiliriz.
    }

    //Example 5: Average score'u üstten ücüncü olan kursu return eden methodu olusturunuz.
    public static Course getHighestThird(List<Course> courseList){
      return  courseList.
              stream().
              sorted(Comparator.comparing(Course::getAverageScore).reversed()).
              skip(2).
              limit(1).//eger limit(2) yapsaydik geri kalanlarin 2 sini al demektir biz 3. istedigimiz icin skip(1) yaptik.
              collect(Collectors.toList()).get(0);
    }
    //Example 6: Ögrenci sayisi 150'den az olan kurslari return eden methodu olusturunuz.

    public static List<Course> getCourseWhoseRegisteredStdLessThanANumber(List<Course> courseList,int numOfStd){
      return   courseList.stream().filter(t-> t.getNumOfStudents()<numOfStd).collect(Collectors.toList());
    }
}
