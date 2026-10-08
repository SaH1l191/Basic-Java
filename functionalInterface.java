
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

@FunctionalInterface //compiler check telling Java
//I expect this interface to have exactly one abstract method
interface Greeting {

    void sayHello(String name);

}

//instead of this :-
// class MyGreeting implements Greeting {
//     public void sayHello(String name) {
//         System.out.println("Hello " + name);
//     }
// }
class functionalInterface {

    public static void main() {
        //lambda shorted syntax instead of having a seperate class implementing the interface
        Greeting g1 = (name) -> System.out.println("Hello, " + name);
        g1.sayHello("Alice");

        Predicate<Integer> isEven = (n) -> n % 2 == 0;
        System.out.println(isEven.test(5)); // false
        // The Predicate interface has a method called:
        // boolean test(T value)   

        //without the lambda syntax it is : 
        // Predicate<Integer> isEven = new Predicate<Integer>() {
        //     public boolean test(Integer x) {
        //         return x % 2 == 0;
        //     }
        // };
        //Function<T,R> : A Function takes one value and produces another value
        Function<Integer, Integer> doubleVal = x -> x * 2;
        System.out.println(doubleVal.apply(10));

        //Consumer<T> : A Consumer takes one value and returns nothing
        Consumer<String> print = x -> System.out.println(x);
        print.accept("Hello World!");

        // Supplier<T> : A Supplier takes no value and returns one value
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get());

    }
}

///four functional interfaces in Java
// Predicate → takes something → returns boolean
// Function  → takes something → returns something
// Consumer → takes something → returns nothing
// Supplier  → takes nothing → returns something
