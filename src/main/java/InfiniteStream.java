import java.util.stream.Stream;

public class InfiniteStream {

    public static void main(String[] args) {
        Stream.iterate(0,n->n+2)
                .limit(5)
                .forEach(System.out::println);


        System.out.println("************");

        //Fibonacci series problem
        //How does it work? iterate needs a lambda to specify the successer element
        //In the case of the tuple (3,5) the successor (5, 3+5)=(5,8)
        Stream.iterate(new int[]{0,1}, t-> new int [] {t[1], t[0]+t[1]})
        .limit(8)
                .forEach(t-> System.out.println("("+ t[0] +","+t[1] +")" ));

        Stream.iterate(new int[]{0,1}, t-> new int [] {t[1], t[0]+t[1]})
                .limit(8)
                .map(t->t[0])
                .forEach(System.out::println);
    }
}
