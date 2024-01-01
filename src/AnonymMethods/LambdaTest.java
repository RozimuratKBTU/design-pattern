package AnonymMethods;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class LambdaTest {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        List<String> stringList = new ArrayList<>();

        list.add("a");
        stringList.add("d");
        list.add("w");
        stringList.add("qw");

        Stream<String> s = list.stream();
        s.forEach(System.out::println);
        List<String> numberStrings = List.of("1","2","3");
        Stream<Integer> num = numberStrings.stream().map(Integer::parseInt);
        num.forEach(System.out::println);


        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


        Predicate<Integer> predicate = x -> x > 5;
        System.out.println(predicate.test(3));
        Runnable runnable = () -> System.out.println("Ho");
        runnable.run();
        BiFunction<Integer,Integer,Integer> add1 =  (a,b) -> a+b;
        BinaryOperator<Integer> add = (a, b) -> a + b;
        System.out.println(add.apply(3,2));
        int sum  = add1.apply(4,6);
        System.out.println(sum);
    }
}
