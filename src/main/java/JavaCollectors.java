import java.util.*;
import java.util.stream.Collectors;

public class JavaCollectors {

    public static void main(String[] args) {

        List<Integer> numbers= Arrays.asList(3,4,5,6,6,7);
        //toCollection(Supplier) : is used to create a collection using collector
        System.out.println("********TOCOLLECTION()***********");
       List<Integer> numberlist= numbers.stream()
                .filter(x->x%2==0)
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(numberlist);

      Set<Integer> numberSet=  numbers.stream()
                .filter(x->x%2==0)
                .collect(Collectors.toCollection(HashSet::new));
        System.out.println(numberSet);

        //toList() : returns a Collector interface that gathers the input data into a new list
        System.out.println("********TOLIST()***********");

        List<Integer> numberlist2= numbers.stream()
                .filter(x->x%2==0)
                .collect(Collectors.toList());
        System.out.println(numberlist2);

        //toSet() : returns a Collector interface that gathers the input data into a new set
        System.out.println("********TOSet()***********");

        Set<Integer> numberset= numbers.stream()
                .filter(x->x%2==0)
                .collect(Collectors.toSet());
        System.out.println(numberset);

        //toMap(Function, Function)  : returns a Collector interface that gather the input dat into a new mapS
        System.out.println("********TOMap()***********");
      Map<String, Integer> dishMap= StreamDish.geAll().stream()
                .collect(Collectors.toMap(Dish::getName,Dish::getCalories));

        System.out.println(dishMap);

        //counting (): returns a collector that count the number of the elements

        System.out.println("********Counting()***********");
        Long eventCount=numbers.stream()
                .filter(x->x%2==0)
                .collect(Collectors.counting());
        System.out.println(eventCount);

        //summingInt(ToIntFunction)  : returns a collector that produces the sum of a integer-valued func

        Integer sum= StreamDish.geAll().stream()
                .collect(Collectors.summingInt(Dish::getCalories));
        System.out.println(sum);

        //avaragingInt(ToIntFunction) : returns the avarage of the integers passed values
        System.out.println("********averagingInt()***********");
        Double caloriesAvr= StreamDish.geAll().stream()
                .collect(Collectors.averagingInt(Dish::getCalories));
        System.out.println(caloriesAvr);

        //joining() : is used to join various elements or character of string array into a songle string object
        System.out.println("********joining()***********");
        List<String> courses =Arrays.asList("Java", "JS", "TS");
        String str=courses.stream()
                .collect(Collectors.joining(", "));
        System.out.println(courses);

        //partioningBy() : is used to partition a stream of objects (or set of elements) based on a given predicate

        System.out.println("********partitioning()***********");
        Map<Boolean, List<Dish>> veggieDish=StreamDish.geAll().stream()
                .collect(Collectors.partitioningBy(Dish::isVegetarian));

        System.out.println(veggieDish);

        //groupingBy(): is used for grouping objects by some property and stroing resuls in a map instance
        Map<Type,List<Dish>> dishType=StreamDish.geAll().stream()
                .collect(Collectors.groupingBy(Dish::getType));
        System.out.println(dishType);


    }
}
