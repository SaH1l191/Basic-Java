import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class streamm {
    public static void main(){
        // Example of using Java Streams
        //Stream is basically a way to take a collection and process its elements step by step.

        List<Integer> numbers = Arrays.asList(5, 2, 8, 3, 4);
        // if q  :
        //Give me the even numbers, multiply them by 2, sort them, and give me the result as a List
        //we can do this using for loop <- long code 
        //alternative we use streams :=>
        List<Integer> result = numbers.stream().filter(x->x%2==0).map(x->x*2).sorted().collect(Collectors.toList());
        //we have a Stream. we want to turn the result into a list 
        
        System.out.println(result); // Output: [4, 16]


        //other eg : numbers.stream().limit(3).collect(Collectors.toList()); //Only allow the first 3 elements through

        numbers.stream().forEach(x->System.out.print(x+" "));
        

        System.out.println("\nCount of numbers: " + numbers.stream().count());


        // Terminal operations : forEach, collect, count, reduce, min, max, findFirst, findAny
        //these when used indicate that the stream is closes as this always occur at ending 

        // Intermediate operations : filter, map, sorted, distinct, limit, skip
        // these continue the pipeline and retuns a new stream and can be chained together to form a pipeline of operations


        // streams can be used in set,map keys,   
    }
}