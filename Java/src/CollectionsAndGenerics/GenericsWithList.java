package CollectionsAndGenerics;

import java.util.ArrayList;
import java.util.List;

public class GenericsWithList {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<Integer>();
        values.add(4);
        values.add(6);
        values.add(2);

        for (Integer o: values){
            System.out.println(o);
        }
    }
}
