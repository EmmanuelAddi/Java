package CollectionsAndGenerics;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {
    public static void main(String[] args) {
      //  Set<Integer> values = new TreeSet<>();
        Set<Integer> values = new HashSet<>();

        values.add(4);
        values.add(6);
        values.add(6);
        values.add(8);
        values.add(2);

        for (int i : values){
            System.out.println(i);
        }
    }
}
