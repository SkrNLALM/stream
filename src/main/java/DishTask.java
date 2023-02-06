import static java.util.Comparator.comparing;

public class DishTask {

    public static void main(String[] args) {

        System.out.println("Print all dish names that has less than 400 calories");
        StreamDish.geAll().stream()
                .filter(dish -> dish.getCalories() < 400)
                .map(dish -> dish.getName())
                .forEach(System.out::println);

        System.out.println("Print the length of the name of each dish");
        StreamDish.geAll().stream()
                .map(Dish::getName)                     //or
                .map(String::length)                    //  .map(dish -> dish.getName().length())
                .forEach(System.out::println);

        //Print three High Caloric Dish Name (>300)
        System.out.println("Print three High Caloric Dish Name (>300)");

        StreamDish.geAll().stream()
                .filter(dish -> dish.getCalories()>300)                     //or
                .map(Dish::getName)
                .limit(3)                                                    //  .map(dish -> dish.getName().length())
                .forEach(System.out::println);

        System.out.println("Print all dish names that are below 400 calories in sorted");
        StreamDish.geAll().stream()
                .filter(dish -> dish.getCalories() < 400)
                .sorted(comparing(Dish::getCalories).reversed())
                .map(Dish::getName)
                .forEach(System.out::println);

    }
}
