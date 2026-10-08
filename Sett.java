
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

class Sett {

    public static void main() {

        Set<Integer> st = new HashSet<>(); //no duplicates
        //no order is preserved
        st.clear();
        if (st.isEmpty()) {
            System.out.println("Empty");
        }
        st.add(1);
        st.add(2);
        st.add(1);
        System.out.println(st.size());
        if (st.contains(1)) {
            System.out.println("Yes");
        }
        st.remove(1);

        //iterating over set : 
        for (int val : st) {
            System.out.println(val);
        }

        //all same methods for below ones too

        //linked hash set : insertion order is preserved
        Set<Integer> lst = new LinkedHashSet<>();

        //sorted set : elements are sorted in ascending order
        Set<Integer> set = new TreeSet<>();

    }
}
