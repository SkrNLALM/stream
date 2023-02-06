import java.util.Arrays;
import java.util.List;

public class StreamOperations {

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,20,30,40,30,51,31,25,22,15);
        myList.forEach(System.out::println);   // or  filter.forEach(x-> System.out.println(x));

        //FILTER
        System.out.println("FILTER");
        myList.stream()
                .filter(i->i%3==0)
                .distinct()
                .forEach(System.out::println);

        //LIMIT
        System.out.println("LIMIT");
        myList.stream()
                .filter(i->i%3==0)
                .limit(1)
                .forEach(System.out::println);

        //SKIP
        System.out.println("SKIP");
        myList.stream()
                .filter(i->i%3==0)
                .skip(3)
                .forEach(System.out::println);

        //MAP
        System.out.println("MAP");
        myList.stream()
                .map(number-> number*2)
                .filter(i->i%3==0)
                .forEach(System.out::println);

        List<String> words =Arrays.asList("JAVA","APPLE","HONDA","DEVELOPER");
        System.out.println("number of Characters");
        words.stream()
                .map(w-> w.length())   // .map(String::length)
                .forEach(System.out::println);
    }




}
