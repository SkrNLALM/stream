import java.sql.SQLOutput;
import java.util.Optional;

public class MatchingAndFinding {

    //ALL MATCH
    public static void main(String[] args) {
       boolean isHealty = StreamDish.geAll().stream().allMatch(dish -> dish.getCalories()<1000);
        System.out.println(isHealty);

        //ANYMATCH
        System.out.println("****************");
        if(StreamDish.geAll().stream().anyMatch(Dish::isVegetarian))
        System.out.println("The menu is vegetarin friendly");

        //NON MATCH

        System.out.println("**********************");

        boolean isHealty2=StreamDish.geAll().stream().noneMatch(dish -> dish.getCalories()>=1000);
        System.out.println(isHealty2);
        System.out.println("**********************");
        //FIND ANY
        Optional<Dish> dish=StreamDish.geAll().stream()
                .filter(Dish::isVegetarian)
                .findAny();
        System.out.println(dish.get());

        //FIND FIRST
        System.out.println("**********************");
               Optional<Dish> dish2=StreamDish.geAll().stream()
                .filter(Dish::isVegetarian)
                .findFirst();
        System.out.println(dish.get());;

    }
}
