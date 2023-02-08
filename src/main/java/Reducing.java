import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Reducing {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4,5,3,9);
        int result = numbers.stream().reduce(0, (a,b)-> a+b);
        System.out.println(result);

        //No initial value

       Optional<Integer> result2 = numbers.stream().reduce((a,b)-> a+b);
        System.out.println(result2);

        //MAX and Min
        Optional<Integer> min = numbers.stream().reduce(Integer::min);
        Optional<Integer> max = numbers.stream().reduce(Integer::max);
        Optional<Integer> sum =numbers.stream().reduce(Integer::sum);

        System.out.println("Min:" + min.get());
        System.out.println("Max:" + max.get());
        System.out.println("Sum:" + sum.get());

        //Task

      int dishCount=  StreamDish.geAll().stream()
                .map(a->1)
                .reduce(0,(a,b)-> a+b);
        System.out.println(dishCount);

        long dcount =StreamDish.geAll()
                .stream().count();
        System.out.println(dcount);


        System.out.println("*************************");
        //Creating Infinite Streams
        Stream.iterate(0, n->n+2)
                .limit(5)
                .forEach(System.out::println);

        //TASK Fibbonaci
        Stream.iterate(0, n->n+2)
                .limit(5)
                .forEach(System.out::println);
          }
}
