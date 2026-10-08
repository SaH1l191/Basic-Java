
import java.util.ArrayList;
import java.util.List;

class arrayy {

    public static void main() {
        int[] arr = new int[4];
        int[] numbers = {10, 20, 30};

        //List  
        List<Integer> k = new ArrayList<>();
        k.clear();
        System.out.println(k.isEmpty());
        System.out.println(k.size());

        k.add(1);
        k.add(2);
        k.add(3);
        k.add(4);

        System.out.println(k.get(3)); //get at index
        System.out.println(k.contains(3)); //check if el presenet
        k.set(2, 5); //set at index 2 value 5
        k.remove(1); //remove at index 1
        
        System.out.println(k.indexOf(5)); //get index of value 5

        for(int val : k) {
            System.out.print(val+" ");
        }

    }
}
